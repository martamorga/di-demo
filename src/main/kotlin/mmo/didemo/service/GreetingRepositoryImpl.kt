package mmo.didemo.service

import org.springframework.stereotype.Component

@Component
class GreetingRepositoryImpl : GreetingRepository {

    override fun getEnglishGreeting(): String {
        return "Hello - Primary Greeting service"
    }

    override fun getSpanishGreeting(): String {
        return "Servicio de Saludo Primario"
    }

    override fun getGermanGreeting(): String {

        return "Primärer Grußdienst"

    }


}