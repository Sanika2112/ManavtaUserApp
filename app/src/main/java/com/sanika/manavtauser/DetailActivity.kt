package com.sanika.manavtauser

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.sanika.manavtauser.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {
    var url = ""
    var imageUrl = ""
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle = intent.extras
        if (bundle != null) {
            binding.dngoName.text = bundle.getString("NGO")
            binding.dfounderName.text =bundle.getString("Founder")
            binding.ddesc.text =bundle.getString("Description")
            binding.dphone.text =bundle.getString("Contact no.")
            binding.daddress.text =bundle.getString("Address")
            binding.demail.text =bundle.getString("Email")
            binding.dwebsite.text =bundle.getString("Website")

            imageUrl = bundle.getString("Image")!!
            Glide.with(this).load(bundle.getString("Image"))
                .into(binding.dimageView)

            binding.donateBtn.setOnClickListener {
                url = bundle.getString("Donate")!!
                val i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse(url)
                startActivity(i)
            }
        }

    }
}