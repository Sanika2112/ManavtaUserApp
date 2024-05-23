package com.sanika.manavtauser

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth


class MainActivity : AppCompatActivity() {


    lateinit var user: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // opening meaning activity
        val meaning = findViewById<Button>(R.id.meaning_button)
        meaning.setOnClickListener {
            val intent = Intent(this, meaningActivity::class.java)
            startActivity(intent)
        }

        // image slider
        val imageSlider = findViewById<ImageSlider>(R.id.sliderMain)
        val slideModels = ArrayList<SlideModel>()
        slideModels.add(SlideModel(R.drawable.quote1, ScaleTypes.FIT))
        slideModels.add(SlideModel(R.drawable.quote2, ScaleTypes.FIT))
        slideModels.add(SlideModel(R.drawable.quote3, ScaleTypes.FIT))
        slideModels.add(SlideModel(R.drawable.quote4, ScaleTypes.FIT))
        slideModels.add(SlideModel(R.drawable.quote5, ScaleTypes.FIT))
        slideModels.add(SlideModel(R.drawable.quote6, ScaleTypes.FIT))
        imageSlider.setImageList(slideModels, ScaleTypes.FIT)

        // opening categories activity

        val ChildWelfare=findViewById<ImageView>(R.id.child)
        ChildWelfare.setOnClickListener { val intent=Intent(this,childWelfare::class.java)
            startActivity(intent)}


        val seniorCitizen=findViewById<ImageView>(R.id.senior)
        seniorCitizen.setOnClickListener { val intent=Intent(this,SeniorCitizen::class.java)
            startActivity(intent)}

        val WomenEmpowermwnt=findViewById<ImageView>(R.id.women)
        WomenEmpowermwnt.setOnClickListener { val intent=Intent(this,womenEmpowerment::class.java)
            startActivity(intent)}

        val PhysicallyChallenged=findViewById<ImageView>(R.id.physically)
        PhysicallyChallenged.setOnClickListener { val intent=Intent(this,physicallyChallenged::class.java)
            startActivity(intent)}

        val Nature=findViewById<ImageView>(R.id.nature)
        Nature.setOnClickListener { val intent=Intent(this,natureConservation::class.java)
            startActivity(intent)}

        val Animal=findViewById<ImageView>(R.id.animal)
        Animal.setOnClickListener { val intent=Intent(this,animalConservation::class.java)
            startActivity(intent)}


        // for log out operation
        user = FirebaseAuth.getInstance()
        val logout = findViewById<TextView>(R.id.logout)
        logout.setOnClickListener {
            user.signOut()
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }


    }
}