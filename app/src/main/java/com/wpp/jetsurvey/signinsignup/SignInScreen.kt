package com.wpp.jetsurvey.signinsignup

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wpp.jetsurvey.R

@Composable
fun SignInScreen() {
    Scaffold(
        topBar = {
            SignInSignUpTopAppBar(title = stringResource(id = R.string.sign_in))
        }
    ) { contentPadding ->
        SignInSignUpScreen(
            modifier = Modifier.fillMaxSize(),
            contentPadding = contentPadding
        ) {
            Column {
                SignInContent()
                Spacer(modifier = Modifier.height(16.dp))
                TextButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = stringResource(id = R.string.forgot_password))
                }
            }
        }
    }
}

@Composable
fun SignInContent() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Email()

        Spacer(modifier = Modifier.height(16.dp))
        Password(label = "Password")

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        ) {
            Text(text = stringResource(id = R.string.sign_in))
        }
    }
}

@Preview
@Composable
fun SignInScreenPreview() {
    SignInScreen()
}