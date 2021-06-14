package com.testkotlin.testeKotlin.dtos

data class EmpresaDto (
        val razaoSocial: String,
        val cnpj: String,
        val id: String? = null
)
