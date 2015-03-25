package com.budjb.playground

/**
 * A trait that defines methods to set username/password credentials for HTTP requests.
 */
trait UsernamePasswordAuthenticationClientTrait implements UsernamePasswordAuthenticationClient {
    /**
     * User to authenticate an HTTP request with.
     */
    private String user

    /**
     * Password to authenticate an HTTP request with.
     */
    private String password

    /**
     * Returns the user to authenticate an HTTP request with.
     *
     * @return
     */
    @Override
    String getUser() {
        return user
    }

    /**
     * Sets the user to authenticate an HTTP request with.
     *
     * @param user
     */
    @Override
    void setUser(String user) {
        this.user = user
    }

    /**
     * Returns the password to authenticate an HTTP request with.
     *
     * @return
     */
    @Override
    String getPassword() {
        return password
    }

    /**
     * Sets the password to authenticate an HTTP request with.
     *
     * @param password
     */
    @Override
    void setPassword(String password) {
        this.password = password
    }
}