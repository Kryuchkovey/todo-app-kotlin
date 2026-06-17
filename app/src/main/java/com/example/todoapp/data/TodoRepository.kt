package com.example.todoapp.data

import androidx.lifecycle.LiveData

class TodoRepository(private val todoDao: TodoDao) {
    
    val allTodos: LiveData<List<TodoEntity>> = todoDao.getAllTodos()
    val activeTodos: LiveData<List<TodoEntity>> = todoDao.getActiveTodos()
    val completedTodos: LiveData<List<TodoEntity>> = todoDao.getCompletedTodos()
    
    suspend fun insertTodo(todo: TodoEntity) {
        todoDao.insertTodo(todo)
    }
    
    suspend fun updateTodo(todo: TodoEntity) {
        todoDao.updateTodo(todo)
    }
    
    suspend fun deleteTodo(todo: TodoEntity) {
        todoDao.deleteTodo(todo)
    }
    
    fun searchTodos(query: String): LiveData<List<TodoEntity>> {
        return todoDao.searchTodos(query)
    }
    
    suspend fun clearCompleted() {
        todoDao.clearCompleted()
    }
}
