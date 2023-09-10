package com.hjq.demo.ui.activity

import android.view.View
import com.hjq.demo.app.AppActivity
import com.hjq.demo.databinding.StudentDataActivityBinding
import com.hjq.demo.model.Student
import com.hjq.demo.ui.adapter.StudentDataAdapter
import com.hjq.demo.utils.AppUtils
import org.jetbrains.anko.startActivity

class StudentDataActivity : AppActivity(), StudentDataAdapter.OnClickListener {
    private lateinit var binding: StudentDataActivityBinding
    private var adapter: StudentDataAdapter? = null
    private var student = ArrayList<Student>()

    override fun getLayoutView(): View {
        binding = StudentDataActivityBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        binding.imvBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        student.add(
            Student(
                1,
                "Nguyễn Văn A",
                "12-12-2002",
                "23423424",
                "11",
                "423452354",
                "12-2-2023",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )

        student.add(
            Student(
                1,
                "Nguyễn Văn A",
                "12-12-2002",
                "23423424",
                "11",
                "423452354",
                "12-2-2023",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        student.add(
            Student(
                1,
                "Nguyễn Văn A",
                "12-12-2002",
                "23423424",
                "11",
                "423452354",
                "12-2-2023",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        student.add(
            Student(
                1,
                "Nguyễn Văn A",
                "12-12-2002",
                "23423424",
                "11",
                "423452354",
                "12-2-2023",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        student.add(
            Student(
                1,
                "Nguyễn Văn A",
                "12-12-2002",
                "23423424",
                "11",
                "423452354",
                "12-2-2023",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        student.add(
            Student(
                1,
                "Nguyễn Văn A",
                "12-12-2002",
                "23423424",
                "11",
                "423452354",
                "12-2-2023",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        student.add(
            Student(
                1,
                "Nguyễn Văn A",
                "12-12-2002",
                "23423424",
                "11",
                "423452354",
                "12-2-2023",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        student.add(
            Student(
                1,
                "Nguyễn Văn A",
                "12-12-2002",
                "23423424",
                "11",
                "423452354",
                "12-2-2023",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        student.add(
            Student(
                1,
                "Nguyễn Văn A",
                "12-12-2002",
                "23423424",
                "11",
                "423452354",
                "12-2-2023",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )
        student.add(
            Student(
                1,
                "Nguyễn Văn A",
                "12-12-2002",
                "23423424",
                "11",
                "423452354",
                "12-2-2023",
                "12-1-2023",
                "22-1-2023",
                900
            )
        )


        adapter = StudentDataAdapter(this)
        adapter!!.onClickListener = this
        adapter!!.setData(student)
        AppUtils.initRecyclerView(binding.rclExamData, adapter)
    }

    override fun initData() {

    }

    override fun onClick(student: Student) {
        startActivity<DetailExamsActivity>()
    }
}