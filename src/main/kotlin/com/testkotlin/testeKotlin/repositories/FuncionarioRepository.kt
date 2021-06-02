package com.testkotlin.testeKotlin.repositories

import com.testkotlin.testeKotlin.documents.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository: MongoRepository<Funcionario, String> {

    fun findByCpf(cpf: String): Funcionario?

    fun findByEmail(email: String): Funcionario?

}
