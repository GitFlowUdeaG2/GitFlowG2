package com.edwinacubillos.gitflowg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplicationholav02.UTILS.Constantes
import kotlinx.android.synthetic.main.activity_circulo__peri_.*

class Circulo_Peri_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circulo__peri_)

        var flag_bu = 0


        bu_calcular.setOnClickListener {

            var radio = et_1.text.toString()
            val pi  = 3.14159265359

            flag_bu += 1

            if (flag_bu == 2) {
                flag_bu = 0
                tv_resultado.text = null
            }
            if (radio.isNotEmpty()){
                tv_resultado.text = getString(R.string.r_diame) + Constantes.INTERLINE + 2*pi*radio.toDouble()
            }



        }


    }
}
