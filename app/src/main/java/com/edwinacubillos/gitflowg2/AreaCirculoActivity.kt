package com.edwinacubillos.gitflowg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_area_circulo.*

class AreaCirculoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_circulo)

        bt_calcular.setOnClickListener{
            var radio= et_radio.text.toString()
            var area=0
            var pi=3.14

            if (et_radio.text.isEmpty())
                Toast.makeText(this, "Debe ingresar el radio del circulo",Toast.LENGTH_SHORT).show()

            else
                resultado.text= (radio.toDouble()*radio.toDouble()*pi).toString()
        }
    }
}
