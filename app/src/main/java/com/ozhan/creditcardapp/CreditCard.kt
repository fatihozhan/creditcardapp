package com.ozhan.creditcardapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CreditCard(cardInfo: CardInfo) {
    Card(
        modifier = Modifier.height(200.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = 8.dp,

        ) {
        Box() {
        Image(
            painter = painterResource(id = cardInfo.providerImage),
            contentDescription = "Visa",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Box(modifier = Modifier.padding(16.dp).fillMaxSize()) {
            Image(
                painter = painterResource(id = cardInfo.backgroundImage),
                contentDescription = "Provider Image",
                modifier = Modifier
                    .width(86.dp)
                    .align(Alignment.TopStart)
            )
            Column(modifier = Modifier.align(Alignment.BottomStart)) {
                Text(text = cardInfo.cardNumber, fontSize = 16.sp, letterSpacing = 1.2.sp)
                Text(text = cardInfo.cardHolder, fontSize = 16.sp, letterSpacing = 1.1.sp)
            }
        }

        }

    }
}

@Composable
fun DisplayCard() {
    var cards = listOf(
        CardInfo("1111 2222 3333 4444", "Fatih ÖZHAN", R.drawable.card1, R.drawable.mastercard),
        CardInfo("1111 2222 3333 4444", "Nizamettin BOYNUBÜKÜK", R.drawable.card2, R.drawable.mastercard),
        CardInfo("1111 2222 3333 4444", "Cehalet ABASIKARA", R.drawable.card3, R.drawable.visa),
        CardInfo("1111 2222 3333 4444", "Maskü PESKÜ", R.drawable.card4, R.drawable.visa)
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        items(cards) { card ->
            CreditCard(cardInfo = card)
        }
    }
}