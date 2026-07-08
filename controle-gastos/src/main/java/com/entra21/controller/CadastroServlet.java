package com.entra21.controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import com.entra21.db.UsuarioDAO;
import com.entra21.model.Usuario;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String nome = request.getParameter("nome");
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");

        Usuario novUsuario = new Usuario(nome, usuario, senha);

        UsuarioDAO dao = new UsuarioDAO();
        boolean sucesso = dao.cadastrar(novUsuario);

        if (!sucesso) {
            request.setAttribute("mensagemErro", "Erro ao cadastrar!");
            request.getRequestDispatcher("cadastro.jsp").forward(request, response);
        } else {
            request.setAttribute("mensagemSucesso", "Usuarios cadastrado com sucesso!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
