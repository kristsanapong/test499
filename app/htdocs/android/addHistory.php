<?php
	// header("content-type:text/javascript;charset=utf-8");
	// define('HOST','localhost');
	// define('USER','root');
	// define('PASS','');
	// define('DB','blood_donation');
	// $con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to connect');
	include 'db_connect.php';


	if (isset($_POST)) {
		

		$username = $_POST['username'];
		$firstname = $_POST['firstname'];
		$lastname = $_POST['lastname'];
		$detail = $_POST['detail'];
		// $username = 'alee1@gmail.com';
		// $firstname = 'm';
		// $lastname = 'm';
		// $detail = 'm';
		
			
		// mysqli_set_charset($con,"utf8");
		$sql = "INSERT INTO history (username, firstname, lastname, detail) VALUES ('$username', '$firstname', '$lastname', '$detail')";
		if(mysqli_query($con,$sql)){
			echo 'history success';
		}else{
			echo 'fail';
		}
		
		
	}
	mysqli_close($con);
?>