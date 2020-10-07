package com.example.quizapp

object Constants{

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_question"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "What country does this flag belong to?",
            R.drawable.india,
            "Japan",
            "Australia",
            "India",
            "Brazil",
            3)
        questionsList.add(que1)

        val que2 = Question(1,
            "What country does this flag belong to?",
            R.drawable.japan,
            "Japan",
            "Australia",
            "India",
            "Brazil",
            1)
        questionsList.add(que2)

        val que3 = Question(1,
            "What country does this flag belong to?",
            R.drawable.brazil,
            "Argentina",
            "Australia",
            "India",
            "Brazil",
            4)
        questionsList.add(que3)

        val que4 = Question(1,
            "What country does this flag belong to?",
            R.drawable.australia,
            "Argentina",
            "Australia",
            "India",
            "Brazil",
            1)
        questionsList.add(que4)


        val que5 = Question(1,
            "What country does this flag belong to?",
            R.drawable.india,
            "Japan",
            "Australia",
            "India",
            "Brazil",
            3)
        questionsList.add(que1)

        val que6 = Question(1,
            "What country does this flag belong to?",
            R.drawable.japan,
            "Japan",
            "Australia",
            "India",
            "Brazil",
            1)
        questionsList.add(que2)

        val que7 = Question(1,
            "What country does this flag belong to?",
            R.drawable.brazil,
            "Argentina",
            "Australia",
            "India",
            "Brazil",
            4)
        questionsList.add(que3)

        val que8 = Question(1,
            "What country does this flag belong to?",
            R.drawable.australia,
            "Argentina",
            "Australia",
            "India",
            "Brazil",
            1)
        questionsList.add(que4)
        return questionsList
    }


}