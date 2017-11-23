package mmo.didemo.service

import org.springframework.context.annotation.Primary
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("pl")
@Primary
class PrimaryPolishGreetingService : GreetingService {

    override fun sayGreeting(): String {
        return "Polski serwis"
    }
}