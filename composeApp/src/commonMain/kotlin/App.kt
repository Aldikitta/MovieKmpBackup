import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.aldikitta.core.data.di.dataModule
//import com.aldikitta.core.data.di.pagingModule
//import com.aldikitta.core.data.di.repositoryModule
//import com.aldikitta.core.domain.di.useCaseModule
//import com.aldikitta.feature.detail.navigation.detailScreen
//import com.aldikitta.feature.detail.navigation.navigateDetailScreen
//import com.aldikitta.feature.home.navigation.HOME_SCREEN
//import com.aldikitta.feature.home.navigation.homeScreen
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import moviekmp.composeapp.generated.resources.Res
import moviekmp.composeapp.generated.resources.app_name_ui
import moviekmp.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.KoinApplication
import org.koin.core.KoinApplication

const val initial = "initial"
@Composable
@Preview
fun App() {

    KoinApplication(
        application = {
//            modules(dataModule, pagingModule, repositoryModule, useCaseModule)
        }
    ) {
        MaterialTheme {
            val navController: NavHostController = rememberNavController()

            Column {
                Text("Syahirah")
            }

//            NavHost(
//                navController = navController,
//                route = initial,
//                startDestination = HOME_SCREEN,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .verticalScroll(rememberScrollState())
//            ) {
//                homeScreen {
//                    navController.navigateDetailScreen()
//                }
//
//                detailScreen()
//            }
        }
    }
}