package com.nusantara.bajuadatapp.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nusantara.bajuadatapp.ui.theme.BajuAdatAppTheme
import androidx.compose.material3.MaterialTheme

//@Composable
//fun ProfileCard(
//    imageUrl: String,
//    name: String,
//    email: String,
//    university: String,
//    major: String
//) {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp),
//        elevation = 4.dp
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.foto_profile),
//                contentDescription = "Foto Profil",
//                modifier = Modifier
//                    .size(100.dp)
//                    .padding(bottom = 16.dp)
//            )
//
//            Text(
//                text = name,
//                style = MaterialTheme.typography,
//                fontWeight = FontWeight.Bold
//            )
//
//            Text(
//                text = email,
//                style = MaterialTheme.typography
//            )
//
//            Spacer(modifier = Modifier.height(8.dp))
//
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                Text(
//                    text = "Universitas: $university",
//                    style = MaterialTheme.typography
//                )
//
//                Text(
//                    text = "Jurusan: $major",
//                    style = MaterialTheme.typography
//                )
//            }
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    BajuAdatAppTheme {
//        ProfileCard(
//            imageUrl = R.drawable.foto_profile,
//            name = "Andri Miftahul Akhyar",
//            email = "andrima183@gmail.com",
//            university = "Universitas Bina Sarana Informatika",
//            major = "Teknologi Komputer"
//        )
//    }
//}
