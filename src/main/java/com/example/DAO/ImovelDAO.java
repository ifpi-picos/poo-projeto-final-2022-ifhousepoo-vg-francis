package com.example.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.Entidades.Imovel;

public class ImovelDAO {
    
    Connection conexao;

    public void ImovelDao(){
        conexao = ConexaoDAO.getConexcao();
    }
    
    public void salvar(Imovel imovel){
        try {
            Statement stm = conexao.createStatement();
            String sql = "insert into imovel (descricao,valorAluguel,dataCadastro) values ('"+imovel.getDescricao()
            +imovel.getValorAluguel()
            +imovel.getDataCadastro()+"')";
            stm.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    /**
     * @return
     */
    public List<Imovel> consultarTodos(){
        String sql = "select * from imovel";
        List<Imovel> imovel = new ArrayList<>();
        try {
            Statement stm = conexao.createStatement();
            ResultSet result = stm.executeQuery(sql);
            while (result.next()) {
                Imovel.add(new Imovel(result.getString("descricao"), result.getDouble("valorAluguel"),result.getDate("dataCadastro")));
            }
            return imovel;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

