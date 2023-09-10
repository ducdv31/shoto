package com.hjq.demo.ui.adapter

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import com.hjq.demo.R
import com.hjq.demo.app.AppAdapter
import com.hjq.demo.databinding.ItemExamsDataBinding
import com.hjq.demo.model.ExamsData

class ExamsDataAdapter(context: Context) :
    AppAdapter<ExamsData>(context) {

    lateinit var onClickListener: OnClickListener

    inner class ViewHolder(val binding: ItemExamsDataBinding) :
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
            binding.tvSession.text = item.session
            binding.tvExams.text = item.exams
            binding.tvName.text = item.name
            binding.tvBirthday.text = item.birthday
            binding.tvCode.text = item.code
            binding.tvTimeStart.text = item.timeStart
            binding.tvTimeEnd.text = item.timeEnd
            binding.tvTotalPoint.text = item.totalPoint.toString()

            itemView.setOnClickListener {
                onClickListener.onClick(item)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding =
            ItemExamsDataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    interface OnClickListener {
        fun onClick(exams: ExamsData)
    }
}