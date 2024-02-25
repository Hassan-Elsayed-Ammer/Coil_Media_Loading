package com.codestation.coilyt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codestation.coilyt.databinding.ActivityMainBinding
import com.codestation.coilyt.utils.Constants
import com.codestation.coilyt.utils.loadImageUrl

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            btnLoadImage.setOnClickListener {
                ivImage.loadImageUrl(Constants.IMAGE_URL)
            }

            btnLoadSvg.setOnClickListener {
                ivSvg.loadImageUrl(Constants.SVG_URL)
            }

            btnLoadGif.setOnClickListener {
                ivGif.loadImageUrl(Constants.GIF_URL)
            }


        }

//        binding.btnLoadImage.setOnClickListener{
//            binding.ivImage.loadImageUrl(Constants.IMAGE_URL)
//        }
//        binding.btnLoadSvg.setOnClickListener {
//            binding.ivSvg.loadImageUrl(Constants.SVG_URL)
//        }
//
//        binding.btnLoadGif.setOnClickListener {
//            binding.ivGif.loadImageUrl(Constants.GIF_URL)
//        }

    }
}