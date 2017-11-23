package mmo.didemo.controllers

import mmo.didemo.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class ConstructorInjectedController {

    @Autowired
    lateinit var greetingService: GreetingService

    fun sayHello(): String {
        return greetingService.sayGreeting()
    }
}