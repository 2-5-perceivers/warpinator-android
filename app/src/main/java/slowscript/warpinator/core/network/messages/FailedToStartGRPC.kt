package slowscript.warpinator.core.network.messages

import androidx.compose.material3.SnackbarDuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import slowscript.warpinator.R
import slowscript.warpinator.core.model.ui.UiMessage
import slowscript.warpinator.core.model.ui.UiMessageState

class FailedToStartGRPC : UiMessage() {
    @Composable
    override fun getState(): UiMessageState {
        return UiMessageState(
            message = stringResource(R.string.failed_to_start_grpc_server_message),
            duration = SnackbarDuration.Indefinite,
        )
    }
}