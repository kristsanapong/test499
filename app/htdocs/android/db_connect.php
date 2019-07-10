<?php
	header("content-type:text/javascript;charset=utf-8");
	define('HOST','localhost');
	define('USER','root');
	define('PASS','');
	define('DB','blood_donation');
	$con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to connect');
	mysqli_set_charset($con,"utf8");
	
?>