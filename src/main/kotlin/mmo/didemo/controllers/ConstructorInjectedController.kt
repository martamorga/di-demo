package mmo.didemo.controllers

import mmo.didemo.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class ConstructorInjectedController {

    @Autowired
    @Qualifier("constructorGreetingService")
    lateinit var greetingService: GreetingService

    fun sayHello(): String = greetingService.sayGreeting()
}