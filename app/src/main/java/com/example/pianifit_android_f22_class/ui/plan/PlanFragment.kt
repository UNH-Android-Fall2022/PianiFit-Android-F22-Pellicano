package com.example.pianifit_android_f22_class.ui.plan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.navigation.fragment.findNavController


import com.example.pianifit_android_f22_class.databinding.FragmentPlanBinding

class PlanFragment : Fragment() {
    private var _binding: FragmentPlanBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPlanBinding.inflate(inflater, container, false)

        binding.startButton.setOnClickListener {
            // Navigate to my workout page upon completion
            // TODO: Check the state of the fragment to ensure all options are selected before it transitions
            val action = PlanFragmentDirections.actionPlanFragmentToNavigationHome()
            findNavController().navigate(action)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}