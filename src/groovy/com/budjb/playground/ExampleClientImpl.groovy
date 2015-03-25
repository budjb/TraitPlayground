package com.budjb.playground

/**
 * An example client implementation that includes username/password authentication
 * and optional HTTP conversation logging and SSL validation configuration options.
 */
class ExampleClientImpl implements ExampleClient, UsernamePasswordAuthenticationClientTrait, HttpClientTrait {
    /**
     * Returns something.
     *
     * @return
     */
    @Override
    String getSomething() {
        return "foobar"
    }

    /**
     * Does something.
     */
    @Override
    void doSomething() {
        println "hi!"
    }
}
