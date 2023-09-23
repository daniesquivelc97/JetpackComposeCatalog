package com.example.jetpackcomposecatalog

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*

@Composable
fun MyDialog(show: Boolean, onDismiss: () -> Unit, onCOnfirm: () -> Unit) {
    if (show) {
        AlertDialog(
            title = { Text(text = "Ejemplo") },
            text = { Text(text = "Esto es un ejemplo") },
            onDismissRequest = { onDismiss() },
            confirmButton = {
                TextButton(onClick = { onCOnfirm() }) {
                    Text(text = "Confirmar")
                }
            },
            dismissButton = {
                TextButton(onClick = { onDismiss() }) {
                    Text(text = "Cerrar")
                }
            }
        )
    }
}