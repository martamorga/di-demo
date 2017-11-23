package mmo.didemo.service

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Service
@Primary
class PrimaryGreetingService : GreetingService {

    override fun sayGreeting(): String {
        return "czesc - glowny witajacy serwis"
    }
}