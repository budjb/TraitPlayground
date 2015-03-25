package com.budjb.playground

/**
 * An example client interface that includes username/password authentication
 * and optional HTTP conversation logging and SSL validation configuration options.
 */
interface ExampleClient  extends HttpClient, UsernamePasswordAuthenticationClient {
    /**
     * Returns something.
     *
     * @return
     */
    String getSomething()

    /**
     * Does something.
     */
    void doSomething()
}