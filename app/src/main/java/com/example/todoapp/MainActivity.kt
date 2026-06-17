package com.example.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.example.todoapp.ui.TodoScreen
import com.example.todoapp.ui.TodoViewModel
import com.example.todoapp.ui.theme.TodoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val viewModel = ViewModelProvider(this).get(TodoViewModel::class.java)
        
        setContent {
            TodoAppTheme {
                TodoScreen(viewModel = viewModel)
            }
        }
    }
}
