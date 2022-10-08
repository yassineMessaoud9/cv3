package tn.esprit.CurriculumVitaeV2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity22 : AppCompatActivity() {
    private lateinit var btnskill: Button
    private lateinit var btnhob: Button
    private lateinit var btnlang: Button
    private lateinit var btnicon: BottomNavigationView

    //private lateinit var btnh : Button
    var imagePicker: ImageView? = null
    /*
    companion object {
     IMAGE_REQUEST_CODE = 100
    }

     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main22)

        imagePicker = findViewById(R.id.img_save)


        //ImagePicker.setOnClickListener {

        //  ImagePicker.with(this).galleryOnly().galleryMimeTypes(arrayOf("image/*")).crop()
        //    .maxResultSize(400, 400).start()

        //}


        btnskill = findViewById(R.id.s1)
        btnhob = findViewById(R.id.s2)
        btnlang = findViewById(R.id.s3)
        btnicon = findViewById(R.id.nav)
        //btnh=findViewById(R.id.s4)


        val f1 = FragmentSkills()
        val f2 = FragmentHobby()
        val f3 = FragmentLanguage()
        val f4 = FragmentTot()


        //btnh.setOnClickListener(){
        //pickImageGallery()


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfrag , f1)
            addToBackStack(null)
            commit()
        }


      //  btnh.setOnClickListener {
       //     supportFragmentManager.beginTransaction().apply {
        //        replace(R.id.flfrag , f4)
        //        addToBackStack(null)
         //       commit()
          //  }
        //}



        btnskill.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfrag , f1)
                addToBackStack(null)
                commit()
            }
        }

        btnhob.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfrag , f2)
                addToBackStack(null)
                commit()
            }
        }

        btnlang.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfrag , f3)
                addToBackStack(null)
                commit()
            }
        }

        replaceFragment(f4)
/*
        btnicon.setOnClickListener() {
            val p = PopupMenu(this , it)
            p.setOnMenuItemClickListener{ item ->
            when (item.itemId) {
                R.id.nav -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.flfrag , f4)
                        addToBackStack(null)
                        commit()
                        true
                }
                    else  ->  false
            }
        }

    }
            p.inflate(R.menu.menu)
            p.show()
        }
*/
    }
/*
    private fun pickImageGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"

        startActivityForResult(intent,IMAGE_REQUEST_CODE)
    }

*/*/


    fun replaceFragment(fragment : Fragment){
        if (fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.flfrag , fragment)
            transaction.commit()
        }
    }






}


