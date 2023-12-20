package com.example.abubakir_turakulov_hw_1_5

class Injector {

    companion object {
        fun getPresenter() = CounterPresenter(CounterModel())
    }
}