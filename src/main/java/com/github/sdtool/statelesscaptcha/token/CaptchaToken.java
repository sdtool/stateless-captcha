/*
 *    Copyright 2021 Subhajit Das
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
 * JWT Token (JWS) representation of Captcha, with base64 encoded image
 *
 * @author <a href="mailto:subhajitdas298@gmail.com">Subhajit Das</a>
 */
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

    /**
     * Default constructor
     */
    public CaptchaToken() {
    }

    /**
     * Constructor with customized data, extension and token
     *
     * @param data      the base 64 data
     * @param extension the data's file extension
     * @param token     the token
     */
    public CaptchaToken(String data, String extension, String token) {
        this.data = data;
        this.extension = extension;
        this.token = token;
    }

    /**
     * Gets the data
     *
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the data
     *
     * @param data the data
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Gets the extension
     *
     * @return the extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the extension
     *
     * @param extension the extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
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
     * To String
     *
     * @return the string representation of the token
     */
    @Override
    public String toString() {
        return "CaptchaToken{" +
                "data='" + data + '\'' +
                ", extension='" + extension + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

}
