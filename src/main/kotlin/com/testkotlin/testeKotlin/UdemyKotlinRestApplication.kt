package com.testkotlin.testeKotlin

import com.testkotlin.testeKotlin.documents.Empresa
import com.testkotlin.testeKotlin.documents.Funcionario
import com.testkotlin.testeKotlin.enums.PerfilEnum
import com.testkotlin.testeKotlin.repositories.EmpresaRepository
import com.testkotlin.testeKotlin.repositories.FuncionarioRepository
import com.testkotlin.testeKotlin.utils.SenhaUtils
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UdemyKotlinRestApplication(
val empresaRepository: EmpresaRepository,
val funcionarioRepository: FuncionarioRepository
) : CommandLineRunner {

    override fun run(vararg args: String?) {
        empresaRepository.deleteAll()
        funcionarioRepository.deleteAll()

        val empresa: Empresa = Empresa("Empresa", "10443887000146")
        empresaRepository.save(empresa)

        val admin: Funcionario = Funcionario(
            "Admin", "admin@empresa.com",
            SenhaUtils().gerarBcrypt("1234567890"), "2570831700",
            PerfilEnum.ROLE_ADMIN, empresa.id!!
        )
        funcionarioRepository.save(admin)

        val funcionario: Funcionario = Funcionario(
            "Funcionario", "funcionario@empresa.com",
            SenhaUtils().gerarBcrypt("123456"), "44325551557",
            PerfilEnum.ROLE_USUARIO, empresa.id
        )
        funcionarioRepository.save(funcionario)

        System.out.println("Empresa ID: " + empresa.id)
        System.out.println("Admin ID: " + admin.id)
        System.out.println("Funcionario ID: " + funcionario.id)

    }
}

fun main(args: Array<String>) {
    runApplication<UdemyKotlinRestApplication>(*args)
}
