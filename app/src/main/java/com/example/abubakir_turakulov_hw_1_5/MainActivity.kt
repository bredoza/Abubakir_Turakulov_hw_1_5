package com.example.abubakir_turakulov_hw_1_5

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.abubakir_turakulov_hw_1_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = Injector.getPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        presenter.setCountListener(this)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            btnPlus.setOnClickListener {
                presenter.increment()
            }
            btnMinus.setOnClickListener {
                presenter.decrement()
            }
            btnVisibility.setOnClickListener {
                presenter.changeVisible()
            }
            btnReset.setOnClickListener {
                presenter.resetCount()
            }
        }
    }

    override fun showCount(count: Int) {
        binding.tvNumber.text = count.toString()
    }

    override fun changeVisible() {
        binding.tvNumber.isVisible = presenter.isVisible()
    }

    override fun anniversaryToast() {
        Toast.makeText(this, "Congratulation!", Toast.LENGTH_SHORT).show()
    }

    override fun countTextColorGreen() {
        binding.tvNumber.setTextColor(Color.GREEN)
    }

    override fun countTextColorReset() {
        binding.tvNumber.setTextColor(Color.BLACK)
    }
}