package com.example.servinelectro.presentation.mvvm

import com.example.servinelectro.presentation.UIProductEntity

class MVVMViewModel {
    var uIProductEntity: UIProductEntity? = null
    var isLoading: Boolean = false
    var isError: Boolean = false



    fun getProduct(){
        //Call UseCase
        isLoading =true

        if (true){
            isLoading =false
            uIProductEntity = UIProductEntity(2)
        }
        else{
            isLoading =false
            isError =true
        }

    }
}