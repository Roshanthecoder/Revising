package com.example.revising

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var textview1:TextView=findViewById(R.id.txtview);
//        val btn1:Button=findViewById(R.id.btn)
//        btn1.setOnClickListener {
//            var id:String=Settings.Secure.getString(application.contentResolver, Settings.Secure.ANDROID_ID).toString()
//            Toast.makeText(this@MainActivity,"Ok "+id,Toast.LENGTH_SHORT).show()
//        }

        val repository=MoviesRepository(MoviesApi())
        GlobalScope.launch(Dispatchers.Main) {
            val movies=repository.getmovies()
            Toast.makeText(this@MainActivity,movies.toString(),Toast.LENGTH_SHORT).show()


        }



    }
}