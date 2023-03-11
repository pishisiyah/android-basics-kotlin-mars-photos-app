package com.example.android.marsphotos.network

import com.squareup.moshi.Json

data class MarsPhoto(
    val id: String, @Json(name = "img_src") val imgSrcUrl: String
    //each of the variables in the MarsPhoto class corresponds to a key name in the JSON object.
    // To match the types in our specific JSON response, you use String objects for all the values.
)
