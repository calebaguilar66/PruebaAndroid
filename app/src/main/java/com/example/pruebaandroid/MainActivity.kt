package com.example.pruebaandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pruebaandroid.ui.theme.PruebaAndroidTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PruebaAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Greeting(modifier: Modifier = Modifier) {
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Logo()
            Text("Caleb Aguilar", fontSize = 30.sp)
            Text("Informatico", fontSize = 12.sp)

            Row{
                LogoPequeño()
                Text("+9237897237", fontSize = 12.sp)
            }
            Row{
                LogoPequeño()
                Text("caleb@gmail.cl", fontSize = 12.sp)

            }
            Row{
                LogoPequeño()
                Text("@calebaguilar66", fontSize = 12.sp)

            }
        }
}
@Composable
fun Logo(){
    val imagen = painterResource(R.drawable.images)
    Image(imagen, null)
}
@Composable
fun LogoPequeño(){
    val imagenn = painterResource(R.drawable.images)
    Icon(imagenn, null, Modifier.size(20.dp))
}
