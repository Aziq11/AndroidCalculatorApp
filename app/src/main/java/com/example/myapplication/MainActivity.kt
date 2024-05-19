package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)){ v, insert}
//        val.systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//        v.setPadding(systemBars.left, systemBars.top, SystemBars.right, SystemBars.down)
//        insets

        val num1 = binding.etFirstNum.text
        val num2 = binding.etSecNum.text

        binding.btnAdd.setOnClickListener{
            val sum = num1.toString().toDouble() + num2.toString().toDouble()
            binding.txtResultView.text = "The sum of $num1 and $num2 is $sum"
        }
        binding.btnSubtract.setOnClickListener{
            val minus = num1.toString().toDouble() - num2.toString().toDouble()
            binding.txtResultView.text = "The substract of $num1 and $num2 is $minus"
        }
        binding.btnMultiple.setOnClickListener{
            val multiple = num1.toString().toDouble() * num2.toString().toDouble()
            binding.txtResultView.text = "The multiple of $num1 and $num2 is $multiple"
        }
        binding.btnDivide.setOnClickListener{
            val division = num1.toString().toDouble() / num2.toString().toDouble()
            binding.txtResultView.text = "The division of $num1 and $num2 is $division"
        }
    }
}