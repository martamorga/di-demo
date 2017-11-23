package mmo.didemo.controllers

import mmo.didemo.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class GetterInjectedController {

    @Autowired
    @Qualifier("getterGreeingService")
    private lateinit var greetingService: GreetingService

    fun sayHello(): String {
        return greetingService.sayGreeting()
    }
}
