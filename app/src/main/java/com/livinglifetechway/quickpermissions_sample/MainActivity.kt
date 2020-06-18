package com.livinglifetechway.quickpermissions_sample

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.livinglifetechway.quickpermissions_sample.databinding.ActivityMainBinding
import com.livinglifetechway.quickpermissions_sample.kotlin.AllKotlinActivity
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding.buttonKotlinAll.setOnClickListener {
            startActivity<AllKotlinActivity>()
        }

    }
}
