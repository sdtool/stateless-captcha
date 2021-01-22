package com.github.sdtool.statelesscaptcha.token;

/**
 * Token verification model
 *
 * @author <a href="mailto:subhajitdas298@gmail.com">Subhajit Das</a>
 */
public class CaptchaVerificationToken {

    /**
     * JWT token for the captcha
     */
    private String captchaToken;

    /**
     * Captcha to verify
     */
    private String captcha;

    public CaptchaVerificationToken() {
    }

    public CaptchaVerificationToken(String captchaToken, String captcha) {
        this.captchaToken = captchaToken;
        this.captcha = captcha;
    }

    public String getCaptchaToken() {
        return captchaToken;
    }

    public void setCaptchaToken(String captchaToken) {
        this.captchaToken = captchaToken;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    @Override
    public String toString() {
        return "CaptchaTokenVerification{" +
                "captchaToken='" + captchaToken + '\'' +
                ", captcha='" + captcha + '\'' +
                '}';
    }

}
