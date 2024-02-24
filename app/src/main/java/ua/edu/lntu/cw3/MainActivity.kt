package ua.edu.lntu.cw3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ua.edu.lntu.cw3.ui.theme.IPZ_CR_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CR_3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainApp()
                }
            }
        }
    }
}

@Composable
fun MainApp(modifier: Modifier = Modifier) {
    LazyColumn{
        items(20) {
            index -> Row(Modifier.padding(16.dp)){
                Column {
                    ListItem(Modifier.padding(8.dp), "item: " + (index + 1), "button: " + (index * index + 1))
                }
            Column {
                ListItem(Modifier.padding(8.dp), "item: " + (index + 2), "button: " + ((index + 2) * (index + 1)))
            }
        }
        }
    }
}

@Composable
fun ListItem(modifier:Modifier = Modifier, message: String = "test", buttonMessage: String = "button") {
    Text(message, modifier = modifier)
    Button(onClick = { /*TODO*/ }, modifier = modifier) {
        Text(text = buttonMessage)
    }
}