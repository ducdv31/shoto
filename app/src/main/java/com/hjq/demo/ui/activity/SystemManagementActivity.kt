package com.hjq.demo.ui.activity

import android.os.Build
import android.view.View
import androidx.annotation.RequiresApi
import com.hjq.base.BaseDialog
import com.hjq.demo.R
import com.hjq.demo.app.AppActivity
import com.hjq.demo.databinding.SystemManagementActivityBinding
import com.hjq.demo.ui.dialog.PasswordDialog
import org.jetbrains.anko.startActivity
import kotlin.system.exitProcess

class SystemManagementActivity : AppActivity() {
    private lateinit var binding: SystemManagementActivityBinding

    override fun getLayoutView(): View {
        binding = SystemManagementActivityBinding.inflate(layoutInflater)
        return binding.root
    }


    @RequiresApi(Build.VERSION_CODES.M)
    override fun initView() {
        binding.btnSystemData.setOnClickListener {
            reSetBackground()

            binding.btnSystemData.setBackgroundColor(getColor(R.color.common_button_pressed_color))
            binding.llSystemData.visibility = View.VISIBLE
        }

        binding.btnSystemStatus.setOnClickListener {
            reSetBackground()

            binding.btnSystemStatus.setBackgroundColor(getColor(R.color.common_button_pressed_color))
            binding.llCheckSystemStatus.visibility = View.VISIBLE
        }

        binding.btnOperationMode.setOnClickListener {
            reSetBackground()

            binding.btnOperationMode.setBackgroundColor(getColor(R.color.common_button_pressed_color))
            binding.llOperationMode.visibility = View.VISIBLE
        }

        binding.btnInformation.setOnClickListener {
            reSetBackground()

            binding.btnInformation.setBackgroundColor(getColor(R.color.common_button_pressed_color))
            binding.llAbout.visibility = View.VISIBLE
        }

        binding.btnSystemConfiguration.setOnClickListener {
            reSetBackground()

            binding.btnSystemConfiguration.setBackgroundColor(getColor(R.color.common_button_pressed_color))
            binding.llSystemConfiguration.visibility = View.VISIBLE
        }

        binding.imvBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        binding.llSettingTime.setOnClickListener {
            startActivity<SettingTimeActivity>()
        }

        binding.llLoggerSetting.setOnClickListener {
            PasswordDialog.Builder(
                this,
            ).onActionDone(object : PasswordDialog.Builder.OnActionDone {
                override fun onActionDone(isConfirm: Boolean, reason: String) {
                    startActivity<LoggerSettingActivity>()
                }

                override fun onActionCancel() {

                }
            }).show()
        }

        binding.llConfigureDevicePoint.setOnClickListener {
            PasswordDialog.Builder(
                this,
            ).onActionDone(object : PasswordDialog.Builder.OnActionDone {
                override fun onActionDone(isConfirm: Boolean, reason: String) {
                    startActivity<SettingDevicePointActivity>()
                }

                override fun onActionCancel() {

                }
            }).show()
        }

        binding.llExamsList.setOnClickListener {
            startActivity<ExamsDataActivity>()
        }

        binding.llStudentList.setOnClickListener {
            startActivity<StudentDataActivity>()
        }

        binding.llSensorField.setOnClickListener {
            startActivity<SensorFieldActivity>()
        }

        binding.llSensorCar.setOnClickListener {
            startActivity<SensorCarActivity>()
        }
    }

    override fun initData() {
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun reSetBackground() {
        binding.btnSystemData.setBackgroundColor(getColor(R.color.transparent))
        binding.btnSystemConfiguration.setBackgroundColor(getColor(R.color.transparent))
        binding.btnSystemStatus.setBackgroundColor(getColor(R.color.transparent))
        binding.btnOperationMode.setBackgroundColor(getColor(R.color.transparent))
        binding.btnInformation.setBackgroundColor(getColor(R.color.transparent))

        binding.llSystemData.visibility = View.GONE
        binding.llSystemConfiguration.visibility = View.GONE
        binding.llCheckSystemStatus.visibility = View.GONE
        binding.llOperationMode.visibility = View.GONE
        binding.llAbout.visibility = View.GONE
    }
}