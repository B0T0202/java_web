package com.mauricio.db;

import com.mauricio.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public Usuario autenticar(String usuarioDigitado, String senhaDigitada) {
        Usuario usuarioEncontrado = null;
<<<<<<< HEAD

=======
>>>>>>> 154f1b6735c6546653344f659270b98ebe3abb46
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND senha = ?";

        try (Connection conexao = ConexaoDB.conectar(); PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setString(1, usuarioDigitado);
            comando.setString(2, senhaDigitada);

            ResultSet resultado = comando.executeQuery();

<<<<<<< HEAD
            if (resultado.next()) {
                usuarioEncontrado = new Usuario(resultado.getString("nome"), resultado.getString("usuario"),
                        resultado.getString("senha"));
            }
        } catch (Exception e) {
=======
            if(resultado.next()) {
                usuarioEncontrado = new Usuario(resultado.getString("nome"), resultado.getString("usuario"), resultado.getString("senha"));
            }
            
        } catch(Exception e) {
>>>>>>> 154f1b6735c6546653344f659270b98ebe3abb46
            System.out.println("Erro no banco de dados: " + e.getMessage());
        }

        return usuarioEncontrado;
    }

    public Boolean cadastrar(Usuario novoUsuario) {

<<<<<<< HEAD
        String sql = "INSERT INTO usuarios(nome, usuario, senha) VALUES (?, ?, ?)";

        try (Connection conexao = ConexaoDB.conectar(); PreparedStatement comando = conexao.prepareStatement(sql)) {
=======
        String sql = "INSERT INTO usuarios (nome, usuario, senha) VALUES (?, ?, ?)";

        try(Connection conexao = ConexaoDB.conectar(); PreparedStatement comando = conexao.prepareStatement(sql)) {
>>>>>>> 154f1b6735c6546653344f659270b98ebe3abb46

            comando.setString(1, novoUsuario.getNome());
            comando.setString(2, novoUsuario.getUsuario());
            comando.setString(3, novoUsuario.getSenha());

            int linhasAfetadas = comando.executeUpdate();
            return (linhasAfetadas > 0);
<<<<<<< HEAD

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar usuário" + e.getMessage());
            return false;
        }
    }
=======
            

        } catch(SQLException e) {
            System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
            return false;
        }

    }
    
>>>>>>> 154f1b6735c6546653344f659270b98ebe3abb46
}
