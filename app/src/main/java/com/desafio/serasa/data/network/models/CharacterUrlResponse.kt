package com.desafio.serasa.data.network.models

import com.google.gson.annotations.SerializedName

data class CharacterUrlResponse(
    @SerializedName("type") val type: String?,
    @SerializedName("url") val url: String?
)