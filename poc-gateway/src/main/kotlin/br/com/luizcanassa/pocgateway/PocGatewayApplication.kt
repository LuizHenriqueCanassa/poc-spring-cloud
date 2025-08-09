package br.com.luizcanassa.pocgateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PocGatewayApplication

fun main(args: Array<String>) {
    runApplication<PocGatewayApplication>(*args)
}
