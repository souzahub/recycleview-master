package activities.luan.recyclerview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import activities.luan.recyclerview.R
import activities.luan.recyclerview.dataClass.Filme
import kotlinx.android.synthetic.main.activity_detalles.*

class Detalhes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)

        val filme = intent.getSerializableExtra("pel") as Filme

        idTitulo.text = getString(R.string.titulo, filme.titulo)
        idDertor.text = getString(R.string.diretor, filme.diretor)
        idGenero.text = getString(R.string.genero, filme.genero)
        idClassificacao.text = getString(R.string.calificacion, filme.clasificacao.toString())
        idDuracao.text = getString(R.string.duracion, filme.duracao.toString())
        idAno.text = getString(R.string.ano, filme.ano)

    }
}
