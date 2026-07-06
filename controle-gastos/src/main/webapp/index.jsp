<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    // Verifica se já existe uma sessão aberta
    if (session != null && session.getAttribute("usuarioLogado") != null) {
        response.sendRedirect("dashboard");
    } else {
        response.sendRedirect("login.jsp");
    }
%>