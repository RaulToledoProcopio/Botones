package com.example.botones.Componentes

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.botones.ui.theme.FondoGrisOscuro
import com.example.botones.ui.theme.LetraVerde

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    isEnabled: Boolean,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        enabled = isEnabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = LetraVerde,
            contentColor = FondoGrisOscuro
        ),
        modifier = modifier
    ) {
        Text(text = text)
    }
}
