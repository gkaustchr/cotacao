<?php
		//@error_reporting(E_WARNING);
		@session_start();
		include('banco.php');
		if(!$_SESSION['status']){
			echo "ERROR <br />";
		}else{
			//echo "CONECTADO <br />";
		}
    	$botao = isset($_POST['btn']);
    	$historico = isset($_POST['btnHistorico']);

    	$f = new Funcoes();
	 	
    	if($botao == "INSERIR"){
    	  
    		$f ->	InsertAcao();
    	}
    	if($botao == "ALTERAR"){
    		$f -> UpdateAcao();
    	}
    	if($botao == "EXCLUIR"){
    		$f -> DeleteAcao();
    	}

    	if($historico == "INSERIR"){
    		$f -> InsertHistorico();
    	}

    	if($historico == "ALTERAR"){
    		$f -> UpdateHistorico();
    	}

    	if($historico == "EXCLUIR"){
    		$f -> DeleteHistorico();
    	}

    class funcoes{
        
    	/**/

    	// AÇÃO  AÇÃO AÇÃO AÇÃO AÇÃO AÇÃO AÇÃO AÇÃO AÇÃO AÇÃO AÇÃO ///////

		public function InsertAcao(){
			$nomeAcao = $_POST['nomeAcao'];
			$nomeEmpresa = $_POST['empresa'];
			$valorAcao = $_POST['valor'];
			
			
			$sql = "INSERT INTO `acao`(`nome`, `empresa`, `valor`) VALUES ('$nomeAcao', '$nomeEmpresa', '$valorAcao')";
			$query = mysqli_query($_SESSION['conexao'], $sql) or die(mysqli_error($_SESSION['conexao']));
			$linhas = mysqli_affected_rows($_SESSION['conexao']);
				if($linhas >= 1) {
					$_SESSION['mensagem'] = $nomeEmpresa ."CADASTRADO COM SUCESSO";
					header("Location: https://metafinanceira.000webhostapp.com/Cotacao/index.php");
				}
		}

		public function UpdateAcao(){
			$idAcao = $_POST['idAcao'];
			$nomeAcao = $_POST['nomeAcao'];
			$nomeEmpresa = $_POST['empresa'];
			$valorAcao = $_POST['valor'];
			
			$sql = "UPDATE `acao` SET `nome`= '$nomeAcao',`empresa`= '$nomeEmpresa',`valor`= '$valorAcao' WHERE `id` = '$idAcao'";
			$query = mysqli_query($_SESSION['conexao'], $sql) or die(mysqli_error($_SESSION['conexao']));
			$linhas = mysqli_affected_rows($_SESSION['conexao']);
				if($linhas >= 1) {
					$_SESSION['mensagem'] = "ALTERADO COM SUCESSO";
					header("Location: https://metafinanceira.000webhostapp.com/Cotacao/index.php");
				}
		}

		public function DeleteAcao(){
			$idAcao = $_POST['idAcao'];

			$sql = "DELETE FROM `acao` WHERE `id` =  '$idAcao'";
			$query = mysqli_query($_SESSION['conexao'], $sql) or die(mysqli_error($_SESSION['conexao']));
			$linhas = mysqli_affected_rows($_SESSION['conexao']);
				if($linhas >= 1) {
					$_SESSION['mensagem'] = "DELETADO COM SUCESSO";
					header("Location: https://metafinanceira.000webhostapp.com/Cotacao/index.php");
				}
		}

		public function listarAcoes(){
			//selecionar todos
			$sql = "SELECT * FROM `acao` ORDER BY id ASC";
			$query = mysqli_query($_SESSION['conexao'], $sql) or die(mysqli_error($_SESSION['conexao']));

			//total de linhas
			$linhas = mysqli_affected_rows($_SESSION['conexao']);
			if($linhas >= 1) {
				
				while($linha = mysqli_fetch_array($query)) {
							
						    echo "   ".$linha['id'];
							echo "   ".$linha['nome'];
							echo "   ".$linha['empresa'];
							echo "   R$ ".number_format($linha['valor'],2,',','');
							echo "<br/>";							
					echo "<hr>";
				}
				
			}
			
		}


		/////// HISTORICO  HISTORICO HISTORICO HISTORICO HISTORICO HISTORICO HISTORICO HISTORICO /////
		
		public function listarHistorico(){
			//selecionar todos
			$sql = "SELECT * FROM `historico` ORDER BY id DESC";
			$query = mysqli_query($_SESSION['conexao'], $sql) or die(mysqli_error($_SESSION['conexao']));

			//total de linhas
			$linhas = mysqli_affected_rows($_SESSION['conexao']);
			if($linhas >= 1) {
				
				while($linha = mysqli_fetch_array($query)) {
					if($linha['caiu']==1){
							echo " <font color='red'>  id: ".$linha['id'];
						    echo "  id_Acao: ".$linha['id_acao'];
							echo "   ".$linha['data'];
							echo "   R$ ".number_format($linha['valor'],2,',','')."</font>";
					}else{
						echo " <font color='green'> id: ".$linha['id'];
						    echo "  id_Acao: ".$linha['id_acao'];
							echo "   ".$linha['data'];
							echo "   R$ ".number_format($linha['valor'],2,',','')."</font>";
					}
							echo "<br/>";							
					echo "<hr>";
				}
				
			}
			
		}

		public function InsertHistorico(){
			$idAcao = $_POST['idAcao'];
			$data = $_POST['data'];
			$valorAcao = $_POST['valor'];
			$caiu = $_POST['caiu'];
			
			
			$sql = "INSERT INTO `historico`(`id_acao`, `data`, `valor`, `caiu`)  VALUES ('$idAcao', '$data', '$valorAcao', '$caiu')";
			$query = mysqli_query($_SESSION['conexao'], $sql) or die(mysqli_error($_SESSION['conexao']));
			$linhas = mysqli_affected_rows($_SESSION['conexao']);
				if($linhas >= 1) {
					$_SESSION['mensagem'] = $idAcao ." CADASTRADO COM SUCESSO";
					header("Location: https://metafinanceira.000webhostapp.com/Cotacao/index.php");
				}
		}


		public function UpdateHistorico(){
			$idHistorico = $_POST['idHistorico'];
			$idAcao = $_POST['idAcao'];
			$data = $_POST['data'];
			$valorAcao = $_POST['valor'];
			$caiu = $_POST['caiu'];
			
			$sql = "UPDATE `historico` SET `id_acao`= '$idAcao',`data`='$data',`valor`='$valorAcao',`caiu`='$caiu' WHERE `id` = $idHistorico";
			$query = mysqli_query($_SESSION['conexao'], $sql) or die(mysqli_error($_SESSION['conexao']));
			$linhas = mysqli_affected_rows($_SESSION['conexao']);
				if($linhas >= 1) {
					$_SESSION['mensagem'] = "ALTERADO COM SUCESSO";
					header("Location: https://metafinanceira.000webhostapp.com/Cotacao/index.php");
				}
		}

		public function DeleteHistorico(){
			$idHistorico = $_POST['idHistorico'];

			$sql = "DELETE FROM `historico` WHERE `id` = $idHistorico";
			$query = mysqli_query($_SESSION['conexao'], $sql) or die(mysqli_error($_SESSION['conexao']));
			$linhas = mysqli_affected_rows($_SESSION['conexao']);
				if($linhas >= 1) {
					$_SESSION['mensagem'] = "DELETADO COM SUCESSO";
					header("Location: https://metafinanceira.000webhostapp.com/Cotacao/index.php");
					
				}
		}
	}	

?>