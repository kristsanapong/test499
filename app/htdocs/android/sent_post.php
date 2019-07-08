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
		$citizen_id = $_POST['citizen_id'];
		$sex = $_POST['sex'];
		$bloodgroup = $_POST['bloodgroup'];
		$password = $_POST['password'];
			
		mysqli_set_charset($con,"utf8");
		$sql = "INSERT INTO account (username, password, firstname, lastname, citizen_id, sex, bloodgroup) VALUES ('$username', '$password', '$firstname', '$lastname', '$citizen_id', '$sex', '$bloodgroup')";
		if(mysqli_query($con,$sql)){
			echo 'success';
		}else{
			echo 'fail';
		}
		
		
	}
	mysqli_close($con);
?>