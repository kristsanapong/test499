<?php
	header("content-type:text/javascript;charset=utf-8");
	define('HOST','localhost');
	define('USER','root');
	define('PASS','');
	define('DB','blood_donation');
	$con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to connect');


	if (isset($_POST)) {
		

		$username = $_POST['username'];
		$firstname = $_POST['firstname'];
		$lastname = $_POST['lastname'];
		$password = $_POST['password'];
			
		mysqli_set_charset($con,"utf8");
		$sql = "INSERT INTO technician_account (username, firstname, lastname, password) VALUES ('$username', '$firstname', '$lastname', '$password')";
		if(mysqli_query($con,$sql)){
			echo 'success';
		}else{
			echo 'fail';
		}
		
		
	}
	mysqli_close($con);
?>