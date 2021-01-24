package com.github.sdtool.statelesscaptcha.exception;

/**
 * Verification failed exception
 *
 * @author <a href="mailto:subhajitdas298@gmail.com">Subhajit Das</a>
 */
public class VerificationException extends RuntimeException {

    /**
     * Constructor
     *
     * @param message the exception message
     */
    public VerificationException(String message) {
        super(message);
    }

}
