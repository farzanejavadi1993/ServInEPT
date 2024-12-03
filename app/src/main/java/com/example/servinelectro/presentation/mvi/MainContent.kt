package com.example.servinelectro.presentation.mvi

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.servinelectro.ui.theme.ServInElectroTheme

@Composable
fun MainContent(vm : MVIViewModel) {


    val state = vm.stateFlow.collectAsState()

    LaunchedEffect(Unit) {
        vm.handelAction(MVIAction.AnalyticsEvent("view"))
        vm.handelIntent(MVIIntent.GetProduct)
    }

    LaunchedEffect(vm) {
        vm.sharedFlow.collect { action ->
            when (action) {
                is MVIAction.AnalyticsEvent -> {
                    println("Analytics value is ${action.key}")
                }
            }
        }
    }


    ServInElectroTheme {
        Surface (
            modifier = Modifier.fillMaxSize().background(Color.Green)
        ){
            when (state.value) {

                is MVIState.Loading -> Text("Loading")
                MVIState.Error -> Text("Error")
                is MVIState.Product -> Text("Product: ${(state as MVIState.Product).uIProductEntity}")
            }
        }
    }
}