package com.valelus.analyticsexample

abstract class Event internal constructor(
    val name: String,
    val eventProperties: List<EventProperty> = listOf(),
)