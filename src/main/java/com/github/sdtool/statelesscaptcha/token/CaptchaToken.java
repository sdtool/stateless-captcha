package com.github.sdtool.statelesscaptcha.token;

/**
 * JWT Token (JWS) representation of Captcha, with base64 encoded image
 *
 * @author <a href="mailto:subhajitdas298@gmail.com">Subhajit Das</a>
 */
public class CaptchaToken {

    /**
     * Base 64 encoded data
     */
    private String base64Data;

    /**
     * Base 64 data file extension
     */
    private String base64DataFileExtension;

    /**
     * JWT token for the captcha
     */
    private String captchaToken;

    public CaptchaToken() {
    }

    public CaptchaToken(String base64Data, String base64DataFileExtension, String captchaToken) {
        this.base64Data = base64Data;
        this.base64DataFileExtension = base64DataFileExtension;
        this.captchaToken = captchaToken;
    }

    public String getBase64Data() {
        return base64Data;
    }

    public void setBase64Data(String base64Data) {
        this.base64Data = base64Data;
    }

    public String getBase64DataFileExtension() {
        return base64DataFileExtension;
    }

    public void setBase64DataFileExtension(String base64DataFileExtension) {
        this.base64DataFileExtension = base64DataFileExtension;
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
                "base64Image='" + base64Data + '\'' +
                ", base64ImageExtension='" + base64DataFileExtension + '\'' +
                ", captchaToken='" + captchaToken + '\'' +
                '}';
    }
}
