package com.ladkeindia.ladkeandroid

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.ActivityResultLauncher
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.room.Room
import androidx.room.RoomDatabase
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.FirebaseAuthUIActivityResultContract
import com.firebase.ui.auth.data.model.FirebaseAuthUIAuthenticationResult
import com.google.firebase.auth.FirebaseAuth
import com.ladkeindia.ladkeandroid.data.jobseeker.DatabaseSingleton
import com.ladkeindia.ladkeandroid.data.jobseeker.JobSeekerDatabase
import com.ladkeindia.ladkeandroid.data.jobseeker.model.JobDetail
import com.ladkeindia.ladkeandroid.data.jobseeker.model.JobPreference
import com.ladkeindia.ladkeandroid.data.jobseeker.model.JobSeeker
import com.ladkeindia.ladkeandroid.data.jobseeker.model.Location
import com.ladkeindia.ladkeandroid.data.jobseeker.model.Skill
import com.ladkeindia.ladkeandroid.ui.theme.LadkeandroidTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

typealias Id = Int
class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val signInLauncher = registerFirebase()
        val providers = arrayListOf(
            AuthUI.IdpConfig.EmailBuilder().build(),
            AuthUI.IdpConfig.PhoneBuilder().build(),
            AuthUI.IdpConfig.GoogleBuilder().build(),
            //AuthUI.IdpConfig.FacebookBuilder().build(),
            //AuthUI.IdpConfig.TwitterBuilder().build(),
        )



        var db = DatabaseSingleton().instance

        db.jobSeekerDao().getJobSeeker("1")

        GlobalScope.launch {
            withContext(Dispatchers.IO) {
//                db.jobSeekerDao().addJobSeeker(JobSeeker(1,"Rahul",31, Location("Indore","MP","India"),Location("Indore","MP","India"),Array<JobDetail>(),
//                    JobPreference("1",),Array<Skill>())


            }
        }





        // Create and launch sign-in intent
        val signInIntent = AuthUI.getInstance()
            .createSignInIntentBuilder()
            .setAvailableProviders(providers)
            .build()
        setContent {
            LadkeandroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column{
                        Button(
                            onClick={
                                signInLauncher.launch(signInIntent)
                        }){
                            Text("Login")
                        }
                        Greeting("Ladke Welcome to Android")
                    }

                }
            }
        }
    }

    private fun registerFirebase(): ActivityResultLauncher<Intent> {

        var signInLauncher = registerForActivityResult(
            FirebaseAuthUIActivityResultContract(),
        ) { res ->

            this.onSignInResult(res)
        }
        // Choose authentication providers

        return signInLauncher
    }

    private fun onSignInResult(result: FirebaseAuthUIAuthenticationResult?) {
        val response = result?.idpResponse
        if (result?.resultCode == RESULT_OK) {
            // Successfully signed in
            val user = FirebaseAuth.getInstance().currentUser
            // ...
        } else {
            // Sign in failed. If response is null the user canceled the
            // sign-in flow using the back button. Otherwise check
            // response.getError().getErrorCode() and handle the error.
            // ...
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LadkeandroidTheme {
        Column{
            Button(
                onClick={
                }){
                Text("Login")
            }
            Greeting("Ladke Welcome to Android")
        }

    }
}