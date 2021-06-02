package com.testkotlin.testeKotlin.repositories

import com.testkotlin.testeKotlin.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository: MongoRepository<Empresa, String> {

    fun findByCnpj(cnpj: String): Empresa?

}