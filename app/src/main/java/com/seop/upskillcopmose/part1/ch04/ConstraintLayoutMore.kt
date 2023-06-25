package com.seop.upskillcopmose.part1.ch04

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import androidx.constraintlayout.compose.layoutId
import com.seop.upskillcopmose.R

@Composable
fun ConstraintLayoutMore() {
    val constraintSet = ConstraintSet {
        val profile = createRefFor("profile")
        val title = createRefFor("title")
        val desc = createRefFor("desc")

        constrain(profile) {
            start.linkTo(anchor = parent.start, margin = 8.dp)
            centerVerticallyTo(parent)
        }

        constrain(title) {
            linkTo(
                profile.end, parent.end, startMargin = 8.dp, endMargin = 8.dp
            )
            width = Dimension.fillToConstraints
        }

        constrain(desc) {
            linkTo(
                profile.end, parent.end, startMargin = 8.dp, endMargin = 8.dp
            )
            width = Dimension.fillToConstraints
        }

        val chain = createVerticalChain(
            title, desc, chainStyle = ChainStyle.Packed
        )

        constrain(chain) {
            top.linkTo(parent.top, margin = 8.dp)
            bottom.linkTo(parent.bottom, margin = 8.dp)
        }
    }

    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        modifier = Modifier.padding(4.dp)
    ) {
        ConstraintLayout(
            constraintSet = constraintSet, modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "profile image",
                modifier = Modifier.size(40.dp).layoutId("profile")
            )

            Text(
                text = "Seop", modifier = Modifier.layoutId("title")
            )

            Text(
                text = "Hello! My name is seop. Hello! My name is seop. Hello! My name is seop. Hello! My name is seop.",
                modifier = Modifier.layoutId("desc")
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewConstraintLayoutMore() {
    ConstraintLayoutMore()
}
