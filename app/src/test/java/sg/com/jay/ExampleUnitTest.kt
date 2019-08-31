package sg.com.jay

import org.junit.Test

import org.junit.Assert.*
import sg.Utils

class ExampleUnitTest {
    @Test
    @Throws(Exception::class)
    fun add_isCorrect() {
        assertEquals(4, Utils.addNumbers(2, 2))
    }

    @Test
    @Throws(Exception::class)
    fun add_twoDigits_isCorrect() {
        assertEquals(44, Utils.addNumbers(22, 22))
    }

    @Test
    @Throws(Exception::class)
    fun add_big_isCorrect() {
        assertEquals(4444, Utils.addNumbers(2222, 2222))
    }
}
