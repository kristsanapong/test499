<?php
	header("content-type:text/javascript;charset=utf-8");
	define('HOST','localhost');
	define('USER','root');
	define('PASS','');
	define('DB','blood_donation');

	if ($_SERVER['REQUEST_METHOD']=='GET') {

		$con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to connect');

		mysqli_set_charset($con,"utf8");
		$sql = "SELECT account.firstname, account.lastname, account.bloodgroup FROM queue INNER JOIN account ON queue.q_username = account.username";
		$r = mysqli_query($con,$sql);
		$result = array();

		while ($row = mysqli_fetch_array($r)){
			$temp = array();
			// $temp['username'] = $row['username'];
			$temp['firstname'] = $row['firstname'];
			$temp['lastname'] = $row['lastname'];
			$temp['bloodgroup'] = $row['bloodgroup'];
			array_push($result, $temp);
			// array_push($result, $row);
		}

		echo json_encode(array('result' => $result));

		mysqli_close($con);
}
