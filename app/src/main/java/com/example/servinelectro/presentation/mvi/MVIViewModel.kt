package com.example.servinelectro.presentation.mvi

import com.example.servinelectro.presentation.UIProductEntity

class MVIViewModel {


    var state = MVIState()


    fun handelIntent(intent: MVIIntent) {
        when (intent) {
            MVIIntent.GetProduct -> {
                //Call UseCase
                state = state.copy(isLoading = true)

                if (true) {
                    state = state.copy(isLoading = false, uIProductEntity = UIProductEntity(2))
                } else {
                    state = state.copy(isLoading = false, isError = true)
                }
            }
        }
    }


    fun handelAction(action: MVIAction) {
        when (action) {
            is MVIAction.AnalyticsEvent -> {
                println("Analytics value is ${action.key}")
            }
        }
    }
}


data class MVIState(
    var uIProductEntity: UIProductEntity? = null,
    var isLoading: Boolean = false,
    var isError: Boolean = false
)


sealed class MVIIntent {
    data object GetProduct : MVIIntent()
}


sealed class MVIAction {
    data class AnalyticsEvent(var key: String) : MVIAction()
}