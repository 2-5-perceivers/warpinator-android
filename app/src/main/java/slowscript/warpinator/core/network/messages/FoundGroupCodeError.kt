package slowscript.warpinator.core.network.messages

import androidx.compose.material3.SnackbarDuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import slowscript.warpinator.R
import slowscript.warpinator.core.model.ui.UiMessage
import slowscript.warpinator.core.model.ui.UiMessageState

class FoundGroupCodeError : UiMessage() {
    @Composable
    override fun getState(): UiMessageState {
        return UiMessageState(
            message = stringResource(R.string.found_devices_using_different_group_codes_message),
            duration = SnackbarDuration.Indefinite,
        )
    }

    override val id = "FoundGroupCodeError"
}