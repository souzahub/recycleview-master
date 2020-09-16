package activities.luan.recyclerview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import activities.luan.recyclerview.dataClass.Filme
import activities.luan.recyclerview.R
import kotlinx.android.synthetic.main.activity_visor_imagen.*

class VisualizaImagem : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visor_imagen)

        val filmes = intent.getSerializableExtra("pel") as Filme

        aviIvPelicula.setImageResource(filmes.idImagen)
    }
}
