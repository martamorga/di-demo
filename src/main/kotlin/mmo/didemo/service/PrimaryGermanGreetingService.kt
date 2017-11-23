package mmo.didemo.service

import org.springframework.context.annotation.Primary
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Primary
@Profile("de")
class PrimaryGermanGreetingService : GreetingService {

    override fun sayGreeting(): String {
        return "Iś hajze Marta ;) - pozdro z profilu niemieckiego"
    }
}