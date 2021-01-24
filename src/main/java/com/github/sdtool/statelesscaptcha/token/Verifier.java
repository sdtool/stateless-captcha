package com.github.sdtool.statelesscaptcha.token;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.github.sdtool.statelesscaptcha.exception.VerificationException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The token verifier
 *
 * @author <a href="mailto:subhajitdas298@gmail.com">Subhajit Das</a>
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Verifier {

    /**
     * The token properties
     * Initiated to default
     */
    private TokenProperties properties = new TokenProperties();

    /**
     * Verify captcha
     *
     * @param verification the verification token model
     */
    public void verifyToken(CaptchaVerificationToken verification) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(verification.getCaptcha());
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer(properties.getIssuer())
                    .build();
            verifier.verify(verification.getToken());
        } catch (JWTVerificationException exception) {
            throw new VerificationException(exception.getMessage());
        }
    }

}
