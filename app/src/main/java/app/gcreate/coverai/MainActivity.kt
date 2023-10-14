package app.gcreate.coverai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.gcreate.coverai.ui.theme.CoveraiTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoveraiTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    StepsView("Android")
                }
            }
        }
    }
}

@Composable
fun StepsView(name: String, modifier: Modifier = Modifier) {
    Column {
       
    }




}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoveraiTestTheme {
        StepsView("Android")
    }
}