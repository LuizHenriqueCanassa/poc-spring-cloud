package br.com.luizcanassa.pocproductsrestapi.domain

import java.util.UUID

class Product (
    val id: UUID,
    val name: String,
    val description: String,
    val price: Double,
)