package me.cyberdie22.starltlc

import com.github.ajalt.clikt.core.CliktCommand

class StarLTLC : CliktCommand() {
    override fun run() {
        println("hello, world!")
    }

}

fun main(args: Array<String>) = StarLTLC().main(args)