package com.hjq.demo.ui.activity

import android.view.View
import com.hjq.demo.app.AppActivity
import com.hjq.demo.databinding.ExamsDataActivityBinding
import com.hjq.demo.model.ExamsData
import com.hjq.demo.ui.adapter.ExamsDataAdapter
import com.hjq.demo.utils.AppUtils
import org.jetbrains.anko.startActivity

class ExamsDataActivity : AppActivity(), ExamsDataAdapter.OnClickListener {
    private lateinit var binding: ExamsDataActivityBinding
    private var adapter: ExamsDataAdapter? = null
    private var examsData = ArrayList<ExamsData>()

    override fun getLayoutView(): View {
        binding = ExamsDataActivityBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        binding.imvBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        examsData.add(
            ExamsData(
                1,
                "13-1-2023",
                "2334214324_01",
                "23423424",
                "Nguyen Van A",
                "11-2-1999",
                "11",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )

        adapter = ExamsDataAdapter(this)
        adapter!!.onClickListener = this
        adapter!!.setData(examsData)
        AppUtils.initRecyclerView(binding.rclExamData, adapter)
    }

    override fun initData() {
    }

    override fun onClick(exams: ExamsData) {
        startActivity<DetailExamsActivity>()
    }
}