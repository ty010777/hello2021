package com.example.hello2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = “Hello tcyang”
        TestMaster()
    }

    fun TestMaster(){
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Master分支"
    }

        var txv: TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Hello tcyang"
        TestDEV()
    }

    fun TestDEV(){
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Dev分支"
    }
}
override fun onTouchEvent(event: MotionEvent?): Boolean {
    var txv:TextView = findViewById<TextView>(R.id.txv)
    txv.text = "Jerry修改螢幕觸控"
    return true
}



    }
}