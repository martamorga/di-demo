package mmo.didemo.service

import org.springframework.stereotype.Service

@Service
class ConstructorGreetingService : GreetingService {

    override fun sayGreeting(): String {
        return "czesc - zostalem wstrzykniety przez konstruktor"
    }
}