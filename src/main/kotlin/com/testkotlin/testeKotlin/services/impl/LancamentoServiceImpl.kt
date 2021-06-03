package com.testkotlin.testeKotlin.services.impl


import com.testkotlin.testeKotlin.documents.Lancamento
import com.testkotlin.testeKotlin.repositories.LancamentoRepository
import com.testkotlin.testeKotlin.services.LancamentoService
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class LancamentoServiceImpl (val lancamentoRepository: LancamentoRepository) : LancamentoService {

    override fun buscarPorFuncionarioId(funcionarioId: String, pageRequest: PageRequest) =
            lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest)

    override fun buscarPorId(id: String) = lancamentoRepository.findById(id).get()

    override fun persistir(lancamento: Lancamento) = lancamentoRepository.save(lancamento)

    override fun remover(id: String) = lancamentoRepository.deleteById(id)

}
