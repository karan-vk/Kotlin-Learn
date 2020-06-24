package com.karan

import org.junit.jupiter.api.Assertions.*

internal class MathfunKtTest {

    @org.junit.jupiter.api.Test
    fun sum() {
        assert(5) { sum(2,3) }
    }
}