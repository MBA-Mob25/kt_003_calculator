package com.example.kt_003_alcool_vs_gasolina.utils

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

// Objeto contendo funções de suporte para o APP
object Utils {
    // Função responsável por fechar o teclado do usuário
    fun hideSoftKeyBoard(context: Context, view: View) {
        try {
            // Carregando o objeto de controle do Keyboard
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            // Executando chamada que vai ocultar keyboard
            imm.hideSoftInputFromWindow(view.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
        } catch (e: Exception) {
            // Em caso de erro, vai exibir no console o erro para podermos analisar e debugar
            e.printStackTrace()
        }
    }
}