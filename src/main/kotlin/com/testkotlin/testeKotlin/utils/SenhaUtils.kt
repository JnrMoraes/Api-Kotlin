package com.testkotlin.testeKotlin.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class SenhaUtils {
    fun gerarBcrypt(senha: String): String = BCryptPasswordEncoder().encode(senha)
}