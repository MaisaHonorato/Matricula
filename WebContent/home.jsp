<%-- 
    Document   : home
    Created on : 02/12/2019, 11:19:24
    Author     : Maisa Honorato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        
 <!-- Bootstrap CSS File -->
  <link href="css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="extras/font-awesome.min.css" rel="stylesheet">
  <link href="css/animate.min.css" rel="stylesheet">
  <link href="css/ionicons.min.css" rel="stylesheet">
  <link href="css/owl.carousel.min.css" rel="stylesheet">
  <script src="extras/ionicons.js"></script>
  <link href="css/ionicons.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="css/style.css" rel="stylesheet">
  
   <!-- JavaScript Libraries -->
  <script src="js/jquery.min.js"></script>
  
  
  
    </head>
    <body>
        <div id="topo">
    <!--/ Nav Star /-->
 <nav class="navbar navbar-default navbar-trans navbar-expand-lg fixed-top">
    <div class="container">
      
      <a class="navbar-brand text-brand" href="home.jsp">Escola<span class="color-b"> Criança Feliz</span></a>
      <button type="button" class="btn btn-link  navbar-toggle-box-collapse d-md-none" data-toggle="collapse"
        data-target="#navbarTogglerDemo01" aria-expanded="false">
       
      </button>
      <div class="navbar-collapse collapse justify-content-center" id="navbarDefault">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link active" href="home.jsp">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link " href="matricula.jsp">Matrícula</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="diario.html">Diário</a>
          </li>
         
  
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                aria-haspopup="true" aria-expanded="false">
                Boletim
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="disciplina.html">Disciplina</a>
                <a class="dropdown-item" href="avaliacao.html">Avaliação</a>
                <a class="dropdown-item" href="disciplina_nota.html">Notas</a>
                
              </div>
            </li>
         
            <li class="nav-item">
                <a class="nav-link" href="contato.html">Contato</a>
              </li>
              <li class="nav-item">
                <button type="button" class="btn btn-b-n   " >
                  <a class="nav-link" href="login.html">Entrar</a>
                </button>
              </li>
          
         
        </ul>
      </div>
      
    </div>
  </nav>
  <!--/ Nav End /-->
</div>
        <!--/ Carousel Star /-->
  <div class="intro intro-carousel">
    <div id="carousel" class="owl-carousel owl-theme">
      <div class="carousel-item-a intro-item bg-image" style="background-image: url(img/Escola.jpg)">
        <div class="overlay overlay-a"></div>
        <div class="intro-content display-table">
          <div class="table-cell">
            <div class="container">
              <div class="row">
                <div class="col-lg-8">
                  <div class="intro-body">
                    <p class="intro-title-top">Escola Criança Feliz
                      <br> </p>
                    <h1 class="intro-title mb-4">
                      <span class="color-b">Ultimas </span> Vagas
                      <br> </h1>
                    
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="carousel-item-a intro-item bg-image" style="background-image: url(img/salas.jpg)">
        <div class="overlay overlay-a"></div>
        <div class="intro-content display-table">
          <div class="table-cell">
            <div class="container">
              <div class="row">
                <div class="col-lg-8">
                  <div class="intro-body">
                    <p class="intro-title-top">
                      <br> Escola Criança Feliz</p>
                    <h1 class="intro-title mb-4">
                      <span class="color-b">Salas </span> Climatizadas
                      <br> </h1>
                    
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="carousel-item-a intro-item bg-image" style="background-image: url(img/Biblioteca.jpg)">
        <div class="overlay overlay-a"></div>
        <div class="intro-content display-table">
          <div class="table-cell">
            <div class="container">
              <div class="row">
                <div class="col-lg-8">
                  <div class="intro-body">
                    <p class="intro-title-top">Escola Criança Feliz
                      <br> </p>
                    <h1 class="intro-title mb-4">
                      <span class="color-b">Biblioteca </span> Moderna
                      <br> </h1>
                   
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="carousel-item-a intro-item bg-image" style="background-image: url(img/cantina.jpg)">
        <div class="overlay overlay-a"></div>
        <div class="intro-content display-table">
          <div class="table-cell">
            <div class="container">
              <div class="row">
                <div class="col-lg-8">
                  <div class="intro-body">
                    <p class="intro-title-top">
                      <br> Escola Criança Feliz</p>
                    <h1 class="intro-title mb-4">
                      <span class="color-b">Cantina </span> Estruturada
                      <br> </h1>
                    
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="carousel-item-a intro-item bg-image" style="background-image: url(img/LabInformática.jpg)">
        <div class="overlay overlay-a"></div>
        <div class="intro-content display-table">
          <div class="table-cell">
            <div class="container">
              <div class="row">
                <div class="col-lg-8">
                  <div class="intro-body">
                    <p class="intro-title-top">
                      <br> Escola Criança Feliz</p>
                    <h1 class="intro-title mb-4">
                      <span class="color-b">Laboratório </span> de Informática
                      <br> </h1>
                    
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="carousel-item-a intro-item bg-image" style="background-image: url(img/LabBiologia.jpg)">
        <div class="overlay overlay-a"></div>
        <div class="intro-content display-table">
          <div class="table-cell">
            <div class="container">
              <div class="row">
                <div class="col-lg-8">
                  <div class="intro-body">
                    <p class="intro-title-top">
                      <br> Escola Criança Feliz</p>
                    <h1 class="intro-title mb-4">
                      <span class="color-b">Laboratório </span> de Biologia
                      <br> </h1>
                    
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="carousel-item-a intro-item bg-image" style="background-image: url(img/LabQuimica.jpg)">
        <div class="overlay overlay-a"></div>
        <div class="intro-content display-table">
          <div class="table-cell">
            <div class="container">
              <div class="row">
                <div class="col-lg-8">
                  <div class="intro-body">
                    <p class="intro-title-top">
                      <br> Escola Criança Feliz</p>
                    <h1 class="intro-title mb-4">
                      <span class="color-b">Laboratório </span>de Química
                      <br> </h1>
                    
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="carousel-item-a intro-item bg-image" style="background-image: url(img/LabEletronica.jpg)">
        <div class="overlay overlay-a"></div>
        <div class="intro-content display-table">
          <div class="table-cell">
            <div class="container">
              <div class="row">
                <div class="col-lg-8">
                  <div class="intro-body">
                    <p class="intro-title-top">
                      <br> Escola Criança Feliz</p>
                    <h1 class="intro-title mb-4">
                      <span class="color-b">Laboratório </span> de Eletrônica
                      <br> </h1>
                    
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="carousel-item-a intro-item bg-image" style="background-image: url(img/Parque.jpg)">
        <div class="overlay overlay-a"></div>
        <div class="intro-content display-table">
          <div class="table-cell">
            <div class="container">
              <div class="row">
                <div class="col-lg-8">
                  <div class="intro-body">
                    <p class="intro-title-top">
                      <br> Escola Criança Feliz</p>
                    <h1 class="intro-title mb-4">
                      <span class="color-b">Parque </span> Recreativo
                      <br> </h1>
                    
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="carousel-item-a intro-item bg-image" style="background-image: url(img/Quadra.jpg)">
        <div class="overlay overlay-a"></div>
        <div class="intro-content display-table">
          <div class="table-cell">
            <div class="container">
              <div class="row">
                <div class="col-lg-8">
                  <div class="intro-body">
                    <p class="intro-title-top">
                      <br> Escola Criança Feliz</p>
                    <h1 class="intro-title mb-4">
                      <span class="color-b">Quadra </span> Poliesportiva
                      <br> </h1>
                    
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!--/ Carousel end /-->

  <!--/ Services Star /-->
  <section class="section-services section-t8">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="title-wrap d-flex justify-content-between">
            <div class="title-box">
              <h2 class="title-a">Nossos Serviços</h2>
            </div>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-md-4">
          <div class="card-box-c foo">
            <div class="card-header-c d-flex">
              <div class="card-box-ico">
                <img src="img/classroom.png">
              </div>
              <div class="card-title-c align-self-center">
                <h2 class="title-c">Educação</h2>
              </div>
            </div>
            <div class="card-body-c">
              <p class="content-c">
                Visando familiarizar os jovens com as novas tecnologias e prepará-los para um mercado em crescimento. 
                Nas séries iniciais do ensino fundamental vemos, com frequência, a boa estrutura escolar, 
                espaços de aprendizagem divididos por disciplina nos laboratórios.
              </p>
            </div>
            <div class="card-footer-c">
              <a href="#" class="link-c link-icon">Leia mais
                <span class="ion-ios-arrow-forward"></span>
              </a>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card-box-c foo">
            <div class="card-header-c d-flex">
              <div class="card-box-ico">
                <img src="img/mortarboard.png">
              </div>
              <div class="card-title-c align-self-center">
                <h4 class="title-c">Professores</h4>
              </div>
            </div>
            <div class="card-body-c">
              <p class="content-c">
                É evidente que, para estar dentro de uma sala de aula, o professor já passou por uma graduação e está formado, 
                que é exigido para conseguir um cargo, nada mais é do que uma base. A profissão de professor é uma das mais importantes, 
                Portanto, pode-se dizer que o docente é um dos principais responsáveis pela formação da sociedade como um todo.
              </p>
            </div>
            <div class="card-footer-c">
              <a href="#" class="link-c link-icon">Leia mais
                <span class="ion-ios-arrow-forward"></span>
              </a>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card-box-c foo">
            <div class="card-header-c d-flex">
              <div class="card-box-ico">
                <img src="img/trophy.png">
              </div>
              <div class="card-title-c align-self-center">
                <h5 class="title-c">Campeonatos</h5>
              </div>
            </div>
            <div class="card-body-c">
              <p class="content-c">
                As disputas do Campeonato Escolar
                 2019 aproximam-se das finais e os vencedores devem ser conhecidos em breve. Neste ano, cerca de 500 estudantes
                  de escolas estaduais e particulares do município participam do torneio promovido pela Prefeitura.
              </p>
            </div>
            <div class="card-footer-c">
              <a href="#" class="link-c link-icon">Leia mais
                <span class="ion-ios-arrow-forward"></span>
              </a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!--/ Services End /-->

  

  <!--/ footer Star /-->
  <section class="section-footer">
    <div class="container">
      <div class="row">
        <div class="col-sm-12 col-md-4">
          <div class="widget-a">
            <div class="w-header-a">
              <h3 class="w-title-a text-brand">Escola Criança Feliz</h3>
            </div>
            <div class="w-body-a">
              <p class="w-text-a color-text-a">
                Paulo Afonso - Bahia
              </p>
            </div>
            <div class="w-footer-a">
              <ul class="list-unstyled">
                <li class="color-a">
                  <span class="color-text-a">Telefone .</span>+55 075 32829452 </li>
                <li class="color-a">
                  <span class="color-text-a">E-mail .</span> criancafeliz@escola.com</li>
              </ul>
            </div>
          </div>
        </div>
        <div class="col-sm-12 col-md-4 section-md-t3">
          <div class="widget-a">
            <div class="w-header-a">
              <h3 class="w-title-a text-brand">Mapa do Site</h3>
            </div>
            <div class="w-body-a">
              <div class="w-body-a">
                <ul class="list-unstyled">
                  <li class="item-list-a">
                    <i class="fa fa-angle-right"></i> <a href="#">Home</a>
                  </li>
                  <li class="item-list-a">
                    <i class="fa fa-angle-right"></i> <a href="#">Matrícula</a>
                  </li>
                  <li class="item-list-a">
                    <i class="fa fa-angle-right"></i> <a href="#">Diário</a>
                  </li>
                  <li class="item-list-a">
                    <i class="fa fa-angle-right"></i> <a href="#">Boletim</a>
                  </li>
                  <li class="item-list-a">
                    <i class="fa fa-angle-right"></i> <a href="#">Disciplina</a>
                  </li>
                  <li class="item-list-a">
                    <i class="fa fa-angle-right"></i> <a href="#">Avaliação</a>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
              <div class="col-sm-12 col-md-4 section-md-t3">
          <div class="widget-a">
            <div class="w-header-a">
              <h3 class="w-title-a text-brand">Patrocinadores</h3>
            </div>
            <div class="w-body-a">
              <ul class="list-unstyled">
                <li class="item-list-a">
                  <i class="fa fa-angle-right"></i> <a href="#">Loja Venezuela</a>
                </li>
                <li class="item-list-a">
                  <i class="fa fa-angle-right"></i> <a href="#">Mercado do China</a>
                </li>
                <li class="item-list-a">
                  <i class="fa fa-angle-right"></i> <a href="#">Contabilidade HK</a>
                </li>
                <li class="item-list-a">
                  <i class="fa fa-angle-right"></i> <a href="#">Livraria Tina</a>
                </li>
                <li class="item-list-a">
                  <i class="fa fa-angle-right"></i> <a href="#">Imports Singapore</a>
                </li>
                <li class="item-list-a">
                  <i class="fa fa-angle-right"></i> <a href="#">Lojas Philippines</a>
               </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <footer>
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <nav class="nav-footer">
            <ul class="list-inline">
              <li class="list-inline-item">
                <a href="#">Home</a>
              </li>
              <li class="list-inline-item">
                <a href="#">Matrícula</a>
              </li>
              <li class="list-inline-item">
                <a href="#">Diário</a>
              </li>
              <li class="list-inline-item">
                <a href="#">Boletim</a>
              </li>
              <li class="list-inline-item">
                <a href="#">Disciplina</a>
              </li>
              <li class="list-inline-item">
                <a href="#">Avaliação</a>
              </li>
            </ul>
              
          </nav>
          <div class="socials-a">
            <ul class="list-inline">
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-facebook" aria-hidden="true"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-twitter" aria-hidden="true"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-instagram" aria-hidden="true"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-pinterest-p" aria-hidden="true"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-dribbble" aria-hidden="true"></i>
                </a>
              </li>
            </ul>
          </div>
          <div class="copyright-footer">
            <p class="copyright color-text-a">
              &copy; Copyright
              <span class="color-a">Escola Criança Feliz</span> All Rights Reserved.
            </p>
          </div>
          
        </div>
      </div>
    </div>
  </footer>
  <!--/ Footer End /-->

  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>
  <div id="preloader"></div>

  
  
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/scrollreveal.min.js"></script>
  <!-- Contact Form JavaScript File -->
  
  
  <!-- Template Main Javascript File -->
  <script src="js/main.js"></script>
    </body>
</html>
