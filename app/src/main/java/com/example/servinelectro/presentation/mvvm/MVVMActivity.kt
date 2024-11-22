package com.example.servinelectro.presentation.mvvm

class MVVMActivity {
    val  vm =MVVMViewModel()

    fun main(){
        vm.getProduct()

        if (vm.isLoading){
            println("isLoading")
        }
        if (vm.isError){
            println("isError")
        }
        if (vm.uIProductEntity!=null){
            println("uIProductEntityId is : ${vm.uIProductEntity?.id}")
        }
    }
}