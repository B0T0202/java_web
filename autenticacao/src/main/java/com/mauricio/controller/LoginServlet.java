package com.mauricio.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
<<<<<<< HEAD
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mauricio.data.BancoUsuario;
import com.mauricio.db.ConexaoDB;
=======
>>>>>>> 154f1b6735c6546653344f659270b98ebe3abb46
import com.mauricio.db.UsuarioDAO;
import com.mauricio.model.Usuario;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Garante que requisições e respostas processem acentos corretamente
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // Seu código vem aqui
        String usuarioDigitado = request.getParameter("usuario");
        String senhaDigitada = request.getParameter("senha");

        UsuarioDAO dao = new UsuarioDAO();

        Usuario usuarioLogado = dao.autenticar(usuarioDigitado, senhaDigitada);
<<<<<<< HEAD

        if (usuarioLogado != null) {
=======
        
        if(usuarioLogado != null) {
>>>>>>> 154f1b6735c6546653344f659270b98ebe3abb46
            // login esta autorizado
            request.getRequestDispatcher("bemvindo.jsp").forward(request, response);
        } else {
            // login nao esta autorizado
            request.setAttribute("mensagemErro", "Usuario ou senha invalidos!");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}