package mmo.didemo.service

interface GreetingRepository {

    fun getEnglishGreeting(): String

    fun getSpanishGreeting(): String

    fun getGermanGreeting(): String
}
