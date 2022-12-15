package com.desafio.serasa.data.network.models

import com.google.gson.annotations.SerializedName

data class CharacterInformationResponse(
    @SerializedName("id") val id: Int?,
    @SerializedName("name") val name: String?,
    @SerializedName("description") val description: String?,
    @SerializedName("modified") val modified: String?,
    @SerializedName("thumbnail") val thumbnail: CharacterThumbResponse?,
    @SerializedName("resourceURI") val resourceURI: String?,
    @SerializedName("urls") val urls: List<CharacterUrlResponse>?
)