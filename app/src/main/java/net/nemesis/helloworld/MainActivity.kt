package net.nemesis.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import net.nemesis.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBindings()
    }

    private fun setupBindings(){

        with(binding){

            keyClear.setOnClickListener {

                Log.e("TEST", "Click en boton Clear")
            }

            key0.setOnClickListener(this@MainActivity)
            key1.setOnClickListener(this@MainActivity)
            key2.setOnClickListener(this@MainActivity)
            key3.setOnClickListener(this@MainActivity)
            key4.setOnClickListener(this@MainActivity)
            key5.setOnClickListener(this@MainActivity)
            key6.setOnClickListener(this@MainActivity)
            key7.setOnClickListener(this@MainActivity)
            key8.setOnClickListener(this@MainActivity)
            key9.setOnClickListener(this@MainActivity)
        }
    }

    override fun onClick(v: View?) {

        if(v is Button){

            val number = v.text.toString()

            Log.e("TEST", "Click en boton $number")

        }


    }
}













