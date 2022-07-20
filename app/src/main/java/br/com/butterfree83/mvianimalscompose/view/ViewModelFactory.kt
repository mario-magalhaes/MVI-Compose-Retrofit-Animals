package br.com.butterfree83.mvianimalscompose.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.butterfree83.mvianimalscompose.api.AnimalApi
import br.com.butterfree83.mvianimalscompose.api.AnimalRepo

class ViewModelFactory(private val api: AnimalApi): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(AnimalRepo(api)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}