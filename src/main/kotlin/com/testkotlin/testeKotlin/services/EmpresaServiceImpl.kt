package com.testkotlin.testeKotlin.services

import com.testkotlin.testeKotlin.documents.Empresa
import com.testkotlin.testeKotlin.repositories.EmpresaRepository
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl (val empresaRepository: EmpresaRepository) : EmpresaService {

    override fun buscarPorCnpj(cnpj: String) = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa) = empresaRepository.save(empresa)

}