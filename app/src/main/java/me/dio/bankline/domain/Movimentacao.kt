package me.dio.bankline.domain

import com.google.gson.annotations.SerializedName

data class Movimentacao(
    val id: Int,
    val dataHora: String,
    val descricao: String,
    val valor: Double,
    val tipo: TipoMovimentacao,

    //"idConta -> idCorrentista" = SerializedName resolveu isso
    @SerializedName("idConta")
    val idCorrentista: Int,

)
