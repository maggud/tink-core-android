/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Tink API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.tink.rest.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property amount The amount of the transaction part. Must be same sign as the transaction. If not specified the common disposable amount will be used.
 */
@JsonClass(generateAdapter = true)
data class LinkTransactionsRequest(
    @Json(name = "amount") @field:Json(name = "amount") var amount: Double? = null
)