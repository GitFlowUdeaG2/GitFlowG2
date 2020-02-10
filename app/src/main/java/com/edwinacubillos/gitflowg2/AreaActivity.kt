package com.edwinacubillos.gitflowg2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_area.*
import kotlinx.android.synthetic.main.activity_main.*

class AreaActivity : AppCompatActivity() {
    lateinit var base:String
    lateinit var altura:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area)

        BT_calculo_area_triangulo.setOnClickListener{
            calculoarea()
        }
    }


    fun calculoarea(){
        base = ET_base_triangulo.text.toString()
        altura = ET_altura_triangulo.text.toString()
        val area = (base.toDouble()*altura.toDouble())/2
        val textAux = "El área del triángulo es de:\n$area U^2"
        TV_resultado_area_triangulo.text = textAux
    }
}
