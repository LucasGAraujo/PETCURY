/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Modelo.Laboratorio;

/**
 *
 * @author NIT0298145
 */
public class VetController {
       public boolean cadastrarVet(String nome, String crvm, String formacao){
    if (nome != null && nome.length() >0 && crvm!= null && crvm.length() >0 && formacao != null && formacao.length() >0){
        Laboratorio vet = new Laboratorio (nome, crvm, formacao);
        vet.cadastrarVet(vet);
        return true;
    }
        return false;
    }
}
