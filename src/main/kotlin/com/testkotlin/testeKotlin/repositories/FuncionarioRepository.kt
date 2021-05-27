package com.testkotlin.testeKotlin.repositories

import com.testkotlin.testeKotlin.documents.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository : MongoRepository<Funcionario, String> {
    fun findByEmail(email: String): Funcionario?
    fun fincByCpf(cpf: String): Funcionario?
}