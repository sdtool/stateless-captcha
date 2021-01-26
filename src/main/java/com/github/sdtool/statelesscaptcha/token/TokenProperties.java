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
 * The token properties
 *
 * @author <a href="mailto:subhajitdas298@gmail.com">Subhajit Das</a>
 */
public class TokenProperties {

    /**
     * The issuer of token
     */
    private String issuer = "sdtool";

    /**
     * The validity of token in seconds
     */
    private long validity = 30;

    /**
     * Default constructor
     */
    public TokenProperties() {
    }

    /**
     * Constructor with customized issuer and validity
     *
     * @param issuer   the issuer name
     * @param validity the validity in seconds
     */
    public TokenProperties(String issuer, long validity) {
        this.issuer = issuer;
        this.validity = validity;
    }

    /**
     * Gets the issuer
     *
     * @return the issuer
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Sets the issuer
     *
     * @param issuer the issuer
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * Gets the validity in seconds
     *
     * @return the validity in seconds
     */
    public long getValidity() {
        return validity;
    }

    /**
     * Sets the validity
     *
     * @param validity the validity in seconds
     */
    public void setValidity(long validity) {
        this.validity = validity;
    }

    /**
     * To String
     *
     * @return the string representation of the token properties
     */
    @Override
    public String toString() {
        return "TokenProperties{" +
                "issuer='" + issuer + '\'' +
                ", validity=" + validity +
                '}';
    }

}
