package com.github.sdtool.statelesscaptcha.token;

/**
 * JWT Token (JWS) representation of Captcha, with base64 encoded image
 *
 * @author <a href="mailto:subhajitdas298@gmail.com">Subhajit Das</a>
 */
public class CaptchaToken {

    /**
     * Base 64 encoded image
     */
    private String base64Image;

    /**
     * Base 64 image extension
     */
    private String base64ImageExtension;

    /**
     * Base 64 encoded image
     */
    private String base64Audio;

    /**
     * Base 64 image extension
     */
    private String base64AudioExtension;

    /**
     * JWT token for the captcha
     */
    private String captchaToken;

    public CaptchaToken() {
    }

    public CaptchaToken(String base64Image, String base64ImageExtension,
                        String base64Audio, String base64AudioExtension,
                        String captchaToken) {
        this.base64Image = base64Image;
        this.base64ImageExtension = base64ImageExtension;
        this.base64Audio = base64Audio;
        this.base64AudioExtension = base64AudioExtension;
        this.captchaToken = captchaToken;
    }

    public String getBase64Image() {
        return base64Image;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }

    public String getBase64ImageExtension() {
        return base64ImageExtension;
    }

    public void setBase64ImageExtension(String base64ImageExtension) {
        this.base64ImageExtension = base64ImageExtension;
    }

    public String getBase64Audio() {
        return base64Audio;
    }

    public void setBase64Audio(String base64Audio) {
        this.base64Audio = base64Audio;
    }

    public String getBase64AudioExtension() {
        return base64AudioExtension;
    }

    public void setBase64AudioExtension(String base64AudioExtension) {
        this.base64AudioExtension = base64AudioExtension;
    }

    public String getCaptchaToken() {
        return captchaToken;
    }

    public void setCaptchaToken(String captchaToken) {
        this.captchaToken = captchaToken;
    }

    @Override
    public String toString() {
        return "CaptchaToken{" +
                "base64Image='" + base64Image + '\'' +
                ", base64ImageExtension='" + base64ImageExtension + '\'' +
                ", captchaToken='" + captchaToken + '\'' +
                '}';
    }
}
