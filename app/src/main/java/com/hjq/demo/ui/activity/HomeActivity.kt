package com.hjq.demo.ui.activity

import android.os.Looper
import android.view.View
import androidx.appcompat.content.res.AppCompatResources
import com.hjq.demo.R
import com.hjq.demo.app.AppActivity
import com.hjq.demo.databinding.HomeActivityBinding
import org.jetbrains.anko.startActivity


class HomeActivity : AppActivity() {

    private lateinit var binding: HomeActivityBinding

    //GE tốc độ vòng máy
    private var currentNumberSpeed = 1f
    private val handlerSpeed = android.os.Handler(Looper.getMainLooper())
    private lateinit var runnableSpeed: Runnable

    //GE tốc độ xe
    private var currentNumberEngine = 1
    private val handlerEngine = android.os.Handler(Looper.getMainLooper())
    private lateinit var runnableEngine: Runnable

    //Đèn tín hiệu trái
    private var isRunLightTurnSignalsLeft = false
    private var isClickLightTurnSignalsLeft = false
    private val handlerLightTurnSignalsLeft = android.os.Handler(Looper.getMainLooper())
    private lateinit var runnableLightTurnSignalsLeft: Runnable

    //Đèn tín hiệu phải
    private var isRunLightTurnSignalsRight = false
    private var isClickLightTurnSignalsRight = false
    private val handlerLightTurnSignalsRight = android.os.Handler(Looper.getMainLooper())
    private lateinit var runnableLightTurnSignalsRight: Runnable

    //Đèn tín hiệu phải
    private var isRunCarSensor = false
    private var isClickCarSensor = false
    private val handlerCarSensor = android.os.Handler(Looper.getMainLooper())
    private lateinit var runnableCarSensor: Runnable

    //Huướng di chuyển của xe
    private var isRunCarMove = false
    private var isClickCarMove = false
    private val handlerCarMove = android.os.Handler(Looper.getMainLooper())
    private lateinit var runnableCarMove: Runnable

    private var descriptionData1 =
        arrayOf("Bài 1", "Bài 2", "Bài 3", "Bài 4", "Bài 5", "Bài 6")

    private var descriptionData2 =
        arrayOf("Bài 7", "Bài 8", "Bài 9", "Bài 10", "Bài 11", "Bài 12")


    override fun getLayoutView(): View {
        binding = HomeActivityBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        // Khởi tạo Runnable để tăng số và cập nhật TextView
        runnableSpeed = Runnable {
            if (currentNumberSpeed <= 180) {
                binding.llBody.tvTotalSpeed.text = "${currentNumberSpeed.toInt()}"
                binding.llBody.gvSpeed.value = currentNumberSpeed
                currentNumberSpeed++
                handlerSpeed.postDelayed(runnableSpeed, 1000) // Lập lại Runnable sau 1 giây
            }
        }
        // Bắt đầu chạy Runnable ban đầu
        handlerSpeed.post(runnableSpeed)


        binding.llBody.gvEngine.maxValue = 8f
        binding.llBody.gvEngine.markCount = 8
        runnableEngine = Runnable {
            if (currentNumberEngine <= 8) {
                binding.llBody.tvTotalEngine.text = "${(currentNumberEngine * 1000)}"
                binding.llBody.gvEngine.value = currentNumberEngine * 22.5f
                currentNumberEngine += 1
                handlerEngine.postDelayed(runnableEngine, 1000) // Lập lại Runnable sau 1 giây
            }
        }
        // Bắt đầu chạy Runnable ban đầu
        handlerEngine.post(runnableEngine)


        //Đèn tín hiệu trái
        runnableLightTurnSignalsLeft = Runnable {
            isRunLightTurnSignalsLeft = !isRunLightTurnSignalsLeft
            if (!isRunLightTurnSignalsLeft) {
                binding.llBody.llLightTurn.llLightLeft.background =
                    AppCompatResources.getDrawable(this, R.drawable.bg_left_cluster)
                binding.llBody.llLightTurn.imvLightLeft.setImageDrawable(
                    AppCompatResources.getDrawable(
                        this,
                        R.drawable.ic_light_left
                    )
                )
            } else {
                binding.llBody.llLightTurn.llLightLeft.background =
                    AppCompatResources.getDrawable(this, R.drawable.bg_left_green)
                binding.llBody.llLightTurn.imvLightLeft.setImageDrawable(
                    AppCompatResources.getDrawable(
                        this,
                        R.drawable.ic_light_left_action
                    )
                )

            }
            handlerLightTurnSignalsLeft.postDelayed(
                runnableLightTurnSignalsLeft,
                500
            ) // Lập lại Runnable sau 1 giây
        }
        binding.llBody.llLightTurn.llLightLeft.setOnClickListener {
            isClickLightTurnSignalsLeft = !isClickLightTurnSignalsLeft
            if (!isClickLightTurnSignalsLeft) {
                handlerLightTurnSignalsLeft.post(runnableLightTurnSignalsLeft)
            } else
                handlerLightTurnSignalsLeft.removeCallbacks(runnableLightTurnSignalsLeft)
        }

        //Đèn tín hiệu phải
        runnableLightTurnSignalsRight = Runnable {
            isRunLightTurnSignalsRight = !isRunLightTurnSignalsRight
            if (!isRunLightTurnSignalsRight) {
                binding.llBody.llLightTurn.llLightRight.background =
                    AppCompatResources.getDrawable(this, com.hjq.demo.R.drawable.bg_left_cluster)
                binding.llBody.llLightTurn.imvLightRight.setImageDrawable(
                    AppCompatResources.getDrawable(
                        this,
                        com.hjq.demo.R.drawable.ic_light_right
                    )
                )
            } else {
                binding.llBody.llLightTurn.llLightRight.background =
                    AppCompatResources.getDrawable(this, R.drawable.bg_left_green)
                binding.llBody.llLightTurn.imvLightRight.setImageDrawable(
                    AppCompatResources.getDrawable(
                        this,
                        R.drawable.ic_light_right_action
                    )
                )

            }
            handlerLightTurnSignalsRight.postDelayed(
                runnableLightTurnSignalsRight,
                500
            ) // Lập lại Runnable sau 1 giây
        }
        binding.llBody.llLightTurn.llLightRight.setOnClickListener {
            isClickLightTurnSignalsRight = !isClickLightTurnSignalsRight
            if (!isClickLightTurnSignalsRight) {
                handlerLightTurnSignalsRight.post(runnableLightTurnSignalsRight)
            } else
                handlerLightTurnSignalsRight.removeCallbacks(runnableLightTurnSignalsRight)
        }

        //Cảm biến xe hơi
        runnableCarSensor = Runnable {
            isRunCarSensor = !isRunCarSensor
            if (!isRunCarSensor) {
                binding.llBody.llDataLeft.ivCarSensor.setImageDrawable(
                    AppCompatResources.getDrawable(
                        this,
                        R.drawable.car_2
                    )
                )
            } else {
                binding.llBody.llDataLeft.ivCarSensor.setImageDrawable(
                    AppCompatResources.getDrawable(
                        this,
                        R.drawable.car_1
                    )
                )
            }
            handlerCarSensor.postDelayed(
                runnableCarSensor,
                500
            ) // Lập lại Runnable sau 1 giây
        }
        binding.llBody.llDataLeft.ivCarSensor.setOnClickListener {
            isClickCarSensor = !isClickCarSensor
            if (!isClickCarSensor) {
                handlerCarSensor.post(runnableCarSensor)
            } else
                handlerCarSensor.removeCallbacks(runnableCarSensor)
        }

        //Hướng đi chuỷen cua xe
        runnableCarMove = Runnable {
            isRunCarMove = !isRunCarMove
            if (!isRunCarMove) {
                binding.llBody.llDataRight.ivCarMove.setImageDrawable(
                    AppCompatResources.getDrawable(
                        this,
                        R.drawable.car_move_1
                    )
                )
            } else {
                binding.llBody.llDataRight.ivCarMove.setImageDrawable(
                    AppCompatResources.getDrawable(
                        this,
                        R.drawable.car_move_2
                    )
                )
            }
            handlerCarMove.postDelayed(
                runnableCarMove,
                500
            ) // Lập lại Runnable sau 1 giây
        }
        binding.llBody.llDataRight.ivCarMove.setOnClickListener {
            isClickCarMove = !isClickCarMove
            if (!isClickCarMove) {
                handlerCarMove.post(runnableCarMove)
            } else
                handlerCarMove.removeCallbacks(runnableCarMove)
        }

        binding.llBody.btnSetting.setOnClickListener {
            startActivity<SystemManagementActivity>()
        }


        binding.llInformation.stateProgressBar1.setStateDescriptionData(descriptionData1)
        binding.llInformation.stateProgressBar2.setStateDescriptionData(descriptionData2)
    }


    override fun initData() {
    }


    override fun onBackPressed() {
    }

    override fun onDestroy() {
        super.onDestroy()
        // Loại bỏ Runnable khi Activity bị hủy
        handlerSpeed.removeCallbacks(runnableSpeed)
        handlerEngine.removeCallbacks(runnableEngine)
        handlerLightTurnSignalsLeft.removeCallbacks(runnableLightTurnSignalsLeft)
        handlerLightTurnSignalsRight.removeCallbacks(runnableLightTurnSignalsRight)
        handlerCarSensor.removeCallbacks(runnableCarSensor)
        handlerCarMove.removeCallbacks(runnableCarMove)
    }
}