package com.example.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.Entidades.Usuario;

public class UsuarioDAO {

    Connection conexcao;

    public UsuarioDAO(){
        conexcao = ConexaoDAO.getConexcao();
    }
    public void salvar(Usuario usuario){
        try {
            Statement stm = conexcao.createStatement();
            String sql = "insert into usuario (nome,email,data_nascimento,endereco) values('"+usuario.getNome()+usuario.getEmail()+usuario.getDataNascimento()+usuario.getEndereco()+"')";
            stm.executeUpdate(sql);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public List<Usuario> 
    consultarTodos(){
        String sql = "Select * From usuario";
        List<Usuario> usuario = new ArrayList<>();
        try {
            Statement stm =  conexcao.createStatement();
                ResultSet result = stm.executeQuery(sql);
                while(result.next()){
                    usuario.add(new Usuario(result.getLong("id_usuario"),result.getString("nome"),result.getString("email"),result.getString("endereco"),result.getDate("data_nascimento")));
                }
                return usuario;
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }
}
