package com.testkotlin.testeKotlin.services.impl

import com.testkotlin.testeKotlin.documents.Empresa
import com.testkotlin.testeKotlin.repositories.EmpresaRepository
import com.testkotlin.testeKotlin.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpreServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {

    override fun buscarPorCnpj(cnpj: String): Empresa?
    = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa
    = empresaRepository.save(empresa)


}