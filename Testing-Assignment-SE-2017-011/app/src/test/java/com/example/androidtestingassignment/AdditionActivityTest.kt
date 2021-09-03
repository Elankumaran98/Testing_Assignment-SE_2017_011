package com.example.androidtestingassignment

import junit.framework.TestCase
import org.junit.Test
import org.junit.Assert.*;

class AdditionActivityTest{

    @Test
    fun addition_for_two_positive_numbers(){
        val additionActivity = AdditionActivity()
        assertEquals(50,additionActivity.addNumbers(30,20))
    }

    @Test
    fun addition_for_two_negative_numbers(){
        val additionActivity = AdditionActivity()
        assertEquals(-50,additionActivity.addNumbers(-30,-20))
    }

    @Test
    fun addition_for_positive_and_negative_numbers(){
        val additionActivity = AdditionActivity()
        assertEquals(-50,additionActivity.addNumbers(70,-20))
    }
}