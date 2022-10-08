package tn.esprit.CurriculumVitaeV2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity2 : AppCompatActivity() {

    lateinit var a1 : TextInputLayout
    lateinit var a2 : TextInputEditText
    lateinit var b : Button
    lateinit var gg1 : RadioButton
    lateinit var gg2 : RadioButton
    lateinit var agee : TextInputEditText
    lateinit var namee : TextInputEditText
    lateinit var emaill : TextInputEditText
    lateinit var namee1 : TextInputLayout
    lateinit var emaill1 : TextInputLayout
    lateinit var agee1 : TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        gg1 = findViewById(R.id.g1)
        gg2 = findViewById(R.id.g2)
        namee1=findViewById(R.id.name1)
        emaill1 =findViewById(R.id.email1)
        agee1 =findViewById(R.id.age1)
        gg1.isChecked = true

        agee=findViewById(R.id.age)
        emaill=findViewById(R.id.email)
        namee=findViewById(R.id.name)






        b=findViewById(R.id.next)
        b.setOnClickListener(){

            val i = Intent(this,MainActivity22::class.java)


            if (gg1.isChecked){
                i.putExtra("rad1", "Male")
            }
            else {
                i.putExtra("rad1", "  ")
            }

            if (gg2.isChecked){
                i.putExtra("rad2", "Female")
            }
            else {
                i.putExtra("rad2", " ")
            }
            
            i.putExtra("hhh", agee.text.toString())
            i.putExtra("nnn", namee.text.toString())
            i.putExtra("eee", emaill.text.toString())



            /*if (agee.text.isEmpty() || namee.text.isEmpty() || emaill.text.isEmpty()){
            Toast.makeText(this@MainActivity2, "Check your input ! ", Toast.LENGTH_SHORT).show()
            }else{
              */

            //}
            if (namee.text.isNullOrEmpty() || agee.text.isNullOrEmpty() || emaill.text.isNullOrEmpty() ){
                    if (namee.text.isNullOrEmpty()){
                        namee1.error = "Must not be empty!"
                    }
                if(agee.text.isNullOrEmpty()){
                    agee1.error = "Must not be empty!"
                }
                if(emaill.text.isNullOrEmpty()){
                    emaill1.error = "Must not be empty!"
                }
            }else {
                startActivity(i)
            }

        }



    }
}