package com.example.libarydz3

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

//@AddToEndSingle - есть ещё такой алиас
@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView: MvpView {
    fun setButtonOneImage(imageId:Int)
    fun setButtonTwoImage(imageId:Int)
    fun setButtonThreeImage(imageId:Int)
}