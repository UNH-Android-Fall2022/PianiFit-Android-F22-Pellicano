package com.example.pianifit_android_f22_class.ui.progress

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProgressViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Progress Fragment"
    }
    val text: LiveData<String> = _text
}