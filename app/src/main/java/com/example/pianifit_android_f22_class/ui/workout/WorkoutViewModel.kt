package com.example.pianifit_android_f22_class.ui.workout

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WorkoutViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Workout Fragment"
    }
    val text: LiveData<String> = _text
}