/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Tink API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.tink.rest.apis

import com.tink.rest.models.Account
import com.tink.rest.models.AccountListResponse
import retrofit2.http.GET
import retrofit2.http.PUT

@JvmSuppressWildcards
interface AccountApi {
    @GET("/api/v1/accounts")
    @Deprecated(message = "Deprecated")
    suspend fun list(): List<Account>
    /**
     * List accounts
     * Returns an object with a list of the authenticated user's accounts.
     */
    @GET("/api/v1/accounts/list")
    suspend fun listAccounts(): AccountListResponse
    /**
     * Update an Account
     * Updates mutable properties of an account. The following properties are possible to update: accountExclusion, accountNumber, excluded, favored, name, type
     * @param id The ID of the account (required)
     * @param body The updated account object (required)
     */
    @PUT("/api/v1/accounts/{id}")
    suspend fun update(
        @retrofit2.http.Path("id") id: String,
        @retrofit2.http.Body body: Account
    ): Account
}
