package com.example.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.Entidades.Endereco;

public class EnderecoDAO {


    Connection conexcao;

    public EnderecoDAO(){
        conexcao = ConexaoDAO.getConexcao();
    }
    public void salvar(Endereco endereco){
        try {
            Statement stm = conexcao.createStatement();
            String sql = "insert into endereco (rua,bairro,numero,cidade,uf) values('"+endereco.getRua()+endereco.getBairro()+endereco.getNumero()+endereco.getUf()+"')";
            stm.executeUpdate(sql);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public List<Endereco> 
    consultarTodos(){
        String sql = "Select * From endereco";
        List<Endereco> endereco = new ArrayList<>();
        try {
            Statement stm =  conexcao.createStatement();
                ResultSet result = stm.executeQuery(sql);
                while(result.next()){
                    endereco.add(new Endereco(result.getString("rua"),result.getNString("bairro"),result.getInt("numero"),result.getString("cidade"),result.getString("uf")));
                }
                return endereco;
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }
    public void deleteEndereco(int numero) {
        try {
            String sql = "DELETE FROM endereco WHERE numero = ?";
            Statement stm = conexcao.prepareStatement(sql);
            stm.executeQuery(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
}
}

