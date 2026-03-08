package slowscript.warpinator.core.network.messages

import androidx.compose.material3.SnackbarDuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import slowscript.warpinator.R
import slowscript.warpinator.core.model.ui.UiMessage
import slowscript.warpinator.core.model.ui.UiMessageState

class FailedToStartV2 : UiMessage() {
    @Composable
    override fun getState(): UiMessageState {
        return UiMessageState(
            message = stringResource(R.string.running_in_legacy_mode_message),
            duration = SnackbarDuration.Indefinite,
        )
    }
}