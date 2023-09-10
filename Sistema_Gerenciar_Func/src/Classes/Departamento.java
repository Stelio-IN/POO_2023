/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 * Classe Departamento permite adicionar funcionarios/excluir/editar/listar gerar relatorios
 * gastos dentre outras funcoes
 * @author steli
 */
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    //Lista que guardara os funcionarios 
    private List<Funcionario> funcionarios;
    
    //Construtor
    public Departamento() {
        funcionarios = new ArrayList<>();
    }
    
    /**
     * O metodo retorna o total de gastos com salario
     * @return total  
     */

    public double GastoTotalComSalarios() {
        double total = 0.0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.isEstado()) {
                total += funcionario.calcularSalario();
            }
        }
        return total;
    }
    /**
     * Gera um relatorio de todos funcionarios ativos
     * 
     */

    public void gerarRelatorioFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("====================================================================");
            if (funcionario.isEstado()) {
               if(funcionario instanceof Desenvolvedor desenvolvedor){
                    desenvolvedor.gerar_relatorio();
               }else if(funcionario instanceof Gerente gerente){
                   gerente.gerar_relatorio(); }
            } else {
                System.out.println("Não é possível gerar relatório para " + funcionario.getNome());
            }
        }
    }
    /**
     * adiciona funcionario
     * @param funcionario 
     */

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    /**
     * Lista todos funcionarios ativos 
     * devolvendo o nome e o cargo
     */
    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            if(funcionario.isEstado())
            System.out.println("Nome: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo());
        }
    }
    /**
     * Edita um funcionario na lista pegando o indice e os seus novos dados dados
     * @param indice
     * @param novoFuncionario 
     */

    public void editarFuncionario(int indice, Funcionario novoFuncionario) {
        if (indice >= 0 && indice < funcionarios.size()) {
            funcionarios.set(indice, novoFuncionario);
        } else {
            System.out.println("Índice inválido.");
        }
    }
    /**
     * Faz a exclusao logina de um funcionario pegando o seu indice na lista
     * @param indice 
     */

    public void excluirFuncionario(int indice) {
        if (indice >= 0 && indice < funcionarios.size()) {
            Funcionario funcionario = funcionarios.get(indice);
            funcionario.setEstado(false);
        } else {
            System.out.println("Índice inválido.");
        }
    }

}
