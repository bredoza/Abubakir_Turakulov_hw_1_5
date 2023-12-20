package com.example.abubakir_turakulov_hw_1_5

class CounterModel {

    private var countListener: CounterView? = null

    var count = 0
    var isVisible = true

    fun increment() {
        count++
        countAnniversary()
    }

    fun decrement() {
        count--
        countAnniversary()
    }

    fun toggleVisibility() {
        isVisible = !isVisible
    }

    fun resetCount() {
        if (count != 0) {
            count = 0
            countListener?.countTextColorReset()
        }
    }

    fun setCountListener(listener: CounterView) {
        countListener = listener
    }

    private fun countAnniversary() {
        if (count == 10) {
            countListener?.anniversaryToast()
        }
        if (count == 15) {
            countListener?.countTextColorGreen()
        }
    }
}