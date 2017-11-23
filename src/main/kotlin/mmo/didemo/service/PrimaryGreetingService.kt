package mmo.didemo.service

import org.springframework.context.annotation.Primary
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Primary
@Profile("en")
//@Profile({"en", "default"})//nie wiem czemu nie działa
class PrimaryGreetingService : GreetingService {

    override fun sayGreeting(): String {
        return "Hello from primary service"
    }
}