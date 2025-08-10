package br.com.luizcanassa.pocconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class PocConfigServerApplication

fun main(args: Array<String>) {
    runApplication<PocConfigServerApplication>(*args)
}
