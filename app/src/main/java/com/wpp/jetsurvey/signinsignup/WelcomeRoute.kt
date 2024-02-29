package com.wpp.jetsurvey.signinsignup

import androidx.compose.runtime.Composable

@Composable
fun WelcomeRoute(
    onNavigateToSignIn: (email: String) -> Unit,
    onNavigateToSignUp: (email: String) -> Unit,
    onSignInAsGuest: (email: String) -> Unit
) {
    WelcomeScreen(onNavigateToSignIn = onNavigateToSignIn)
}