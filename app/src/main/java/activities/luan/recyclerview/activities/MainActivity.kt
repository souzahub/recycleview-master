package activities.luan.recyclerview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import activities.luan.recyclerview.adapter.AdapterFilmes
import activities.luan.recyclerview.dataClass.Filme
import activities.luan.recyclerview.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        amRvPeliculas.layoutManager = LinearLayoutManager(this)
        amRvPeliculas.adapter = AdapterFilmes(generarDatosPrueba(), this)

    }

    private fun generarDatosPrueba() : ArrayList<Filme>{
        val lista = ArrayList<Filme>()
        lista.add(Filme(R.drawable.interestelar, "Interestelar", "Christopher Nolan", "Ficção científica", 4.3, 169, "2014"))
        lista.add(Filme(R.drawable.forma_agua, "A Forma da Água", "Guillermo del Toro", "Romance/Fantasia", 3.65, 123, "2017"))
        lista.add(Filme(R.drawable.extraordinario, "Extraordinario", "Stephen Chbosky", "Drama", 4.0, 113, "2017"))
        lista.add(Filme(R.drawable.la_llegada, "A Chegada", "Denis Villeneuve", "Ficção científica", 3.95, 116, "2016"))
        lista.add(Filme(R.drawable.ex_maquina, "Ex_Machina: Instinto Artificial", "Alex Garland", "Ficção científica", 3.85, 108, "2015"))
        lista.add(Filme(R.drawable.jumanji, "Jumanji: Bem-vindo à Selva", "Jake Kasdan", "ação", 3.5, 119, "2017"))

        return lista
    }

}
