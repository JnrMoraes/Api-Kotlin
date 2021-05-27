package com.testkotlin.testeKotlin.utils

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

internal class SenhaUtilsTest {

    private val SENHA = "123456"
    private val bCryptEncoder = BCryptPasswordEncoder()

    @Test
    fun testGerarBcrypt() {
        val hash = SenhaUtils().gerarBcrypt(SENHA)
        assertTrue(bCryptEncoder.matches(SENHA, hash))
    }
}