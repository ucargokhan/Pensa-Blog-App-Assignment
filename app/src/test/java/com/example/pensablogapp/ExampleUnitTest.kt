package com.example.pensablogapp

import android.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class appendFirstBlogTitle {
    @Rule
    @JvmField
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test fun appendFirstBlogTitle() {
        val mainActivity: MainActivity = MainActivity()
        val firstBlogTitle = "Pensa Blog App"
        assertEquals("Failed",firstBlogTitle,mainActivity.title)
    }

}