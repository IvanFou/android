package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class BlankFragment: Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val root:View = inflater.inflate(R.layout.fragment_blank, container, false)
        setupNavigation(root)
        return root
    }
    private fun setupNavigation(root:View){
        val detailButton:Button = root.findViewById<Button>(R.id.detail_button)
        val createButton:Button = root.findViewById<Button>(R.id.create_button)

        detailButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_list_to_detail)
        }
        createButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.create_list)
        }
    }
}
