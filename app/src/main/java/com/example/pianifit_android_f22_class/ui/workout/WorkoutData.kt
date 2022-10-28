package com.example.pianifit_android_f22_class.ui.workout

data class WorkoutData(
    val id: String = "",
    var workoutTime: Int = 10, // minutes
    var image: String = "",
    var name: String = "",
    var workoutType: Int = 0,
    var workoutEquipment: Int = 0,
    var workoutPlanId: String = ""
)

// TODO: Use firebase to query instead of hardcoded data
val workoutList: ArrayList<WorkoutData> = arrayListOf(
    WorkoutData("",20,"","Workout 1",0,0,""),
    WorkoutData("",20,"","Workout 2",0,0,""),
    WorkoutData("",20,"","Workout 3",0,0,""),
    WorkoutData("",20,"","Workout 4",0,0,""),
    WorkoutData("",20,"","Workout 5",0,0,""),
    WorkoutData("",20,"","Workout 6",0,0,""),
    WorkoutData("",20,"","Workout 7",0,0,""),
    WorkoutData("",20,"","Workout 8",0,0,""),
)