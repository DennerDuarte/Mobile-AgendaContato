package com.example.agendacontatoapi

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody


class AgendaContatosActivity : Activity(){

    override fun onCreate(bundle: Bundle?){
        super.onCreate(bundle)
        setContentView(R.layout.agenda_contato)

        val client = OkHttpClient()

        val edtNome = findViewById<EditText>(R.id.edtNome)
        val edtTelefone = findViewById<EditText>(R.id.edtTelefone)
        val edtEmail = findViewById<EditText>(R.id.edtEmail)

        val btnGravar = findViewById<Button>(R.id.btnGravar)
        val btnPesquisar = findViewById<Button>(R.id.btnPesquisar)

        val contatoJson = """
            {
                "nome":"${edtNome.text}",
                "email":"${edtEmail.text}",
                "telefone":"${edtTelefone.text}"
            }
        """.trimIndent()

        val request = Request.Builder()
            .url("")
            .post(contatoJson.toRequestBody()).build()
    }


}