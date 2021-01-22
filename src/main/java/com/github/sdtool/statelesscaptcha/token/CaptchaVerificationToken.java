package com.github.sdtool.statelesscaptcha.token;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Token verification model
 *
 * @author <a href="mailto:subhajitdas298@gmail.com">Subhajit Das</a>
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CaptchaVerificationToken {

    /**
     * JWT token for the captcha
     */
    private String captchaToken;

    /**
     * Captcha to verify
     */
    private String captcha;

}
