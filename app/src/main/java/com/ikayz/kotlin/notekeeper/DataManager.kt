package com.ikayz.kotlin.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    // Runs automatically to execute code
    init {
        initializeCourses()
        intializeNotes()

    }

    private fun intializeNotes() {

    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: The Core Platform", courseId = "java_core")
        courses.set(course.courseId, course)
    }
}