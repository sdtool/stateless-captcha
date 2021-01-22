package com.github.sdtool.statelesscaptcha;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.github.sdtool.statelesscaptcha.audio.AudioCaptcha;
import com.github.sdtool.statelesscaptcha.token.CaptchaToken;
import com.github.sdtool.statelesscaptcha.token.CaptchaVerificationToken;
import com.github.sdtool.statelesscaptcha.util.Base64Util;

import javax.sound.sampled.AudioFileFormat;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * JWT Token (JWS) Builder for Captcha, with base64 encoded image
 *
 * @author <a href="mailto:subhajitdas298@gmail.com">Subhajit Das</a>
 */
public class CaptchaTokenManager {

    private String issuer;

    private long validity;

    public CaptchaTokenManager() {
        this.issuer = "stateless-captcha";
        this.validity = 30;
    }

    public CaptchaTokenManager(long validity) {
        this();
        this.validity = validity;
    }

    public CaptchaTokenManager(String issuer, long validity) {
        this.issuer = issuer;
        this.validity = validity;
    }

    /**
     * Generate token representation
     *
     * @param captcha the captcha to convert
     * @return the token model
     */
    public CaptchaToken buildToken(Captcha captcha) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(captcha.getAnswer());
            Date in = new Date();
            LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault())
                    .plusSeconds(validity);
            Date out = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
            String token = JWT.create()
                    .withExpiresAt(out)
                    .withIssuer(issuer)
                    .sign(algorithm);
            return new CaptchaToken(
                    Base64Util.encodeBufferedImageToString(captcha.getImage(), "png"),
                    "png",
                    token);
        } catch (JWTCreationException | IllegalArgumentException | IOException exception) {
            //Invalid Signing configuration / Couldn't convert Claims.
            throw new IllegalArgumentException("Unable to create token");
        }
    }

    /**
     * Generate token representation
     *
     * @param captcha the captcha to convert
     * @return the token model
     */
    public CaptchaToken buildToken(AudioCaptcha captcha) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(captcha.getAnswer());
            Date in = new Date();
            LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault())
                    .plusSeconds(validity);
            Date out = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
            String token = JWT.create()
                    .withExpiresAt(out)
                    .withIssuer(issuer)
                    .sign(algorithm);
            return new CaptchaToken(
                    Base64Util.encodeAudioInputStreamToString(captcha.getChallenge().getAudioInputStream(),
                            AudioFileFormat.Type.WAVE),
                    "wav",
                    token);
        } catch (JWTCreationException | IllegalArgumentException | IOException exception) {
            //Invalid Signing configuration / Couldn't convert Claims.
            throw new IllegalArgumentException("Unable to create token");
        }
    }

    /**
     * Verify captcha
     *
     * @param verification the verification model
     * @return whether verified or not
     */
    public boolean verifyToken(CaptchaVerificationToken verification) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(verification.getCaptcha());
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer(issuer)
                    .build();
            verifier.verify(verification.getCaptchaToken());
            return true;
        } catch (JWTVerificationException exception) {
            return false;
        }
    }

}
