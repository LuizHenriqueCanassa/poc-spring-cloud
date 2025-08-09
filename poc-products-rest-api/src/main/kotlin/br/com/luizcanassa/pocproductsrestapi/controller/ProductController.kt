package br.com.luizcanassa.pocproductsrestapi.controller

import br.com.luizcanassa.pocproductsrestapi.domain.Product
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/api/products")
class ProductController {

    @GetMapping
    fun getProducts(): List<Product> {
        return listOf(
            Product(UUID.randomUUID(), "Produto 1", "Descricao produto 1", 10.0),
            Product(UUID.randomUUID(), "Produto 2", "Descricao produto 2", 20.30),
        )
    }
}