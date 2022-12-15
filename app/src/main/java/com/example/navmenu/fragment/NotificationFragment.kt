package com.example.navmenu.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.navmenu.R

class NotificationFragment:Fragment(R.layout.notification_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text = NotificationFragmentArgs.fromBundle(requireArguments()).name1
    }
}