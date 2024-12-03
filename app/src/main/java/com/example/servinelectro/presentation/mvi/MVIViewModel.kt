package com.example.servinelectro.presentation.mvi

import com.example.servinelectro.presentation.UIProductEntity
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow

class MVIViewModel {


    //private val state = MVIState()
    private val state = MVIState.Loading

    private val _stateFlow = MutableStateFlow<MVIState>(state)
    val stateFlow = _stateFlow.asStateFlow()

    private val _sharedFlow = MutableSharedFlow<MVIAction>()
    val sharedFlow = _sharedFlow.asSharedFlow()



    suspend fun handelIntent(intent: MVIIntent) {
        when (intent) {
            MVIIntent.GetProduct -> {
                //Call UseCase
                _stateFlow.emit(
                   //MVIState(isLoading = true)
                    MVIState.Loading
                )
                delay(5000)
                _stateFlow.emit(
                    /*  state.copy(
                          isLoading = false,
                          uIProductEntity = UIProductEntity(2)
                      )*/

                    MVIState.Product(UIProductEntity(2))

                )

                /* state = state.copy(isLoading = true)

                 if (true) {
                     state = state.copy(isLoading = false, uIProductEntity = UIProductEntity(2))
                 } else {
                     state = state.copy(isLoading = false, isError = true)
                 }*/
            }
        }
    }


   suspend fun handelAction(action: MVIAction) {
       /* when (action) {
            is MVIAction.AnalyticsEvent -> {
                println("Analytics value is ${action.key}")
            }
        }*/
       _sharedFlow.emit(action)
    }
}




/*data class MVIState(
    var uIProductEntity: UIProductEntity? = null,
    var isLoading: Boolean = false,
    var isError: Boolean = false
)*/

sealed class MVIState {
    data object Loading : MVIState()
    data object Error : MVIState()
    data class Product(var uIProductEntity: UIProductEntity? = null) : MVIState()
}


sealed class MVIIntent {
    data object GetProduct : MVIIntent()
}


sealed class MVIAction {
    data class AnalyticsEvent(var key: String) : MVIAction()
}