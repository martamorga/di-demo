package mmo.didemo.controllers

import mmo.didemo.service.GreetingService
import mmo.didemo.service.GreetingServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class PropertyInjectedController {

    @Autowired
    lateinit var greetingService: GreetingServiceImpl

    fun sayHello(): String {
        return greetingService!!.sayGreeting()
    }

}