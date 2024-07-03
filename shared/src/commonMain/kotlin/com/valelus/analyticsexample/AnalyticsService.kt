package com.valelus.analyticsexample

interface AnalyticsService {
    fun logEvent(event: Event)
}

expect fun provideAnalyticsServices(): List<AnalyticsService>