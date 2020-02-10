package com.edwinacubillos.gitflowg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_perimetro_rectangulo.*

class PerimetroRectanguloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perimetro_rectangulo)

        bt_perimetrorectangulo.setOnClickListener {
            val anchorect = et_anchorectangulo.text.toString()
            val largorect = et_largorectangulo.text.toString()
            if(anchorect.isEmpty()||largorect.isEmpty()){
                Toast.makeText( this, "Debe llenar todos los campos", Toast.LENGTH_SHORT).show()
            }
            else{
                et_perimetrorectangulo.text = (anchorect.toDouble()*2+largorect.toDouble()*2).toString()
            }
        }


    }
}
