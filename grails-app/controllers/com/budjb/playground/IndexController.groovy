package com.budjb.playground

class IndexController {
    def index() {
        // Create the client
        ExampleClient exampleClient = new ExampleClientImpl()

        // Set HttpClient properties
        exampleClient.setLog(true)
        exampleClient.setValidateSsl(true)

        // Set user/pass properties
        exampleClient.setUser('foo')
        exampleClient.setPassword('bar')

        // Call a method defined for the client
        render exampleClient.getSomething()
    }
}
