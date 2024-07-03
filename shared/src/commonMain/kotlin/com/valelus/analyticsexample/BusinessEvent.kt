package com.valelus.analyticsexample

sealed class BusinessEvent private constructor(
    name: String,
    properties: List<EventProperty> = listOf(),
) : Event(name, properties) {

    sealed class Home private constructor(
        action: String,
        properties: List<EventProperty> = listOf(),
    ): BusinessEvent("Home screen $action", properties) {

        object ScreenStarted : Home(action = " Started")

        data class ItemClicked(
            val itemId: String
        ) : Home(
            action = " Item Clicked",
            properties = listOf(EventProperty.Id(itemId))
        )
    }
}