<!DOCTYPE html>
<html>
<head>
	<title>GUIA INVEST</title>
	
</head>
<body>			
		<div id="acoes">
			<h1>AÇÕES</h1>
			<form action="funcoes.php" method="POST" >
	 			<input type="text" name="idAcao" placeholder="ID ACAO" />
	 			<input type="text" name="nomeAcao" placeholder="ABCD3" />
	 			<input type="text" name="empresa" placeholder="ABCD S/A" />
	 			<input type="text" name="valor" placeholder="12.5" /><br/><br/>
	 			<input type="submit" name="btn" value="INSERIR" />
	 			<input type="submit" name="btn" value="ALTERAR" />
	 			<input type="submit" name="btn" value="EXCLUIR" />
	 	</form>
			<?php
				@error_reporting(E_WARNING);
				@session_start();
				
				require_once "funcoes.php";
	 			$f = new Funcoes();
	 			echo "<hr>";
	 				echo "<h3>".isset($_SESSION['mensagem'])."</h3>";
				echo "<hr>";
	 			$f -> listarAcoes();
		   ?>
	 	</div>
	 	<div id="historico">
	 		<h1>HISTORICO</h1>
	 		<form action="funcoes.php" method="POST" >
	 			<input type="text" name="idHistorico" placeholder="ID historico" />
	 			<input type="text" name="idAcao" placeholder="Id Acao" />
	 			<input type="text" name="data" placeholder="01/01/2020" />
	 			<input type="text" name="valor" placeholder="12.5" />
	 			<input type="text" name="caiu" placeholder="Caiu 1" /><br/><br/>
	 			<input type="submit" name="btnHistorico" value="INSERIR" />
	 			<input type="submit" name="btnHistorico" value="ALTERAR" />
	 			<input type="submit" name="btnHistorico" value="EXCLUIR" />
	 	</form>
	 		<?php
				
	 			$f -> listarHistorico();
		   ?>
	 	</div>
		
</body>
</html>