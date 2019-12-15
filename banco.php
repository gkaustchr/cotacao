<?php
	@session_start();
	$banco = "id10868208_contador";
	$usuario = "id10868208_guiacontador";
	$senha = "gk414141";
	$host = "localhost";
	$conexao = false;
	$conn = mysqli_connect($host,$usuario,$senha,$banco);
	
	
	if(!$conn){
		$conexao = false;
	}else{
		$conexao = true;
	}
	$_SESSION['status'] = $conexao;
	$_SESSION['conexao'] = $conn;
?>