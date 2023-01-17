package com.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.example.Entidades.Usuario;

public class UsuarioDAO {

    Connection conexcao;

    public UsuarioDAO(){
        conexcao = ConexaoDAO.getConexcao();
    }

    public Connection getConexcao() {
        return conexcao;
    }


   public void salvar(Usuario usuario){
        try {
            Statement stm = conexcao.createStatement();
            String sql = "insert into usuario (nome,email,data_nascimento) values('"+usuario.getNome() + "',"
            + "'" + usuario.getEmail() + "',"
            + "'" + usuario.getDataNascimento() + "'"
            +")";
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
                    usuario.add(new Usuario(result.getLong("id_usuario"),
                    result.getString("nome")
                    ,result.getString("email"), null,
                    result.getDate("data_nascimento")));
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
public void Alterarusuario(Long id_usuario) {
    try {
        String sql = "UPDATE usuario SET nome = ?,email = ?,endereco = ?,dataNascimento = ?  WHERE id_usuario = ?";
        
        PreparedStatement stm = conexcao.prepareStatement(sql);
        stm.setString(1, Usuario.getNome());
        stm.setString(2, Usuario.getEmail());
        stm.setString(3, Usuario.getEndereco());
        stm.setDate(5, Usuario.getDataNascimento());
        stm.executeUpdate(sql);

    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}
}
