package com.valelus.analyticsexample

sealed class EventProperty private constructor(
    val propertyName: String,
    open val value: Any?
) {
    data class Id(override val value: String) : EventProperty("id", value)
    data class Name(override val value: String) : EventProperty("name", value)
}