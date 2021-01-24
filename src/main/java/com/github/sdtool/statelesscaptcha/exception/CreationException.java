package com.github.sdtool.statelesscaptcha.exception;

/**
 * Token creation exception
 *
 * @author <a href="mailto:subhajitdas298@gmail.com">Subhajit Das</a>
 */
public class CreationException extends RuntimeException {

    /**
     * Constructor
     *
     * @param message the exception message
     */
    public CreationException(String message) {
        super(message);
    }

}
