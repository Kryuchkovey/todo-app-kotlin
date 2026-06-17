package com.example.todoapp.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.todoapp.data.TodoDatabase
import com.example.todoapp.data.TodoEntity
import com.example.todoapp.data.TodoRepository
import kotlinx.coroutines.launch

class TodoViewModel(application: Application) : AndroidViewModel(application) {
    
    private val repository: TodoRepository
    val allTodos: LiveData<List<TodoEntity>>
    val activeTodos: LiveData<List<TodoEntity>>
    val completedTodos: LiveData<List<TodoEntity>>
    
    init {
        val todoDao = TodoDatabase.getDatabase(application).todoDao()
        repository = TodoRepository(todoDao)
        allTodos = repository.allTodos
        activeTodos = repository.activeTodos
        completedTodos = repository.completedTodos
    }
    
    fun insertTodo(title: String, description: String, priority: String = "Normal") {
        viewModelScope.launch {
            repository.insertTodo(
                TodoEntity(
                    title = title,
                    description = description,
                    priority = priority
                )
            )
        }
    }
    
    fun updateTodo(todo: TodoEntity) {
        viewModelScope.launch {
            repository.updateTodo(todo)
        }
    }
    
    fun deleteTodo(todo: TodoEntity) {
        viewModelScope.launch {
            repository.deleteTodo(todo)
        }
    }
    
    fun toggleTodo(todo: TodoEntity) {
        viewModelScope.launch {
            repository.updateTodo(todo.copy(isCompleted = !todo.isCompleted))
        }
    }
    
    fun searchTodos(query: String): LiveData<List<TodoEntity>> {
        return repository.searchTodos(query)
    }
    
    fun clearCompleted() {
        viewModelScope.launch {
            repository.clearCompleted()
        }
    }
}
