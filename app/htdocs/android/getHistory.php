<?php
include 'db_connect.php';

	if (isset($_POST)) {

		$username = $_POST['username'];
		$sql = "SELECT detail FROM history WHERE username = '$username'";
		$r = mysqli_query($con,$sql);
		$result = array();

		while ($row = mysqli_fetch_array($r)){
			$temp = array();
			$temp['detail'] = $row['detail'];
			array_push($result, $temp);
			// array_push($result, $row);
		}

		echo json_encode(array('result' => $result));

		
	}
	mysqli_close($con);
?>