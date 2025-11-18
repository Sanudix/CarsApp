package com.example.carsapp.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.carsapp.domain.CategoryModel
import androidx.compose.runtime.State
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class CategoryViewModel: ViewModel() {
    private val _categories = mutableStateOf<List<CategoryModel>>(emptyList())
    val categories: State<List<CategoryModel>> = _categories

    private val _isLoading = mutableStateOf(true)
    val isLoading: State<Boolean> = _isLoading

    init {
        loadCategories()
    }

    private fun loadCategories() {
        val database = FirebaseDatabase.getInstance()
        val ref = database.getReference("Category")

        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                TODO("Not yet implemented")
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
    }
}