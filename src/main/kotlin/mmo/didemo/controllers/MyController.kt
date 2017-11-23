package mmo.didemo.controllers

import mmo.didemo.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class MyController {

    @Autowired
    private lateinit var greetingService: GreetingService

    fun hello(): String {
        println("Hello!!! ")

        return greetingService.sayGreeting()
    }
}

