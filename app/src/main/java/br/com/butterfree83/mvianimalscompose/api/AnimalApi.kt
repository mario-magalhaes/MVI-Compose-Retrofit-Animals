package br.com.butterfree83.mvianimalscompose.api

import br.com.butterfree83.mvianimalscompose.model.Animal
import retrofit2.http.GET

interface AnimalApi {

    @GET("animals.json")
    suspend fun getAnimals(): List<Animal>

}