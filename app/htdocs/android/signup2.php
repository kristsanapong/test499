<?php
	// header("content-type:text/javascript;charset=utf-8");
	// define('HOST','localhost');
	// define('USER','root');
	// define('PASS','');
	// define('DB','blood_donation');
	include 'db_connect.php';

	if ($_SERVER['REQUEST_METHOD']=='GET') {

		// $con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to connect');

		// mysqli_set_charset($con,"utf8");
		$sql = "SELECT * FROM `account`";
		$r = mysqli_query($con,$sql);
		$result = array();

		while ($row = mysqli_fetch_array($r)){
			array_push($result, array("firstname" => $row['firstname']));
		}

		echo json_encode(array('result' => $result));

		mysqli_close($con);
}
