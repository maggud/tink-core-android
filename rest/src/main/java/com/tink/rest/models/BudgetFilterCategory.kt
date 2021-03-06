/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Tink API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.tink.rest.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property code The category code.
 */
@JsonClass(generateAdapter = true)
data class BudgetFilterCategory(
    @Json(name = "code") @field:Json(name = "code") var code: String? = null
)
