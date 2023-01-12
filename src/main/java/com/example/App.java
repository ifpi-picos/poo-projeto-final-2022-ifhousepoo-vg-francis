package com.example;

import java.sql.Connection;
import com.example.Conexao.ConexaoDAO;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Connection conexao = ConexaoDAO.getConexcao();
}
}
            
        

    