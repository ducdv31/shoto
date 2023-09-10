package com.hjq.demo.ui.activity

import android.view.View
import com.hjq.demo.app.AppActivity
import com.hjq.demo.databinding.DetailExamsActivityBinding
import com.hjq.demo.model.Exams
import com.hjq.demo.ui.adapter.ExamsAdapter
import com.hjq.demo.utils.AppUtils

class DetailExamsActivity : AppActivity(), ExamsAdapter.OnClickListener {
    private lateinit var binding: DetailExamsActivityBinding

    private var adapter: ExamsAdapter? = null
    private var exams = ArrayList<Exams>()

    override fun getLayoutView(): View {
        binding = DetailExamsActivityBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        binding.imvBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        exams.add(Exams(1, "12:12:00", "Quẹt thẻ RFID", "Ảnh"))
        exams.add(Exams(1, "12:12:00", "Quẹt thẻ RFID", "Ảnh"))
        exams.add(Exams(1, "12:12:00", "Quẹt thẻ RFID", "Ảnh"))
        exams.add(Exams(1, "12:12:00", "Quẹt thẻ RFID", "Ảnh"))
        exams.add(Exams(1, "12:12:00", "Quẹt thẻ RFID", "Ảnh"))
        exams.add(Exams(1, "12:12:00", "Quẹt thẻ RFID", "Ảnh"))
        exams.add(Exams(1, "12:12:00", "Quẹt thẻ RFID", "Ảnh"))
        exams.add(Exams(1, "12:12:00", "Quẹt thẻ RFID", "Ảnh"))
        exams.add(Exams(1, "12:12:00", "Quẹt thẻ RFID", "Ảnh"))
        exams.add(Exams(1, "12:12:00", "Quẹt thẻ RFID", "Ảnh"))
        exams.add(Exams(1, "12:12:00", "Quẹt thẻ RFID", "Ảnh"))
        exams.add(Exams(1, "12:12:00", "Quẹt thẻ RFID", "Ảnh"))
        exams.add(Exams(1, "12:12:00", "Quẹt thẻ RFID", "Ảnh"))
        adapter = ExamsAdapter(this)
        adapter!!.onClickListener = this
        adapter!!.setData(exams)
        AppUtils.initRecyclerView(binding.rclExam, adapter)
    }

    override fun initData() {
    }

    override fun onClick(exams: Exams) {
        TODO("Not yet implemented")
    }
}