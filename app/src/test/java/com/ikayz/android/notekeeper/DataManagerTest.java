package com.ikayz.android.notekeeper;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataManagerTest {

    @Test
    public void createNewNote() throws Exception {
        final CourseInfo course = DataManager.getInstance().getCourse("android_async");
        final String noteTitle = "Text note title";
        final String noteText = "This is the body text of the test note";
    }
}