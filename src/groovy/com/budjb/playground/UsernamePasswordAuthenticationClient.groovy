package com.budjb.playground

/**
 * An interface that defines methods to set username/password credentials for HTTP requests.
 */
interface UsernamePasswordAuthenticationClient {
    /**
     * Returns the user to use for HTTP requests.
     *
     * @return
     */
    String getUser()

    /**
     * Sets the user to use for HTTP requests.
     *
     * @param user
     */
    void setUser(String user)

    /**
     * Returns the password to use for HTTP requests.
     *
     * @return
     */
    String getPassword()

    /**
     * Sets the password to use for HTTP requests.
     *
     * @param password
     */
    void setPassword(String password)
}