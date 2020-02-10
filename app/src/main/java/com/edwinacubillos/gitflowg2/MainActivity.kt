package com.edwinacubillos.gitflowg2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    bt_rect_per.setOnClickListener{
        var intentrecper = Intent(this, PerimetroRectanguloActivity::class.java)
        startActivity(intentrecper)
    }

    bt_circulo_area.setOnClickListener{
        var intentcirarea= Intent(this, AreaCirculoActivity::class.java)
        startActivity(intentcirarea)
    }
    }
}
