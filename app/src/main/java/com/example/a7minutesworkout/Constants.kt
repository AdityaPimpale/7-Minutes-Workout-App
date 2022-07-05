package com.example.a7minutesworkout

object Constants {
    fun defaultExerciseList() : ArrayList<ExerciseModel>{
        val  exerciseList =ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(1, "Jumping Jacks", R.drawable.ic_jumping_jacks, false, false)
        exerciseList.add(jumpingJacks)

        val highKnees = ExerciseModel(2, "High Knees", R.drawable.ic_high_knees, false, false)
        exerciseList.add(highKnees)

        val lunges = ExerciseModel(3, "Lunges", R.drawable.ic_lunge, false, false)
        exerciseList.add(lunges)

        val plank = ExerciseModel(4, "Plank", R.drawable.ic_plank_new, false, false)
        exerciseList.add(plank)

        val pushAndRotate = ExerciseModel(5, "Push and Rotate", R.drawable.ic_push_and_rotate, false, false)
        exerciseList.add(pushAndRotate)

        val pushUp = ExerciseModel(6, "Push-Up", R.drawable.ic_pushups_new, false, false)
        exerciseList.add(pushUp)

        val sidePlank = ExerciseModel(7, "Side Plank", R.drawable.ic_side_plank_new, false, false)
        exerciseList.add(sidePlank)

        val squat = ExerciseModel(8, "Squat", R.drawable.ic_squat, false, false)
        exerciseList.add(squat)

        val stepUpOntoChair = ExerciseModel(9, "Step-up Onto Chair", R.drawable.ic_stepup_onto_chair, false, false)
        exerciseList.add(stepUpOntoChair)

        val triceps = ExerciseModel(10, "Triceps", R.drawable.ic_tricep_dip_on_chair, false, false)
        exerciseList.add(triceps)

        val skipping = ExerciseModel(11, "Skipping", R.drawable.ic_skipping, false, false)
        exerciseList.add(skipping)

        val wallSit = ExerciseModel(12, "Wall-Sit", R.drawable.ic_wall_sit, false, false)
        exerciseList.add(wallSit)

        return exerciseList
    }
}