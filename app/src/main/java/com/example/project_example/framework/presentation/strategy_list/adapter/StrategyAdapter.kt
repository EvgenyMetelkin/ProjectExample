package com.example.project_example.framework.presentation.strategy_list.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.project_example.business.domain.model.DataItem
import com.example.project_example.framework.presentation.strategy_list.clicklisteners.ListFragmentClickListener
import java.util.*

class StrategyAdapter : RecyclerView.Adapter<StrategyViewHolder>() {

    private var items: List<DataItem?>? = ArrayList()
    private var clickListener: ListFragmentClickListener? = null

    fun setClickListener(clickListener: ListFragmentClickListener?) {
        this.clickListener = clickListener
    }

    fun updateItems(items: List<DataItem?>?) {
        this.items = items
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StrategyViewHolder {
        return StrategyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: StrategyViewHolder, position: Int) {
        holder.onBind(items!![position], clickListener)
    }

    override fun getItemCount(): Int {
        return items!!.size
    }
}