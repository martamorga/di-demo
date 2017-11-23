package mmo.didemo

import mmo.didemo.controllers.ConstructorInjectedController
import mmo.didemo.controllers.GetterInjectedController
import mmo.didemo.controllers.MyController
import mmo.didemo.controllers.PropertyInjectedController
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DiDemoApplication

fun main(args: Array<String>) {
    val ctx = SpringApplication.run(DiDemoApplication::class.java, *args)

    val controller = ctx.getBean("myController") as MyController

    controller.hello()
    System.out.println(ctx.getBean(PropertyInjectedController::class.java).sayHello())
    System.out.println(ctx.getBean(GetterInjectedController::class.java).sayHello())
    System.out.println(ctx.getBean(ConstructorInjectedController::class.java).sayHello())

}
