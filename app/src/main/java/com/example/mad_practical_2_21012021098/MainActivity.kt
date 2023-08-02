package com.example.mad_practical_2_21012021098

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("on create method is called!!")
    }
    fun showMessage(message:String){
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        val obj:ConstraintLayout?=findViewById(R.id.mainConstraint)
        if (obj!=null){
            Snackbar.make(obj,message,Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart ,method is called")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("On restart method is called!!")
    }

    override fun onResume() {
        super.onResume()
        showMessage("On resume method is called!!")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("On destroy method is called!!")
    }

    override fun onPause() {
        super.onPause()
        showMessage("On pause method is called!!")
    }

    override fun onStop() {
        super.onStop()
        showMessage("On stop method is called!!")
    }

}