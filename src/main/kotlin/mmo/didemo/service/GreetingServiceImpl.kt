package mmo.didemo.service

import org.springframework.stereotype.Service

@Service
class GreetingServiceImpl : GreetingService {

    override fun sayGreeting(): String {
        return HELLO_GURUS
    }

    companion object {

        val HELLO_GURUS = "Hello Gurus!!!!"
    }
}

