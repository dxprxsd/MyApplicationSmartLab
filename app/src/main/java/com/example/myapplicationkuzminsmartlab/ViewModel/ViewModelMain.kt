package com.example.myapplicationkuzminsmartlab.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplicationkuzminsmartlab.API.Repository
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class ViewModelMain (private val repository: Repository): ViewModel(){
    private val _showErrorToastChannel = Channel<Boolean>()
    val showErrorToastChannel = _showErrorToastChannel.receiveAsFlow()

    fun sendCodeEmail(email:String){
        viewModelScope.launch {
            repository.sendCodeEmail(email).collect(){
                when(it){
                    is com.example.myapplicationkuzminsmartlab.API.Result.Error ->{
                        _showErrorToastChannel.send(true)
                    }
                    is com.example.myapplicationkuzminsmartlab.API.Result.Success ->{
                        _showErrorToastChannel.send(false)
                    }
                }
            }
        }
    }

}