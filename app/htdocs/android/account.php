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
		$sql = "(SELECT technician_account.firstname,technician_account.lastname FROM technician_account ORDER BY firstname ASC) UNION (SELECT account.firstname,account.lastname FROM account ORDER BY username ASC)";
		$r = mysqli_query($con,$sql);
		$result = array();

		while ($row = mysqli_fetch_array($r)){
			$temp = array();
			// $temp['username'] = $row['username'];
			$temp['firstname'] = $row['firstname'];
			$temp['lastname'] = $row['lastname'];
			array_push($result, $temp);
			// array_push($result, $row);
		}

		echo json_encode(array('result' => $result));

		mysqli_close($con);
}
