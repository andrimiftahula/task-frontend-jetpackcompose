package com.nusantara.bajuadatapp.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nusantara.bajuadatapp.data.DummyData
import com.nusantara.bajuadatapp.model.B_BajuAdat
import com.nusantara.bajuadatapp.model.K_BajuAdat
import com.nusantara.bajuadatapp.navigation.Screen
//import com.nusantara.bajuadatapp.presentation.component.MenteeItem
//import com.nusantara.bajuadatapp.presentation.component.BarisBajuItem

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    k_BajuAdat : List< K_BajuAdat> = DummyData.mobileKbajuAdat,
    b_BajuAdat : List< B_BajuAdat> = DummyData.mobileBBajuAdat,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            )
            {
                items(k_BajuAdat, key = { it.id }) {
//                    K_BajuAdatItem(mentor = it) { mentorId ->
//                        navController.navigate(Screen.Detail.route + "/$mentorId")
                }
            }
        }
        items(b_BajuAdat, key = { it.id }) {
//            MenteeItem(mentee = it, modifier = Modifier.padding(horizontal = 16.dp))
        }
    }
}