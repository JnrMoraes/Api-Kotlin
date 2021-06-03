package com.testkotlin.testeKotlin.services.impl


import com.testkotlin.testeKotlin.documents.Funcionario
import com.testkotlin.testeKotlin.repositories.FuncionarioRepository
import com.testkotlin.testeKotlin.services.FuncionarioService
import org.springframework.stereotype.Service

@Service
interface FuncionarioServiceImpl (val funcionarioRepository: FuncionarioRepository) : FuncionarioService {

    override fun persistir(funcionario: Funcionario) = funcionarioRepository.save(funcionario)

    override fun buscarPorCpf(cpf: String) = funcionarioRepository.findByCpf(cpf)

    override fun buscarPorEmail(email: String) = funcionarioRepository.findByEmail(email)

    override fun buscarPorId(id: String) = funcionarioRepository.findById(id).get()

}
