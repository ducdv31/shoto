package com.hjq.demo.ui.adapter

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import com.hjq.demo.R
import com.hjq.demo.app.AppAdapter
import com.hjq.demo.databinding.ItemExamsBinding
import com.hjq.demo.model.Exams

class ExamsAdapter(context: Context) :
    AppAdapter<Exams>(context) {

    lateinit var onClickListener: OnClickListener

    inner class ViewHolder(val binding: ItemExamsBinding) :
        AppViewHolder(binding.root) {

        @RequiresApi(Build.VERSION_CODES.M)
        override fun onBindView(position: Int) {
            val item = getItem(position)

            if (position % 2 == 0) {
                binding.llRoot.setBackgroundColor(getContext().getColor(R.color.bg_hover_dark))
            } else {
                binding.llRoot.setBackgroundColor(getContext().getColor(R.color.transparent))
            }

            binding.tvNumber.text = item.number.toString()
            binding.tvTime.text = item.time
            binding.tvContent.text = item.content
            binding.tvNote.text = item.note

            itemView.setOnClickListener {
                onClickListener.onClick(item)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding =
            ItemExamsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    interface OnClickListener {
        fun onClick(exams: Exams)
    }
}