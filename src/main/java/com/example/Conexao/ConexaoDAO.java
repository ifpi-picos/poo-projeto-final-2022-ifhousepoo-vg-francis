package com.example.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import io.github.cdimascio.dotenv.Dotenv;

public class ConexaoDAO {

    public static Connection getConexcao() {
        Dotenv dotenv = Dotenv.load();
        String DATABASE_URL = dotenv.get("DATABASE_URL");
        String DATABASE_USER = dotenv.get("DATABASE_USER");
        String DATABASE_PASSWORD = dotenv.get("DATABASE_PASSWORD");

        try {
            Connection conexcao = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
            if(conexcao != null){
                System.out.println("\nbanco conectado com sucesso\n");
                Statement stm = conexcao.createStatement();

            } else{
                System.out.println("falha na concexap");
            }
            return conexcao;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
