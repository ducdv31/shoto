package com.hjq.demo.widget

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.res.ResourcesCompat
import com.hjq.demo.R

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 28/09/2022
 */
open class AppTextLedNumber : AppCompatTextView {
    var typeFont = ResourcesCompat.getFont(context, R.font.digital2)

    constructor(context: Context?) : super(context!!) {
        setFontsTextView()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(
        context!!, attrs
    ) {
        setFontsTextView()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context!!, attrs, defStyleAttr
    ) {
        setFontsTextView()
    }

    private fun setFontsTextView() {
        typeface = typeFont
    }
}