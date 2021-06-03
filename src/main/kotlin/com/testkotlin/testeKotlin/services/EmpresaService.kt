package com.testkotlin.testeKotlin.services

import com.testkotlin.testeKotlin.documents.Empresa

interface EmpresaService {

    fun buscarPorCnpj(cnpj: String): Empresa?

    fun persistir(empresa: Empresa): Empresa

}