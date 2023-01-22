package com.example.Dados;

import com.example.Entidades.Usuario;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDados {
    private static final List<Usuario> usuarios = new ArrayList<>();

    public static void adicionaUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void removeUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public static void alteraUsuario(Usuario usuario, String field, Object value) throws NoSuchFieldException, IllegalAccessException {
        Field _field = Usuario.class.getField(field);
        _field.set(usuario, value);
    }

    public static Usuario getUsuarioByEmail(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }

        return null;
    }

    public static List<Usuario> getUsuarios() {
        return usuarios;
    }
}
