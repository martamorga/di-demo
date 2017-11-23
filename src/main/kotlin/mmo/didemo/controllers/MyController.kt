package mmo.didemo.controllers

import mmo.didemo.service.GreetingService
import org.springframework.stereotype.Controller

@Controller
class MyController {

    fun hello(): String {
        println("Hello!!! ")

        return "foo"
    }
}

