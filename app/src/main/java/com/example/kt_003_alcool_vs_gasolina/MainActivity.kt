package com.example.kt_003_alcool_vs_gasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculate(view: View) {
        val priceAlcohol = input_alcohol.text.toString()
        val priceGas = input_gas.text.toString()

        if (checkValues(priceAlcohol, priceGas)) {
            return makeBestPrice(priceAlcohol, priceGas)
        }

        text_result.text = getString(R.string.error_invalid_fields)
    }

    private fun checkValues(priceAlcohol: String, priceGas: String): Boolean {
        if (priceAlcohol.isEmpty() || priceAlcohol.isBlank()) return false
        if (priceGas.isEmpty() || priceGas.isBlank()) return false
        return true
    }

    private fun makeBestPrice(priceAlcohol: String, priceGas: String) {
        val priceAlcoholDoubled = priceAlcohol.toDouble()
        val priceGasDoubled = priceGas.toDouble()

        val result = priceAlcoholDoubled / priceGasDoubled

        if (result >= 0.7) {
            text_result.text = getString(R.string.response_best_gas)
        } else {
            text_result.text = getString(R.string.response_best_alcohol)
        }
    }
}