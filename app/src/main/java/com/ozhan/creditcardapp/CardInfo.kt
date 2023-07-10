package com.ozhan.creditcardapp

data class CardInfo(
    val cardNumber: String,
    val cardHolder: String,
    val providerImage: Int, //Android Studio da resimler INT veri tipinde,
    val backgroundImage: Int
    )