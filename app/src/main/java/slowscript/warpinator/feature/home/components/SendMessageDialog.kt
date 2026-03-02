package slowscript.warpinator.feature.home.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.Send
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SendMessageDialog(
    onSendMessage: (String) -> Unit,
    onDismiss: () -> Unit = {},
) {
    var text by rememberSaveable { mutableStateOf("") }


    AlertDialog(
        onDismissRequest = onDismiss,
        icon = {
            Icon(Icons.AutoMirrored.Rounded.Send, contentDescription = null)
        },
        title = { Text("Send a message") },
        confirmButton = {
            Button(
                onClick = {
                    onDismiss()
                    onSendMessage(text)
                },
                enabled = text.isNotBlank(),
            ) { Text("Send") }
        },
        text = {
            OutlinedTextField(
                value = text,
                onValueChange = {
                    text = it
                },
                label = { Text("Message") },
            )
        },
    )
}

@Preview
@Composable
fun SendMessageDialogPreview() {
    SendMessageDialog(
        onSendMessage = {},
        onDismiss = {},
    )
}