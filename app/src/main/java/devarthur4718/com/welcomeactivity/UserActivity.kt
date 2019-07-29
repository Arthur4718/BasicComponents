package devarthur4718.com.welcomeactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        //Informa para activity que esta toolbar está ativa e pronta para uso
        setSupportActionBar(toolbar)

        //Informa a toolbar que queremos a ação de navegar para activity Pai(Parent Activity)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //Titulo na barra
        supportActionBar?.title = "Perfil"

        //Para que a navegação da barra funcione, e preciso adicionar a tag
        //Parent na activity pai em sua declaração no manifesto.
        //Ex:
        //<activity android:name=".UserActivity"
        //            android:parentActivityName=".MainActivity">

        //Obs: Cuidado para não formatar o Manifest file de modo incorreto.

        initActions()


    }

    private fun initActions() {

        //Click na imagem
        profile_image.setOnClickListener {

            toast("Item clicked")

        }

        //Evento que busca mudança no status do CheckBox
        chBoxNotification.setOnCheckedChangeListener { buttonView, isChecked ->

            toast("Você receberá notificaões sobre nossos serviços!")

        }


        //Click no botão - Verificamos se os campos obrigatórios foram preenchidos.
        button.setOnClickListener {

            if (input_user_name.text.toString().isEmpty()) {

                input_user_name.setError("Por favor, preencha o nome!")

            } else if (!chTerms.isChecked) {

                toast("Por favor aceite os termos de uso!")

            } else {
                toast("Assinatura realizada")
                val intent = Intent(this@UserActivity, UserDetails::class.java)
                startActivity(intent)


            }
        }


        radioGroup.setOnCheckedChangeListener { group, checkedId ->

            // Check which radio button was clicked
            when (checkedId) {
                R.id.radio_masc -> {
                    toast("Masc clicked")
                }
                R.id.radio_fem ->

                    toast("Fem clicked")
            }
        }
    }


}





