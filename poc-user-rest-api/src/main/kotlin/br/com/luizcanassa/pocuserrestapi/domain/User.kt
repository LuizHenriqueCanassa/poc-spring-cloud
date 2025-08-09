package br.com.luizcanassa.pocuserrestapi.domain

import java.util.UUID

class User (
    val id: UUID,
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String
)