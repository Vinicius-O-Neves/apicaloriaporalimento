package dev.dealux.apicaloriaporalimento.controller

import dev.dealux.apicaloriaporalimento.entities.Food
import dev.dealux.apicaloriaporalimento.repository.FoodRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("foods")
class FoodController(private val repository: FoodRepository) {

    @GetMapping("{name}")
    fun index(@PathVariable name: String): List<Food> {

        return repository.getListOfFoods(name)
    }

}