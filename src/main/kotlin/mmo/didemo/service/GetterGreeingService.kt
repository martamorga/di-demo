package mmo.didemo.service

import org.springframework.stereotype.Service

@Service
class GetterGreeingService : GreetingService {

    override fun sayGreeting(): String {
        return "czesc - zostalem wstrzykniety przez gettera"
    }
}