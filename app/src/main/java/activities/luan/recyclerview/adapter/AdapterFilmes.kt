package activities.luan.recyclerview.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import activities.luan.recyclerview.dataClass.Filme
import activities.luan.recyclerview.R
import activities.luan.recyclerview.activities.Detalhes
import activities.luan.recyclerview.activities.VisualizaImagem
import kotlinx.android.synthetic.main.elemento_lista_pelicula.view.*

class AdapterFilmes(private var lista: ArrayList<Filme>, private var contexto: Context) : RecyclerView.Adapter<AdapterFilmes.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.elemento_lista_pelicula,
                parent,
                false
            ), contexto
        )
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lista[position])
    }

    class ViewHolder(private var vista: View, private var contexto: Context) : RecyclerView.ViewHolder(vista) {
        fun bind(filme: Filme) {
            vista.elpIvPelicula.setImageResource(filme.idImagen)
            vista.elpTvTitulo.text = filme.titulo
            vista.elpTvGenero.text = filme.genero
            vista.elpRbCalificacion.rating = filme.clasificacao.toFloat()

            vista.elpIvPelicula.setOnClickListener {
                contexto.startActivity(Intent(contexto, VisualizaImagem::class.java).putExtra("pel", filme))
            }

            vista.setOnClickListener {
                contexto.startActivity(Intent(contexto, Detalhes::class.java).putExtra("pel", filme))
            }
        }
    }

}