/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import DAO.ExceptionDAO;
import Modelo.Animal;
import java.sql.SQLException;

/**
 *
 * @author NIT0298145
 */
public class AnimalController {
public boolean cadastrarAnimal(String raca, Integer idade,Integer peso,String situacao) throws ExceptionDAO, SQLException{
        
        if (raca != null && raca.length() > 0 && situacao != null && situacao.length() > 0 && peso >0&& idade >0) {
            Animal animal = new Animal (raca, idade,peso,situacao);
            animal.cadastrarAnimal(animal);
            return true;
        }
        return false;
        }
    }

