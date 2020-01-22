<?php
	@session_start();
	$banco = "KQiUZIns5T";
	$usuario = "KQiUZIns5T";
	$senha = "ooSFle1re3";
	$host = "remotemysql.com:3306/";
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