package devarthur4718.com.welcomeactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

//Permkite que as Views desta activity sejam acessadas como se fossem propriedades da Activity
//Elimina a necessidade user o metodo findViewByID
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Busca o layout desta Activity.



        initActions()

    }

    private fun initActions() {

        btnOpenUserActivity.setOnClickListener {

            val intent = Intent(this@MainActivity, UserActivity::class.java)
            startActivity(intent)
        }

    }


}
