package com.example.botones.Componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.botones.ui.theme.Fondo
import com.example.botones.ui.theme.Fuente

@Composable
fun Objetivos() {

    // Estados para manejar cada checkbox
    var objetivo1Checked by remember { mutableStateOf(false) }
    var objetivo2Checked by remember { mutableStateOf(false) }
    var objetivo3Checked by remember { mutableStateOf(false) }

    // Estado del switch para habilitar el botón
    var isSwitchEnabled by remember { mutableStateOf(true) }

    // Estado del cuadro de texto
    var resultadoTexto by remember { mutableStateOf("") }

    // Layout principal
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Fondo)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Título
            Text(
                text = "Control de Objetivos",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Fuente,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            // Checkbox para los objetivos
            Column {
                CheckboxWithLabel(
                    text = "Objetivo 1",
                    checked = objetivo1Checked,
                    onCheckedChange = { objetivo1Checked = it }
                )
                CheckboxWithLabel(
                    text = "Objetivo 2",
                    checked = objetivo2Checked,
                    onCheckedChange = { objetivo2Checked = it }
                )
                CheckboxWithLabel(
                    text = "Objetivo 3",
                    checked = objetivo3Checked,
                    onCheckedChange = { objetivo3Checked = it }
                )
            }

            // Uso del componente CustomSwitch
            CustomSwitch(
                text = "Habilitar botón",
                isChecked = isSwitchEnabled,
                onCheckedChange = {
                    isSwitchEnabled = it
                    if (!it) resultadoTexto = ""
                }
            )

            // Uso del componente CustomButton
            CustomButton(
                text = "Mostrar resultado",
                onClick = {
                    resultadoTexto = when {
                        objetivo1Checked -> "Objetivo 1"
                        objetivo2Checked -> "Objetivo 2"
                        objetivo3Checked -> "Objetivo 3"
                        else -> "Ningún objetivo seleccionado"
                    }
                },
                isEnabled = isSwitchEnabled,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            // Cuadro de texto para mostrar el resultado
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(top = 16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = if (resultadoTexto.isEmpty()) "" else "Resultado: $resultadoTexto",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Fuente
                )
            }
        }
    }
}
