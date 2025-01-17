package com.nusantara.bajuadatapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nusantara.bajuadatapp.R
import com.nusantara.bajuadatapp.model.K_BajuAdat
import com.nusantara.bajuadatapp.ui.theme.BajuAdatAppTheme

@Composable
fun MentorItem(
    K_BajuAdat : K_BajuAdat,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(K_BajuAdat.id)
        }
    ) {
        Image(
            painter = painterResource(id = K_BajuAdat.photo),
            contentDescription = K_BajuAdat.name, modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Text(
            text = K_BajuAdat.name,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun K_BajuAdatItemHorizontalPreview() {
    BajuAdatAppTheme {
        MentorItem(
            K_BajuAdat = K_BajuAdat(1, "Aceh Darussalam", "KAceh", R.drawable.aceh),
            onItemClicked = { K_BajuAdatId ->
                println("K_BajuAdat Id : $K_BajuAdatId")
            }
        )
    }
}