package com.mauricio.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
<<<<<<< HEAD

=======
    
>>>>>>> 154f1b6735c6546653344f659270b98ebe3abb46
    private static final String URL = "jdbc:mysql://localhost:3306/autenticacao";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static Connection conectar() {
        try {
<<<<<<< HEAD

=======
            
>>>>>>> 154f1b6735c6546653344f659270b98ebe3abb46
            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(URL, USUARIO, SENHA);

<<<<<<< HEAD
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao connectar no banco: " + e.getMessage());
            return null;
        }
    }
=======
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao conectar no banco: " + e.getMessage());
            return null;
        }
    }

>>>>>>> 154f1b6735c6546653344f659270b98ebe3abb46
}
