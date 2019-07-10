<?php
	header("content-type:text/javascript;charset=utf-8");
	define('HOST','localhost');
	define('USER','root');
	define('PASS','');
	define('DB','blood_donation');
	$con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to connect');


	if (isset($_POST)) {
		

		$q_username = $_POST['q_username'];
		$q_bloodgroup = $_POST['q_bloodgroup'];
			
		mysqli_set_charset($con,"utf8");
		$sql = "INSERT INTO queue (q_username, q_bloodgroup) VALUES ('$q_username', '$q_bloodgroup')";
		if(mysqli_query($con,$sql)){
			echo 'success';
		}else{
			echo 'fail';
		}
		
		
	}
	mysqli_close($con);
?>