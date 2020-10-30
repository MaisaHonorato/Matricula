<%-- 
    Document   : actionPessoa
    Created on : 26/10/2020, 18:53:06
    Author     : Maisa Honorato
--%>

<%@page import="sun.java2d.cmm.ColorTransform.In"%>
<%@page import="controle.DAOMatricula"%>
<%@page import="controle.DAOAluno"%>
<%@page import="controle.DAOPessoa"%>
<%@page import="controle.DAOEndereco"%>
<%@page import="modelo.Matricula"%>
<%@page import="modelo.Pessoa"%>
<%@page import="modelo.Aluno"%>
<%@page import="modelo.Endereco"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	// 1. Coletar dados
	String nome = request.getParameter("nome");
	String cpf = request.getParameter("cpf");
	String email = request.getParameter("email");
	String celular = request.getParameter("celular");
        
        String cep  = request.getParameter("cep");
        String rua = request.getParameter("rua");
        String numero = request.getParameter("numero");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        
        String rg = request.getParameter("rg");
        String datanasc = request.getParameter("datanasc");
        
        String id = request.getParameter("id");
        String serie = request.getParameter("serie");
        String turma = request.getParameter("turma");
        String turno = request.getParameter("turno");
	
	
	// 2. Construir objeto
	Pessoa p = new  Pessoa();
       Endereco e = new Endereco();
       Aluno a = new Aluno();
       Matricula m = new Matricula();
       
        
	p.setNome(nome);
	p.setCpf(cpf);
	p.setEmail(email);
        p.setCelular(celular);
        
        e.setCep(cep);
        e.setRua(rua);
        e.setBairro(bairro);
        e.setNumero(numero);
        e.setBairro(bairro);
        e.setCidade(cidade);
        e.setEstado(estado);
        
        a.setRg(rg);
        a.setNome(nome);
        a.getDatanasc();
        
        m.setId(Integer.parseInt(id));
       
        
	// 3. Manipular (inserir)
	new DAOPessoa().inserirPessoa( p );
        new DAOAluno().inserirAluno(a);
        new DAOEndereco().inserirEndereco(e);
        new DAOMatricula().inserirMatricula(m);
	
	// 4. (Opcional) Redirecionar
	response.sendRedirect("index.jsp");
	
%>

</body>
</html>