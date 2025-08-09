package br.com.luizcanassa.pocuserrestapi.controller

import br.com.luizcanassa.pocuserrestapi.domain.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/api/users")
class UserController {

    @GetMapping
    fun getUsers(): List<User> {
        return listOf(
            User(UUID.randomUUID(), "Usuario 1", "Sobrenome Usuario 1", "user1@email.com", "12345"),
            User(UUID.randomUUID(), "Usuario 2", "Sobrenome Usuario 2", "user2@email.com", "12345"),
        )
    }
}