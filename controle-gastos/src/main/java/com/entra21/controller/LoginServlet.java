package com.entra21.controller;

import java.io.IOException;

import com.entra21.db.UsuarioDAO;
import com.entra21.model.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String usuarioDigitado = request.getParameter("usuario");
        String senhaDigitada = request.getParameter("senha");

        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuarioLogado = dao.autenticar(usuarioDigitado, senhaDigitada);

        if (usuarioLogado == null) {
            request.setAttribute("mensagemErro", "Usuario ou senha Inválidos!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            response.sendRedirect("painel.jsp");
        }
    }
}
