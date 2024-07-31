package com.xooloo.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.squareup.moshi.JsonQualifier

@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class ISO8061

@JsonClass(generateAdapter = true)
open class ApiUserItem(
  @field:Json(name = "slug") val slug: String,
  @field:Json(name = "date_added") @field:ISO8061 val date: Long,
)
