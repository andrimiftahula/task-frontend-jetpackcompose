package com.nusantara.bajuadatapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nusantara.bajuadatapp.R
import com.nusantara.bajuadatapp.model.B_BajuAdat
import com.nusantara.bajuadatapp.ui.theme.BajuAdatAppTheme

@Composable
fun MenteeItem(
    b_BajuAdat: B_BajuAdat,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = b_BajuAdat.photo),
            contentDescription = b_BajuAdat.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = b_BajuAdat.name, style = MaterialTheme.typography.titleMedium)
            Row {
                Text(text = " - ")
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//private fun BarisBajuItemPreview() {
//    BajuAdatAppTheme {
//        BarisBajuItem(
//            mentee = B_BajuAdat(
//                1,
//                "Aceh Darussalam",
//                R.drawable.aceh,
//            )
//        )
//    }
//}

