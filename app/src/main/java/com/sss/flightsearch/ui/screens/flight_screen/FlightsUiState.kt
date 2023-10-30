package com.sss.flightsearch.ui.screens.flight_screen

import com.sss.flightsearch.model.Airport
import com.sss.flightsearch.model.Favorite

data class FlightsUiState(
    val code: String = "",
    val favoriteList: List<Favorite> = emptyList(),
    val destinationList: List<Airport> = emptyList(),
    val departureAirport: Airport = Airport(),
)
