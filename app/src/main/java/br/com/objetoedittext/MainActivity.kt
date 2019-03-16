package br.com.objetoedittext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Método disparado quando btn for tocado
        btnEntrar.setOnClickListener {
            //Verificar se os campos estão preenchidos
            if (edtSenha.text.isNotEmpty() && edtUsuario.text.isNotEmpty()){
                val nomeUsuario = edtUsuario.text.toString()
                val senha = edtSenha.text.toString()
                if (nomeUsuario == "Admin"  && senha =="1234"){
                    txvResposta.text="Bem Vindo ${nomeUsuario}!"
                }else{
                    txvResposta.text="Usuario ou senha incorretos."
                }
            }
            else{
                txvResposta.text = "Preencha corretamente os campos"
            }
        }
    }
}
