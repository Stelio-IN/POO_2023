/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 * Classe Gerente herda e implementa caracteristicas de funcionario e da interface relatorio
 * @author steli
 */
public class Gerente extends Funcionario implements I_relatorio{
    Double bonus;
    Double salarioFinal;
    
    /**
    * Construtor gerado na classe Funcionario
    * @param cargo
    * @param nome
    * @param salarioBase
    * @param nascimento 
    */
    public Gerente(String cargo, String nome, double salarioBase, int nascimento) {
        super(cargo, nome, salarioBase, nascimento);
    }

    /**
     * Construtor Da classe gerente com os atributos bonus e salario final.
     * @param bonus
     * @param cargo
     * @param nome
     * @param salarioBase
     * @param nascimento 
     */
    public Gerente(Double bonus, String cargo, String nome, double salarioBase, int nascimento) {
        super(cargo, nome, salarioBase, nascimento);
        this.bonus = bonus;
        calcularSalario();
    }
  
    /**
     * Metodo para calcularSalario abstrato da classe Funcionario Ajustado para calcular o salario do Gerente
     * @return 
     */
    @Override
    public double calcularSalario() {
    return this.salarioFinal= this.salarioBase + this.bonus;
    }

 
    /**
     * Metodo gerado da interface que permite gerar relatorio com os dados do gerente
     */
    @Override
    public void gerar_relatorio() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Salario Base: " + this.salarioBase);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Salario Final: " + this.salarioFinal);
        
    }
    
    
    /**
     * Metodos Accessores Para os atributos da classe e super classe(Funcionario)
     *
     * @return
     */
    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(Double salarioFinal) {
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
