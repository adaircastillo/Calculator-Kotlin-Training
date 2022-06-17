package net.nemesis.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import net.nemesis.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    private val processor = Processor(0,0)

    private var number: String = ""
        set(value) {
            binding.display.text = value
            field = value
        }

    private var operation: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBindings()
    }

    private fun setupBindings(){

        with(binding){

            keyClear.setOnClickListener { view ->
                number = ""
            }

            keyPlus.setOnClickListener {
                if(it is Button){
                    processor.firstOperand = number.toInt()
                    operation = it.text.toString()
                    number = ""
                }
            }

            keyEquals.setOnClickListener {
                processor.secondOperand = number.toInt()
                val result = processor.performOperation(operation)
                display.text = result.toString()
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

    override fun onClick(button: View?) {
        if(button is Button){
            this.number += button.text.toString()
        }
    }
}













