<%-- 
    Document   : index
    Created on : 4 déc. 2014, 18:05:00
    Author     : Oto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>SupSms</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="text/javascript" src="js/jquery.js"></script>
        <!-- Bootstrap core CSS -->
        <link href="../css/bootstrap.min.css" rel="stylesheet">
        <link href="../css/customer.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="../css/jumbotron.css" rel="stylesheet">
    </head>

    <body>
        <div class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand btn btn-link btn-lg"><span class="glyphicon glyphicon glyphicon-envelope"></span>SupSms</a>
                </div>
                <div class="navbar-collapse collapse">

                    <form class="navbar-form navbar-right"  method="post">

                        <div class="form-group">

                        </div>

                        <div class="form-group">
                            <input type="text" name="username" placeholder="Utilisateur" class="form-control">
                        </div>
                        <div class="form-group">
                            <input type="password" name="password" placeholder="Mot de passe" class="form-control">
                        </div>
                        <button type="submit" class="btn btn-success">Connexion</button>
                        <a class="btn btn-default btn-info" role="button">S'inscrire &raquo;</a>
                    </form>
                </div><!--/.navbar-collapse -->
            </div>
        </div>

        <!-- Main jumbotron for a primary marketing message or call to action -->

        <div class="jumbotron">
            <div class="container">
                <div class="row col-lg-12 col-sm-12 col-md-12 afterForm">
                    <form role="form" method="post">
                        
                        <div class="form-group">
                            <label for="nom" >Nom</label>
                            <input type="text" class="form-control" placeholder="Entrer votre nom"  name="firstname"/><br/>
                        </div>
                        
                        <div class="form-group">
                            <label for="prenom">Prénom</label>
                            <input type="text" class="form-control" placeholder="Entrer votre prénom" name="lastname"/><br/>
                        </div>
                        
                        <div class="form-group">
                        <label for="email">Email</label>
                        <input type="text" class="form-control" placeholder="Entrer votre email" name="mail"/><br/>
                        </div>
                        
                        <div class="form-group">
                        <label for="numerotel">Numéro de téléphone</label>
                        <input type="tel" class="form-control" placeholder="Entrer votre numéro" name="numberphone"/><br/>
                        </div>
                        
                        <div class="form-group">
                        <label for="password">Mot de passe</label>
                        <input type="password" class="form-control" placeholder="Entrer votre mot de passe" name="password"/><br/>
                        </div>
                        <button class="btn btn-success" type="submit">send</button>
                        <button class="btn btn-info" type="reset">reset</button>
                </div>
                </form>   
            </div>
        </div>
    </div>



    <div class="container">
        <footer class="nav navbar-default navbar-fixed-bottom">
            <p>Made with <span class="glyphicon glyphicon-heart"></span> in Paris, &copy; Tous droits réservés.</p>
        </footer>
    </div> <!-- /container -->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/holder.js"></script>
    <script type="text/javascript" src="../js/npm.js"></script>
</body>

</html>
