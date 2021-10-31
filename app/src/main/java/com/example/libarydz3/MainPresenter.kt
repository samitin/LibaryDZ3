package com.example.libarydz3

import io.reactivex.rxjava3.subjects.BehaviorSubject
import moxy.MvpPresenter

class MainPresenter(val model: CountersModel): MvpPresenter<MainView>() {
val behaviorSubject=BehaviorSubject.create<ButtonType>()
    init{
        behaviorSubject.onNext(ButtonType.BUTTON_ONE)
        behaviorSubject.subscribe {
            when(it){
                ButtonType.BUTTON_ONE->{
                    val imageId = model.getImage(ButtonType.BUTTON_ONE)
                    viewState.setButtonOneImage(imageId)
                }
                ButtonType.BUTTON_TWO->{
                    val imageId = model.getImage(ButtonType.BUTTON_TWO)
                    viewState.setButtonOneImage(imageId)
                }
                ButtonType.BUTTON_THREE->{
                    val imageId = model.getImage(ButtonType.BUTTON_THREE)
                    viewState.setButtonOneImage(imageId)
                }
            }
        }
    }
}
enum class ButtonType{
    BUTTON_ONE,
    BUTTON_TWO,
    BUTTON_THREE
}