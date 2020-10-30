<%@page import="controle.DAOAluno"%>
<%@page import="modelo.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Aluno</title>
</head>
<body>

<%
    //int matricula = Integer.parseInt( request.setParameter("matricula") );
    String nome  = request.getParameter("nome");
    String datanasc = request.getParameter("datanasc");
    
    String serie = request.getParameter("serie");
    String turma = request.getParameter("turma");
    String turno = request.getParameter("turno");

    

    Aluno a= new Aluno(nome, datanasc, cep, rua, bairro, cidade, estado, serie, turma, turno);

    new DAOAluno().inserirAluno( a );
	
%>

<h3> Cadastrado com sucesso!!! </h3>

</body>
</html>