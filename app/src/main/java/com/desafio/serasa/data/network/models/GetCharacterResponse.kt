package com.desafio.serasa.data.network.models

import com.google.gson.annotations.SerializedName

data class GetCharacterResponse(
    @SerializedName("code") val code: Int?,
    @SerializedName("status") val status: String?,
    @SerializedName("copyright") val copyright: String?,
    @SerializedName("attributionText") val attributionText: String?,
    @SerializedName("attributionHTML") val attributionHTML: String?,
    @SerializedName("etag") val etag: String?,
    @SerializedName("data") val data: CharacterDataResponse?
)
