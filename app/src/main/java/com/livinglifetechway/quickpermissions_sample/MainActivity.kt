package com.livinglifetechway.quickpermissions_sample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.livinglifetechway.quickpermissions_sample.databinding.ActivityMainBinding
import com.livinglifetechway.quickpermissions_sample.kotlin.AllKotlinActivity
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @ApplicationContext
    @Inject
    lateinit var context: Context

    lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding.buttonKotlinAll.setOnClickListener {
            startActivity(Intent(this, AllKotlinActivity::class.java))
        }

    }
}
