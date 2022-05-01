package com.example.simple.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.simple.databinding.ItemCategoryBinding

class CategoryAdapter : RecyclerView.Adapter<CategoryAdapter.InputViewHolder> () {
    private var categories = mutableListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InputViewHolder {
        val binding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return InputViewHolder(binding)
    }

    override fun onBindViewHolder(holder: InputViewHolder, position: Int) {
        val category = categories[position]
        holder.loadCategory(category)
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    fun addCategory(categories: List<String>) {
        this.categories = categories.toMutableList()
        notifyDataSetChanged()
    }

    class InputViewHolder(
        private val binding: ItemCategoryBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun loadCategory(category: String) {
            binding.tvCategory.text = category
        }
    }
}