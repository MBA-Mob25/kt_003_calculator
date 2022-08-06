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
        val height = inputHeight.text.toString()
        val width = inputWidth.text.toString()

        if (checkValues(height, width)) {
            return makeArea(height, width)
        }
        errorView.text = getString(R.string.error_empty)
        resultView.text = ""
    }

    private fun checkValues(height: String, width: String): Boolean {
        if (height.isEmpty() || height.isBlank()) return false
        if (width.isEmpty() || width.isBlank()) return false
        return true
    }

    private fun makeArea(height: String, width: String) {
        val height = height.toDouble()
        val width = width.toDouble()

        val result = height * width

        errorView.text = ""
        resultView.text = "${getString(R.string.result_area)} ${result.toInt()}m²";
    }
}