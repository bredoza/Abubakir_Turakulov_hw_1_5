package com.example.abubakir_turakulov_hw_1_5

class CounterPresenter(private val model: CounterModel) {

    private lateinit var view: CounterView

    fun increment() {
        model.increment()
        view.showCount(model.count)
    }

    fun decrement() {
        model.decrement()
        view.showCount(model.count)
    }

    fun changeVisible() {
        model.toggleVisibility()
        view.changeVisible()
    }

    fun isVisible(): Boolean {
        return model.isVisible
    }

    fun resetCount() {
        model.resetCount()
        view.showCount(model.count)
    }

    fun attachView(view: CounterView) {
        this.view = view
    }

    fun setCountListener(countListener: CounterView) {
        model.setCountListener(countListener)
    }
}