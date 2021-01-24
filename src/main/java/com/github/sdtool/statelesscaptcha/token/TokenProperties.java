package com.github.sdtool.statelesscaptcha.token;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The token properties
 *
 * @author <a href="mailto:subhajitdas298@gmail.com">Subhajit Das</a>
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TokenProperties {

    /**
     * The issuer of token
     */
    private String issuer = "sdtool";

    /**
     * The validity of token in seconds
     */
    private long validity = 30;

}
