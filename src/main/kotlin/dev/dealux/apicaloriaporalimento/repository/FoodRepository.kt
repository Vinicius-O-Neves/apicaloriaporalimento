package dev.dealux.apicaloriaporalimento.repository

import dev.dealux.apicaloriaporalimento.entities.Food
import dev.dealux.apicaloriaporalimento.objects.Alimentos
import org.springframework.stereotype.Service

@Service
class FoodRepository {

    fun getListOfFoods(name: String): List<Food> {
        val list: MutableList<Food> = mutableListOf()

        Alimentos.list.map { food ->
            if (food.name.lowercase().contains(name)) {
                list.add(food)
            }
        }
        return list
    }

}