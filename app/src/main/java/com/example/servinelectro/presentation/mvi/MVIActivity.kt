package com.example.servinelectro.presentation.mvi

import com.example.servinelectro.presentation.mvvm.MVVMViewModel
/*
class MVIActivity {
    val  vm = MVIViewModel()
    val  state = vm.state*/

    fun main(){
        val  vm = MVIViewModel()
        val  state = vm.state

        vm.handelAction(MVIAction.AnalyticsEvent("view"))
        vm.handelIntent(MVIIntent.GetProduct)


        if (state.isLoading){
            println("isLoading")
        }
        if (state.isError){
            println("isError")
        }
        if (state.uIProductEntity!=null){
            println("uIProductEntityId is : ${state.uIProductEntity?.id}")
        }

    }
/*
}*/
