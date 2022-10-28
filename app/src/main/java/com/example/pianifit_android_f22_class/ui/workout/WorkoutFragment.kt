package com.example.pianifit_android_f22_class.ui.workout

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pianifit_android_f22_class.databinding.FragmentWorkoutBinding

class WorkoutFragment : Fragment() {

    private var _binding: FragmentWorkoutBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var mRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(WorkoutViewModel::class.java)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        _binding = FragmentWorkoutBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val workoutRecyclerList: ArrayList<WorkoutCard> = ArrayList()

        for(workout in workoutList){
            workoutRecyclerList.add(
                WorkoutCard(
                    workout.image,
                    workout.name,
                    workout.workoutTime.toString()+" Minutes"
                )
            )
        }

        mRecyclerView = binding.recyclerViewWorkouts
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(context)
        mRecyclerView.adapter = WorkoutAdapter(workoutRecyclerList, this)

        binding.btnStartPlan.setOnClickListener {
            Log.d(TAG, "New Plan Selected")
            val action = WorkoutFragmentDirections.actionNavigationHomeToPlanFragment()
            findNavController().navigate(action)
        }

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}