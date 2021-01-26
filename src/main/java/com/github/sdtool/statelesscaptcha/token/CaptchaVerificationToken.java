/*
 * Copyright 2021 Subhajit Das
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

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
    private String token;

    /**
     * Captcha to verify
     */
    private String captcha;

    /**
     * Default constructor
     */
    public CaptchaVerificationToken() {
    }

    /**
     * Constructor with customized token and captcha
     *
     * @param token   the token
     * @param captcha the captcha to verify
     */
    public CaptchaVerificationToken(String token, String captcha) {
        this.token = token;
        this.captcha = captcha;
    }

    /**
     * Gets the token
     *
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the token
     *
     * @param token the token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Gets the captcha
     *
     * @return the captcha
     */
    public String getCaptcha() {
        return captcha;
    }

    /**
     * Sets the captcha
     *
     * @param captcha the captcha
     */
    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    /**
     * To String
     *
     * @return the string representation of the verification token
     */
    @Override
    public String toString() {
        return "CaptchaVerificationToken{" +
                "token='" + token + '\'' +
                ", captcha='" + captcha + '\'' +
                '}';
    }

}
