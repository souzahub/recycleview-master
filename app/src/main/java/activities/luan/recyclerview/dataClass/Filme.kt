package activities.luan.recyclerview.dataClass

import java.io.Serializable

data class Filme (
    var idImagen: Int,
    var titulo: String,
    var diretor: String,
    var genero: String,
    var clasificacao: Double,
    var duracao: Int,
    var ano: String
) : Serializable