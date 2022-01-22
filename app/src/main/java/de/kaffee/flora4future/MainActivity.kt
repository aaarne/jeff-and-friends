package de.kaffee.flora4future

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.hardware.camera2.*
import android.content.Intent
import android.provider.MediaStore
import android.content.ActivityNotFoundException
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dispatchTakePictureIntent()
    }

    private fun dispatchTakePictureIntent() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        try {
            startActivityForResult(takePictureIntent, 1)
        } catch (e: ActivityNotFoundException) {
            Log.e("Error", "Can not open camera!")
        }
    }

}