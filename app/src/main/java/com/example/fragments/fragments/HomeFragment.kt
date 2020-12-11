package com.example.fragments.fragments

import android.app.DirectAction
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.fragments.R

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var navController: NavController

    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        editText = view.findViewById(R.id.editTextNumber2)
        button = view.findViewById(R.id.button2)

        button.setOnClickListener {

            val amount = editText.text.toString().toInt()

            // HomeFragmentDirection-ს მიწითლებს მე, მგონი ანდროიდ სტუდიოს ვერსიის ბრალია მაგრამ
            // ვერ მოვახერხე ჯერ აფდეითი(ინტერნეტის გამო). იმედია თქვენთან სწორად იმუშავებს

            val action = HomeFragmentDirections.actionNavigationHomeToNavigationNotification(amount)

            navController.navigate(action)
        }

    }
}