

package com.example.servinelectro.presentation.mvi

import com.example.servinelectro.presentation.mvvm.MVVMViewModel

/*
class MVIActivity {
    val  vm = MVIViewModel()
    val  state = vm.state*/
/*
suspend fun main() {
    val vm = MVIViewModel()
    *//*  val state = vm.state*//*

    vm.handelAction(MVIAction.AnalyticsEvent("view"))
    vm.handelIntent(MVIIntent.GetProduct)




    vm.stateFlow.collect { state ->
        if (state.isLoading) {
            println("isLoading")
        }
        if (state.isError) {
            println("isError")
        }
        if (state.uIProductEntity != null) {
            println("uIProductEntityId is : ${state.uIProductEntity?.id}")
        }
    }


    vm.sharedFlow.collect { action ->
        when(action){
            is MVIAction.AnalyticsEvent -> {
                println("Analytics value is ${action.key}")
            }

        }

    }

    if (state.isLoading){
        println("isLoading")
    }
    if (state.isError){
        println("isError")
    }
    if (state.uIProductEntity!=null){
        println("uIProductEntityId is : ${state.uIProductEntity?.id}")
    }


}*/
