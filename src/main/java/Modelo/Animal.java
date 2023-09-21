/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DAO.AnimalDAO;
import DAO.ExceptionDAO;
import java.sql.SQLException;

/**
 *
 * @author NIT0298145
 */
public class Animal {
     private Integer codAnimal;
    private String raca;
    private Integer idade;
    private Integer peso;
    private String situacao;

    public Animal(String raca, Integer idade, Integer peso, String situacao) {
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.situacao = situacao;

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public Integer getCodAnimal() {
        return codAnimal;
    }

    public void setCodAnimal(Integer codAnimal) {
        this.codAnimal = codAnimal;
    }

    public void cadastrarAnimal(Animal animal) throws ExceptionDAO, SQLException {
       new AnimalDAO().cadastrarAnimal(animal);
    }
    
}
