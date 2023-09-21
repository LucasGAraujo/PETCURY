/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author NIT0298145
 */
public class Laboratorio {
    private Integer codVet;
    private String nome;
    private String crvm;
    private String formacao;

    public Laboratorio(String nome, String crvm, String formacao) {
        this.nome = nome;
        this.crvm = crvm;
        this.formacao = formacao;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Integer getCodVet() {
        return codVet;
    }

    public void setCodVet(Integer codVet) {
        this.codVet = codVet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrvm() {
        return crvm;
    }

    public void setCrvm(String crvm) {
        this.crvm = crvm;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void cadastrarVet(Laboratorio vet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
