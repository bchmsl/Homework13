package com.bchmsl.homework13.ui.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bchmsl.homework13.model.Item
import com.bchmsl.homework13.network.RetrofitService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _data = MutableSharedFlow<Item>()
    val data : SharedFlow<Item> get() = _data

    fun requestData(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = RetrofitService.getItems().getItems()

            if (response.isSuccessful && response.body() != null){
                val data = response.body()!!
                _data.emit(data)
            }
        }
    }
}