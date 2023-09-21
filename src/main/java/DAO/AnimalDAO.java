
package DAO;
import Modelo.Animal;
import java.sql.Connection;
 import java.sql.PreparedStatement;
 import java.sql.SQLException;

public class AnimalDAO {
    private Object Pstatement;
    public void cadastrarAnimal (Animal animal) throws ExceptionDAO,SQLException{
        String sql = "insert into animal (raca, idade,peso, situacao) value (?,?,?,?,)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        try{
            connection = new ConnectionMvc().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1,animal.getRaca());
            pStatement.setInt(2,animal.getIdade());
            pStatement.setInt(3,animal.getPeso());
            pStatement.setString(4,animal.getSituacao());
            pStatement.execute();
        }catch (SQLException e){
            throw new ExceptionDAO("Erro ao cadastrar filme!" + e);
        } finally{
            try{
                if (pStatement != null){pStatement.close();}
            }catch (SQLException e){
                throw new ExceptionDAO ("Erro ao fechar conexão: " + e);
            }
        }
        
    }
    
}

