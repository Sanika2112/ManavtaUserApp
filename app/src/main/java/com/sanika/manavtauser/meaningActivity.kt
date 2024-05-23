package com.sanika.manavtauser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class meaningActivity :  YouTubeBaseActivity() {

    val api_key =  "AIzaSyCpWXAGPwFbTjh11L4hU3faOAznmSq5w30"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meaning)


        //adding youtube video
        val ytPlayer = findViewById<YouTubePlayerView>(R.id.yt)
        ytPlayer.initialize(api_key, object : YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(
                provider: YouTubePlayer.Provider?,
                player: YouTubePlayer?,
                p2: Boolean
            ) {
                player?.loadVideo("8Wd4Yumll-s")
                player?.play()
            }
            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(this@meaningActivity , "Video player Failed" , Toast.LENGTH_SHORT).show()
            }
        })

    }
}