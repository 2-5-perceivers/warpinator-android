package slowscript.warpinator.core.network.messages

import androidx.compose.material3.SnackbarDuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import slowscript.warpinator.R
import slowscript.warpinator.core.model.ui.UiMessage
import slowscript.warpinator.core.model.ui.UiMessageState

class FailedToUnregister(val exception: Exception) : UiMessage() {
    @Composable
    override fun getState(): UiMessageState {
        return UiMessageState(
            message = stringResource(
                R.string.unregistering_failed_message,
                exception.message ?: stringResource(R.string.unknown_error),
            ),
            duration = SnackbarDuration.Long,
        )
    }
}