package com.sss.flightsearch.ui.screens.search

import com.sss.flightsearch.model.Airport
import com.sss.flightsearch.model.Favorite

data class SearchUiState(
    val searchQuery: String = "",
    val selectedCode: String = "",
    val airportList: List<Airport> = emptyList(),
    val favoriteList: List<Favorite> = emptyList(),
)