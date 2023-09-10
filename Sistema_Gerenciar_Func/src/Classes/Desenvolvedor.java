/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 * Classe densevolvedor herda e implementa caracteristicas de funcionario e da interface relatorio
 * @author steli
 */
public class Desenvolvedor extends Funcionario implements I_relatorio{
    private Double horasDeTrabalho;
    private double salarioFinal;

    /**
     * Construtor da classe Funcionario
     * @param cargo
     * @param nome
     * @param salarioBase
     * @param nascimento 
     */
    public Desenvolvedor(String cargo, String nome, double salarioBase, int nascimento) {
        super(cargo, nome, salarioBase, nascimento);
    }
    
    /**
     * Construtor Da classe Densevolvedor com os atributos horasDeTrabalho e salariofinal
     * @param horasDeTrabalho
     * @param cargo
     * @param nome
     * @param salarioBase
     * @param nascimento 
     */
    public Desenvolvedor(Double horasDeTrabalho, String cargo, String nome, double salarioBase,int nascimento) {
        super(cargo, nome, salarioBase, nascimento);
        this.horasDeTrabalho = horasDeTrabalho;
        calcularSalario();
    }
    

    
     /**
     * Metodo para calcularSalario abstrato da classe Funcionario Ajustado para calcular o salario do Densevolvedor
     * @return 
     */
    @Override
    public double calcularSalario() {
     return   this.salarioFinal= this.salarioBase *horasDeTrabalho;
    }

      /**
     * Metodo gerado da interface que permite gerar relatorio com os dados do Densevolvedor
     */
    @Override
    public void gerar_relatorio() {
    System.out.println("Nome: " + this.getNome());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Horas de trabalho: " + this.horasDeTrabalho);
        System.out.println("Salario Hora: " + this.salarioBase);
        System.out.println("Salario Final: " + this.salarioFinal); 
    }
    
    
     /**
     * Metodos Accessores Para os atributos da classe e super classe(Funcionario)
     *
     * @return
     */

    public Double getHorasDeTrabalho() {
        return horasDeTrabalho;
    }

    public void setHorasDeTrabalho(Double horasDeTrabalho) {
        this.horasDeTrabalho = horasDeTrabalho;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    @Override
    public String getCargo() {
        return cargo;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean isEstado() {
        return estado;
    }

    @Override
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public int getNascimento() {
        return nascimento;
    }

    @Override
    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }
    
    
}
