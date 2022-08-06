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

    // Esta função é responsável por calcular a área
    fun calculate(view: View) {
        // Estamos recebendo os valores preenchidos pelo usuário
        val height = inputHeight.text.toString()
        val width = inputWidth.text.toString()

        // Estamos executando a função de verificação dos dados preenchidos
        if (checkValues(height, width)) {
            // Com os dados verificados, vamos executar o calculo
            return makeArea(height, width)
        }

        // Quando não entrar na condicional da verificação dos dados
        // Vamos resetar os valores na tela do usuário
        errorView.text = getString(R.string.error_empty)
        resultView.text = ""
    }

    // Este método é responsável por verificar se os dados foram preenchidos pelo usuário
    private fun checkValues(height: String, width: String): Boolean {
        // Estamos utilizando validadores nativos do Kotlin para garantir que os valores não são vazios
        if (height.isEmpty() || height.isBlank()) return false
        if (width.isEmpty() || width.isBlank()) return false
        return true
    }

    // Este método irá de fato calcular a área
    private fun makeArea(height: String, width: String) {
        // Estamos convertendo os valores para Double
        val height = height.toDouble()
        val width = width.toDouble()

        // Vamos executar a multiplicação da altura e largura, assim dadno o valor da área
        val result = height * width

        // Estamos resetando a mensagem de erro e exibindo o resultado da área fina
        errorView.text = ""
        resultView.text = "${getString(R.string.result_area)} ${result.toInt()}m²";
    }
}