package br.com.luizcanassa.pocgateway.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.cloud.config.client.ConfigClientProperties
import org.springframework.cloud.config.client.ConfigServicePropertySourceLocator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment

@Configuration
class InitialConfiguration(
    val environment: Environment,
    @Autowired val configuration: ConfigClientProperties
) {

    @Bean
    @ConditionalOnProperty("spring.cloud.config.enabled")
    fun configServicePropertySourceLocator(): ConfigServicePropertySourceLocator {
        return ConfigServicePropertySourceLocator(configuration)
    }
}