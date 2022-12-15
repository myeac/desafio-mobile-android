package com.desafio.serasa.data.network.models

import com.google.gson.annotations.SerializedName

data class CharacterThumbResponse(
    @SerializedName("path") val path: String?,
    @SerializedName("extension") val extension: String?
)
