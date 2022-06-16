package com.example.pensablogapp

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.containsString
import org.hamcrest.Description
import org.hamcrest.Factory
import org.hamcrest.Matcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    var matchedBefore = false

    @get:Rule
    public var mMainActivityRule: ActivityScenarioRule<*>? = ActivityScenarioRule (
        MainActivity::class.java
    )

    @Test
    fun useAppContext() {
        // This test will be succeeded as there's line of "My first blog!" .
        onView(withId(R.id.tvBlogText)).check(matches(withText(containsString("First"))))
        //onView(allOf(withId(R.id.tvBlogText), isDisplayed())).check(matches(withText(containsString("First"))))
    }
}