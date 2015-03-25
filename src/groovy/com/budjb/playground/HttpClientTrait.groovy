package com.budjb.playground

/**
 * A trait that implements basic common attributes of an HTTP request.
 */
trait HttpClientTrait implements HttpClient {
    /**
     * Whether to log the request.
     */
    private boolean log

    /**
     * Whether to validate SSL certificates.
     */
    private boolean validateSsl

    /**
     * Returns whether to log the request.
     *
     * @return
     */
    @Override
    boolean getLog() {
        return log
    }

    /**
     * Sets whether to log the request.
     *
     * @param log
     */
    @Override
    void setLog(boolean log) {
        this.log = log
    }

    /**
     * Returns whether to validate SSL certificates.
     *
     * @return
     */
    @Override
    boolean getValidateSsl() {
        return validateSsl
    }

    /**
     * Sets whether to validate SSL certificates.
     *
     * @param validateSsl
     */
    @Override
    void setValidateSsl(boolean validateSsl) {
        this.validateSsl = validateSsl
    }
}
