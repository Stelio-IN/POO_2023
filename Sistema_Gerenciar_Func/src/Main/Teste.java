/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Classes.Departamento;
import Classes.Desenvolvedor;
import Classes.Gerente;

/**
 *
 * @author steli
 */
public class Teste {

    public static void main(String[] args) {

        //Gerando instacia das classes densenvolvedor, gerente e departamento
        Departamento departamento = new Departamento();
        // Gerente(Double bonus, String cargo, String nome, double salarioBase, int nascimento)
        Gerente gerente = new Gerente(250.0, "Gerente", "Stelio", 500.0, 2008);
        //  Desenvolvedor(Double horasDeTrabalho, String cargo, String nome, double salarioBase,int nascimento) 
        Desenvolvedor desenvolvedor1 = new Desenvolvedor(10.0, "DEV", "Invo", 300.0, 1998);

        //Adicionando os funcionarios criados ao departamento
        departamento.adicionarFuncionario(gerente);
        departamento.adicionarFuncionario(desenvolvedor1);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Lista de Funcionários:");
        departamento.listarFuncionarios();
        System.out.println("");

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Gerando Relatorio do departamento:");
        System.out.println("Gastos Com salario: " + departamento.GastoTotalComSalarios());
        departamento.gerarRelatorioFuncionarios();
        System.out.println("__________________________________________________");

        /*
        // Atualizando um funcionário
        Gerente novoGerente = new Gerente(500.0,"Gerente02","Mondlane", 500.0,2008);
        departamento.editarFuncionario(0, novoGerente);

        System.out.println("\nLista de Funcionários após a atualização:");
        departamento.listarFuncionarios();

        // Excluir um funcionário (eliminar lógico)
        departamento.excluirFuncionario(1);

        System.out.println("\nLista de Funcionários após a exclusão:");
        departamento.listarFuncionarios();

         */
    }
}
