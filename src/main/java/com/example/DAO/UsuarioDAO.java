package com.example.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.example.Entidades.Endereco;
import com.example.Entidades.Usuario;

public class UsuarioDAO {

    Connection conexcao;

    public UsuarioDAO(){
        conexcao = ConexaoDAO.getConexcao();
    }
    public void salvar(Usuario usuario){
        try {
            Statement stm = conexcao.createStatement();
            String sql = "insert into usuario (nome,email,data_nascimento) values('"+usuario.getNome()
            +usuario.getEmail()
            +usuario.getDataNascimento()
            +"')";
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
                    Endereco endereco;
                    usuario.add(new Usuario(result.getLong("id_usuario"),result.getString("nome"),result.getString("email"), null,result.getDate("data_nascimento").toLocalDate()));
                }
                return usuario;
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }
    public void deleteUsuario(Long id_usuario) {
        try {
            String sql = "DELETE FROM usuarios WHERE id_usuario = ?";
            Statement stm = conexcao.prepareStatement(sql);
            stm.executeQuery(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
}
}
