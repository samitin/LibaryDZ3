package com.example.libarydz3

class CountersModel {
    fun getImage(button:ButtonType):Int= when(button){
        ButtonType.BUTTON_ONE->R.drawable.ic_baseline_looks_one_24
        ButtonType.BUTTON_TWO->R.drawable.ic_baseline_looks_two_24
        ButtonType.BUTTON_THREE->R.drawable.ic_baseline_looks_3_24
        }

}
