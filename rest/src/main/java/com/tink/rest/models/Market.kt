/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Tink API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.tink.rest.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property code The ISO 3166-1 alpha-2 country code of the market.
 * @property currencies The applicable currencies available in the market.
 * @property defaultCurrency The ISO 4217 code of the default currency.
 * @property defaultLocale The default locale in the market.
 * @property defaultTimeZone The default time zone in the market.
 * @property description The display name of the market
 * @property suggested Flag to indicate if this is the suggested market for the user.
 * @property registerMethods
 * @property loginMethods
 * @property gdprLoginMethods
 */
@JsonClass(generateAdapter = true)
data class Market(
    @Json(name = "code") @field:Json(name = "code") var code: Market.CodeEnum,
    @Json(name = "currencies") @field:Json(name = "currencies") var currencies: List<Currency>,
    @Json(name = "defaultCurrency") @field:Json(name = "defaultCurrency") var defaultCurrency: String,
    @Json(name = "defaultLocale") @field:Json(name = "defaultLocale") var defaultLocale: String,
    @Json(name = "defaultTimeZone") @field:Json(name = "defaultTimeZone") var defaultTimeZone: String,
    @Json(name = "description") @field:Json(name = "description") var description: String,
    @Json(name = "suggested") @field:Json(name = "suggested") var suggested: Boolean,
    @Json(name = "registerMethods") @field:Json(name = "registerMethods") var registerMethods: List<Market.RegisterMethodsEnum>? = null,
    @Json(name = "loginMethods") @field:Json(name = "loginMethods") var loginMethods: List<Market.LoginMethodsEnum>? = null,
    @Json(name = "gdprLoginMethods") @field:Json(name = "gdprLoginMethods") var gdprLoginMethods: List<Market.GdprLoginMethodsEnum>? = null
) {
    /**
     * The ISO 3166-1 alpha-2 country code of the market.
     * Values: AT, AU, BE, BG, BR, CA, CY, CZ, DE, DK, EE, ES, FI, FO, FR, GB, GR, HR, HU, IE, IN, IT, LU, LV, MT, MX, NL, NO, NZ, PL, PT, RO, SE, SG, SI, SK, UK, US
     */
    @JsonClass(generateAdapter = false)
    enum class CodeEnum(val value: String) {
        @Json(name = "AT") AT("AT"),
        @Json(name = "AU") AU("AU"),
        @Json(name = "BE") BE("BE"),
        @Json(name = "BG") BG("BG"),
        @Json(name = "BR") BR("BR"),
        @Json(name = "CA") CA("CA"),
        @Json(name = "CY") CY("CY"),
        @Json(name = "CZ") CZ("CZ"),
        @Json(name = "DE") DE("DE"),
        @Json(name = "DK") DK("DK"),
        @Json(name = "EE") EE("EE"),
        @Json(name = "ES") ES("ES"),
        @Json(name = "FI") FI("FI"),
        @Json(name = "FO") FO("FO"),
        @Json(name = "FR") FR("FR"),
        @Json(name = "GB") GB("GB"),
        @Json(name = "GR") GR("GR"),
        @Json(name = "HR") HR("HR"),
        @Json(name = "HU") HU("HU"),
        @Json(name = "IE") IE("IE"),
        @Json(name = "IN") IN("IN"),
        @Json(name = "IT") IT("IT"),
        @Json(name = "LU") LU("LU"),
        @Json(name = "LV") LV("LV"),
        @Json(name = "MT") MT("MT"),
        @Json(name = "MX") MX("MX"),
        @Json(name = "NL") NL("NL"),
        @Json(name = "NO") NO("NO"),
        @Json(name = "NZ") NZ("NZ"),
        @Json(name = "PL") PL("PL"),
        @Json(name = "PT") PT("PT"),
        @Json(name = "RO") RO("RO"),
        @Json(name = "SE") SE("SE"),
        @Json(name = "SG") SG("SG"),
        @Json(name = "SI") SI("SI"),
        @Json(name = "SK") SK("SK"),
        @Json(name = "UK") UK("UK"),
        @Json(name = "US") US("US")
    }
    /**
     * Values: BANKID, EMAIL_AND_PASSWORD, SMS_OTP_AND_PIN6, PHONE_NUMBER_AND_PIN6, ABN_AMRO_PIN5, CHALLENGE_RESPONSE, NON_VALID
     */
    @JsonClass(generateAdapter = false)
    enum class RegisterMethodsEnum(val value: String) {
        @Json(name = "BANKID") BANKID("BANKID"),
        @Json(name = "EMAIL_AND_PASSWORD") EMAIL_AND_PASSWORD("EMAIL_AND_PASSWORD"),
        @Json(name = "SMS_OTP_AND_PIN6") SMS_OTP_AND_PIN6("SMS_OTP_AND_PIN6"),
        @Json(name = "PHONE_NUMBER_AND_PIN6") PHONE_NUMBER_AND_PIN6("PHONE_NUMBER_AND_PIN6"),
        @Json(name = "ABN_AMRO_PIN5") ABN_AMRO_PIN5("ABN_AMRO_PIN5"),
        @Json(name = "CHALLENGE_RESPONSE") CHALLENGE_RESPONSE("CHALLENGE_RESPONSE"),
        @Json(name = "NON_VALID") NON_VALID("NON_VALID")
    }
    /**
     * Values: BANKID, EMAIL_AND_PASSWORD, SMS_OTP_AND_PIN6, PHONE_NUMBER_AND_PIN6, ABN_AMRO_PIN5, CHALLENGE_RESPONSE, NON_VALID
     */
    @JsonClass(generateAdapter = false)
    enum class LoginMethodsEnum(val value: String) {
        @Json(name = "BANKID") BANKID("BANKID"),
        @Json(name = "EMAIL_AND_PASSWORD") EMAIL_AND_PASSWORD("EMAIL_AND_PASSWORD"),
        @Json(name = "SMS_OTP_AND_PIN6") SMS_OTP_AND_PIN6("SMS_OTP_AND_PIN6"),
        @Json(name = "PHONE_NUMBER_AND_PIN6") PHONE_NUMBER_AND_PIN6("PHONE_NUMBER_AND_PIN6"),
        @Json(name = "ABN_AMRO_PIN5") ABN_AMRO_PIN5("ABN_AMRO_PIN5"),
        @Json(name = "CHALLENGE_RESPONSE") CHALLENGE_RESPONSE("CHALLENGE_RESPONSE"),
        @Json(name = "NON_VALID") NON_VALID("NON_VALID")
    }
    /**
     * Values: BANKID, EMAIL_AND_PASSWORD, SMS_OTP_AND_PIN6, PHONE_NUMBER_AND_PIN6, ABN_AMRO_PIN5, CHALLENGE_RESPONSE, NON_VALID
     */
    @JsonClass(generateAdapter = false)
    enum class GdprLoginMethodsEnum(val value: String) {
        @Json(name = "BANKID") BANKID("BANKID"),
        @Json(name = "EMAIL_AND_PASSWORD") EMAIL_AND_PASSWORD("EMAIL_AND_PASSWORD"),
        @Json(name = "SMS_OTP_AND_PIN6") SMS_OTP_AND_PIN6("SMS_OTP_AND_PIN6"),
        @Json(name = "PHONE_NUMBER_AND_PIN6") PHONE_NUMBER_AND_PIN6("PHONE_NUMBER_AND_PIN6"),
        @Json(name = "ABN_AMRO_PIN5") ABN_AMRO_PIN5("ABN_AMRO_PIN5"),
        @Json(name = "CHALLENGE_RESPONSE") CHALLENGE_RESPONSE("CHALLENGE_RESPONSE"),
        @Json(name = "NON_VALID") NON_VALID("NON_VALID")
    }
}