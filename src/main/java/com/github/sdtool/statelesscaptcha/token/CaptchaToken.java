package com.github.sdtool.statelesscaptcha.token;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * JWT Token (JWS) representation of Captcha, with base64 encoded image
 *
 * @author <a href="mailto:subhajitdas298@gmail.com">Subhajit Das</a>
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CaptchaToken {

    /**
     * Base 64 encoded data
     */
    private String data;

    /**
     * Base 64 data file extension
     */
    private String extension;

    /**
     * JWT token for the captcha
     */
    private String token;

}
