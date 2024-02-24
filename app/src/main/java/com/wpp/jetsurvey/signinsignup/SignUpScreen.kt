package com.wpp.jetsurvey.signinsignup

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wpp.jetsurvey.R
import com.wpp.jetsurvey.ui.theme.JetSurveyTheme
import com.wpp.jetsurvey.ui.theme.stronglyDeemphasizedAlpha

@Composable
fun SignUpScreen() {
    Scaffold(
        topBar = {
            SignInSignUpTopAppBar(title = stringResource(id = R.string.create_account))
        }
    ) { contentPadding ->
        SignInSignUpScreen(
            modifier = Modifier.fillMaxSize(),
            contentPadding = contentPadding
        ) {
            Column {
                SignUpContent()
            }
        }
    }
}

@Composable
private fun SignUpContent() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Email()

        Spacer(modifier = Modifier.height(16.dp))
        Password(label = stringResource(id = R.string.password))

        Spacer(modifier = Modifier.height(16.dp))
        Password(label = stringResource(id = R.string.confirm_password))

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(id = R.string.terms_and_conditions),
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = stronglyDeemphasizedAlpha)
        )

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = stringResource(id = R.string.create_account))
        }
    }
}

@Preview
@Composable
fun SignUpScreenPreview() {
    JetSurveyTheme {
        SignUpScreen()
    }
}