package com.testkotlin.testeKotlin.services.impl

import com.testkotlin.testeKotlin.documents.Empresa
import com.testkotlin.testeKotlin.repositories.EmpresaRepository
import com.testkotlin.testeKotlin.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl (val empresaRepository: EmpresaRepository) : EmpresaService {

    override fun buscarPorCnpj(cnpj: String) = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa) = empresaRepository.save(empresa)

}