package com.budjb.playground

/**
 * Defines an interface of common properties of an HTTP client.
 */
interface HttpClient {
    /**
     * Returns whether the request should be logged.
     *
     * @return
     */
    boolean getLog()

    /**
     * Sets whether the request should be logged.
     *
     * @param log
     */
    void setLog(boolean log)

    /**
     * Returns whether the request should validate SSL certificates.
     *
     * @return
     */
    boolean getValidateSsl()

    /**
     * Sets whether the request should validate SSL certificates.
     *
     * @param validateSsl
     */
    void setValidateSsl(boolean validateSsl)
}
