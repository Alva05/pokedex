package com.example.myapplication

data class PokePagination(
    val count: Int,
    val next: String,
    val previous: String,
    val results: List<Result>
)