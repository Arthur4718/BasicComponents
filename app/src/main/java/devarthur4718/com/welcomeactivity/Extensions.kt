package devarthur4718.com.welcomeactivity

import android.app.Activity
import android.content.Context
import android.widget.Toast

//* Created by Arthur Gomes at 2019-07-28 12:09 - contact me at devarthur4718@gmail.com.br

//Isto é uma extensão, com entensions podemos sobreescrever metodos que já existem
fun Context.toast(message: CharSequence) =
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()



