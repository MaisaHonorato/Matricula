<%@page import="projeto.matricula.colecao.DAOAluno"%>
<%@page import="projeto.matricula.modelo.Aluno"%>
<%@page import="projeto.matricula.colecao.DAOPessoa"%>
<%@page import="projeto.matricula.modelo.Pessoa"%>
<%@page import="projeto.matricula.colecao.DAOEndereco"%>
<%@page import="projeto.matricula.modelo.Endereco"%>
<%@page import="projeto.matricula.colecao.DAOMatricula"%>
<%@page import="projeto.matricula.modelo.Matricula"%>
<%@page import="projeto.matricula.colecao.DAOTurno"%>
<%@page import="projeto.matricula.modelo.Turno"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html>
    <head>
       <meta charset="utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 
 <title>Cadastro de Aluno</title>

 <!-- Favicons -->
 <link href="" rel="icon">
 <link href="" rel="apple-touch-icon">

 <!-- Google Fonts -->
 <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">

 <!-- Bootstrap CSS File -->
 <link rel="stylesheet" href="css/bootstrap.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="js/jquery.min.js"></script>

 <!-- Main Stylesheet File -->
 <link href="css/style.css" rel="stylesheet">
    </head>
    
		<body>

	<%
	
	String rg = request.getParameter("tx_rg");
	String datanasc = request.getParameter("tx_datanasc");	
	int idPessoa = Integer.parseInt( request.getParameter("nm_pessoa") );

	Pessoa Pessoa = DAOPessoa.localizarPessoasNome(String nome);
	
	// 2. Construir
	Aluno alu = new Aluno(rg, datanasc, pessoa);
	
	// 3. Manipular
	DAOAluno.salvarAluno( al );
	
	response.sendRedirect("listarAlunos.jsp");
	
	%>

      <jsp:include page="_topoSair.jsp"></jsp:include>
        
        <!--/ Intro Single star /-->
		  <section class="intro-single">
		    <div class="container">
		      <div class="row">
		        <div class="col-md-12 col-lg-8">
		          <div class="title-single-box">
		            <h1 class="title-single">Cadastro de Aluno</h1>
		          </div>
		        </div>
		        <div class="col-md-12 col-lg-4">
		          <nav aria-label="breadcrumb" class="breadcrumb-box d-flex justify-content-lg-end">
		            <ol class="breadcrumb">
		              <li class="breadcrumb-item">
		                <a href="#">Home</a>
		              		</li>
		              <li class="breadcrumb-item active" aria-current="page">
                		Matrícula
              			</li>
            		</ol>
          		  </nav>
        		</div>
      		  </div>
    		</div>
  		  </section>
  <!--/ Intro Single End /-->
 
 		<div id="main" class="container-fluid">
  
  		<h3 class="page-header">Adicionar Aluno</h3>

  		<hr />
  		
  <form action="actionAluno.jsp" method="GET">
   <div id="list" class="row">
     <div class="table-responsive col-md-12">
  		<div class="row">
  	  
	  <div class="form-group col-md-4">
  	  	<label for="InputNome">Nome</label>
  	  	<input type="text" class="form-control" name="nome" id="InputNome" placeholder="Nome">
  	     </div>
	  
	  <div class="form-group col-md-4">
  	  	<label for="InputDatanasc">Data de Nascimento</label>
  	  	<input type="date" class="form-control"name="datanasc" id="InputDatanasc" >
  	  	 </div>
  	  	 
  	  <div class="form-group col-md-4">
  	  	<label for="InputRg">Rg</label>
  	  	<input type="number" class="form-control"name="rg" id="InputRg" placeholder=" " readonly>
  	  	  </div>
         
         </div>
  
	<div class="row">
    	<div class="form-group col-md-2">
      		<label for="InputCep">CEP</label>
      <input type="cep" class="form-control" id="cep" name="cep" placeholder="CEP">  <!-- onblur="nomeFuncao()" -->
         </div>
	
  	  <div class="form-group col-md-2">
  	  	<label for="InputRua">Rua</label>
  	  <input type="Rua" class="form-control" id="rua" name="rua" placeholder="Rua, Avenida...">
         </div>
      
      <div class="form-group col-md-2">
  	  	<label for="InputNumero">Numero</label>
  	  <input type="Numero" class="form-control" id="numero" name="numero" placeholder="Número da Casa">
         </div>
      
      <div class="form-group col-md-2">
          <label for="InputBairro">Bairro</label>
      <input type="bairro" class="form-control" id="bairro" name="bairro" placeholder="Bairro">
         </div>
        
	  <div class="form-group col-md-2">
  	  	<label for="InputCidade">Cidade</label>
  	  <input type="cidade" class="form-control" id="cidade" name="cidade" placeholder="Cidade">
  	     </div>
  	     
	  <div class="form-group col-md-2">
  	  	<label for="InputEstado">Estado</label>
  	  <input type="estado" class="form-control" id="uf" name="uf" placeholder="Estado">
  	     </div>
	  
	</div>

	<div class="row"><div class="form-group col-md-3">
	  	<label for="serie">Série</label>
  	  	<select name="nm_servico">
		<%for( Serie t : DAOSerie.listarSeries() ){%>
			<option value="<%=s.getId()%>"> <%=s.getNome()%> </option>
		<%}%>
			</select> <br/>
  	  </div>
  	  
  	  <div class="form-group col-md-3">
  	   	<label for="turma">Turma</label>
  	  	<select name="nm_servico">
		<%for( Turma t : DAOTurma.listarTurmas() ){%>
			<option value="<%=s.getId()%>"> <%=s.getNome()%> </option>
		<%}%>
			</select> <br/>
      </div>
      
	  <div class="form-group col-md-3  ">
	   	<label for="turno">Turno</label>
  	  	<select id="inputTurno" name="turno" class="form-control " >
            <option selected>Escolher...</option>
            <option>Matutino</option>
            <option>Vespertino</option>
            <option>Noturno</option>
            </select>
  	  </div>
	</div>
	</div>
	
	<hr />
	
		<div class="row">
        <div class="col text-center">
        <button type="submit" class="btn btn-success">Salvar</button>
        <a href="matricula.html" class="btn btn-default">Cancelar</a>
	  </div>
    </div>
  </form>
</div>

  <script type="text/javascript" >

	$(document).ready(function() {

    	function limpa_formulário_cep() {
	        // Limpa valores do formulário de cep.
	        $("#rua").val("");
	        $("#bairro").val("");
	        $("#cidade").val("");
	        $("#uf").val("");
        
    	}
    
    //Quando o campo cep perde o foco.
    $("#cep").blur(function() { // jQuery

        //Nova variável "cep" somente com dígitos.
        var cep = $(this).val().replace(/\D/g, '');

        //Verifica se campo cep possui valor informado.
        if (cep !== "") {

            //Expressão regular para validar o CEP.
            var validacep = /^[0-9]{8}$/;

            //Valida o formato do CEP.
            if(validacep.test(cep)) {

                //Preenche os campos com "..." enquanto consulta webservice.
                $("#rua").val("...");
                $("#bairro").val("...");
                $("#cidade").val("...");
                $("#uf").val("...");
                

                //Consulta o webservice viacep.com.br/
                $.getJSON("https://viacep.com.br/ws/"+ cep +"/json/?callback=?", function(dados) {

                    if (!("erro" in dados)) {
                        //Atualiza os campos com os valores da consulta.
                        $("#rua").val(dados.logradouro);
                        $("#bairro").val(dados.bairro);
                        $("#cidade").val(dados.localidade);
                        $("#uf").val(dados.uf);
                        
                    } //end if.
                    else {
                        //CEP pesquisado não foi encontrado.
                        limpa_formulário_cep();
                        alert("CEP não encontrado.");
                    }
                });
            } //end if.
            else {
                //cep é inválido.
                limpa_formulário_cep();
                alert("Formato de CEP inválido.");
            }
        } //end if.
        else {
            //cep sem valor, limpa formulário.
            limpa_formulário_cep();
        }
    });
});

	</script>
</body>

	<footer class=" footer rodape border-success " >
	  <small class="d-block text-muted">Desenvolvimento Web II</small>
	  <small class="d-block text-muted">Aluna: <strong>Maisa Honorato</strong></small>
	</footer>

</html>