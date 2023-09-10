/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *Classe Funcionario que serve de molde paras as classes Densevolvedor e Gerente
 * 
 * @author stelio.a.mondlane@uem.ac.mz
 * @version 0.1
 * Copyright (c) 2023 Universidade Eduardo Mondlane.
 */
public abstract class Funcionario {

    //atributos
    protected String cargo;
    protected String nome;
    protected boolean estado;
    protected double salarioBase;
    protected int nascimento;

    /**
     * Permite Criar um Funcionario com os seguintes atributos:
     *
     * @param cargo
     * @param nome
     * @param salarioBase
     * @param nascimento
     */
    public Funcionario(String cargo, String nome, double salarioBase, int nascimento) {
        this.cargo = cargo;
        this.nome = nome;
        this.estado = true;
        this.salarioBase = salarioBase;
        this.nascimento = nascimento;
    }

    /**
     * Metodo abstrato que permite nas classes filhas calcular o salario
     *
     * @return
     */
    public abstract double calcularSalario();

    /**
     * Metodos Accessores Para os atributos da classe
     *
     * @return
     */
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

}
