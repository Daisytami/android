package com.example.daizysapplication

import android.graphics.fonts.FontStyle
import android.os.Bundle
import android.provider.FontsContract.Columns
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.daizysapplication.ui.theme.DaizysApplicationTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            About()

            }
        }



@Preview(showBackground = true)
@Composable
fun About() {
    Column(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize()
            .padding(start = 10.dp, top = 10.dp),
horizontalAlignment = Alignment.CenterHorizontally,//for columns
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            "Welcome To The Finest Art Exhibition Kenya ",
            fontSize = 34.sp,
            color = Color(0xff2A2224),
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,

            )
        Spacer(modifier = Modifier
            .height(20.dp)

        )
        Text(
            "WE ARE HERE!",
            color = Color(0xff400F1A),
            modifier =Modifier
                .padding(bottom = 10.dp)

        )
        Text(
            "Latest Lifestle updates for exquisite women living in mordern times with ancient taste.",
            fontSize = 12.sp,
            modifier = Modifier
                .background(Color(0xff60585A))
             )
        Spacer(modifier = Modifier
            .height(15.dp)
        )
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color(0xff60585A)),
            shape =  RoundedCornerShape(10.dp), // RectangleShape
            modifier =Modifier
                .padding(top= 20.dp)


            ) {
            Text(
                "Our Services",
                 color = Color(0xffF8FAF4)
            )
        }
        Image(
            painter = painterResource(id =R.drawable.dazzle),
            contentDescription = "art",
            modifier = Modifier
                .size(400.dp)
                .clip(RoundedCornerShape(10.dp))
                .padding(top =-10.dp)
                .border(3.dp, Color.Blue)



        )















//horizontalArrangement is used for rows to align
//modifier acts like a css for Android,they start with a dot
// YOU import by pressing= alt them enter
//two paddings makes a margin

            }

             }
}


