package com.testkotlin.testeKotlin.repositories

import com.testkotlin.testeKotlin.documents.Lancamento
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository


interface LancamentoReposiotry : MongoRepository<Lancamento, String> {
    fun findByFuncionarioId(funcionarioId: String, pageble: Pageable): Page<Lancamento>
}