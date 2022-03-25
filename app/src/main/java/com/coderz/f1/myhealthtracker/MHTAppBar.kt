package com.coderz.f1.myhealthtracker

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@Composable
fun MHTAppBar(){
    TopAppBar(
        modifier= Modifier.fillMaxWidth(),
        backgroundColor =
            if(isSystemInDarkTheme()) MaterialTheme.colors.primary else MaterialTheme.colors.primary,
        navigationIcon = {
            Icon(
                painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "",
                tint =
                    if(isSystemInDarkTheme()) MaterialTheme.colors.onSurface else MaterialTheme.colors.onPrimary
            )
        },
        title = {
            Text(
                text= stringResource(id = R.string.app_name),
                color=
                    if(isSystemInDarkTheme()) MaterialTheme.colors.onSurface else MaterialTheme.colors.onPrimary
            )
        }
    )
}