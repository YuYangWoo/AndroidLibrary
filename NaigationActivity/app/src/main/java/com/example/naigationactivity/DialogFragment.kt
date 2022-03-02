package com.example.naigationactivity

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import com.example.library.binding.BindingDialogFragment
import com.example.naigationactivity.databinding.DialogFragmentAlertBinding
import java.lang.NullPointerException

class DialogFragment : BindingDialogFragment<DialogFragmentAlertBinding>(R.layout.dialog_fragment_alert) {
    override fun init() {
        super.init()
        try {
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog?.window?.requestFeature(Window.FEATURE_NO_TITLE)
        } catch (e: NullPointerException) {
            e.printStackTrace()
        }
    }

    override fun onResume() {
        super.onResume()
        requireContext().dialogFragmentResize(this@DialogFragment, 0.7f, 0.3f)
    }
}