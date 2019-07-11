<?php
include 'db_connect.php';

	if (isset($_POST)) {

		$username = $_POST['username'];
		$sql = "SELECT firstname, lastname FROM history WHERE username = '$username'";
		$sql2 = "SELECT firstname, lastname FROM account WHERE username = '$username'";
		$sql3 = "SELECT firstname, lastname FROM technician_account WHERE username = '$username'";
		$r = mysqli_query($con,$sql);
		$r2 = mysqli_query($con, $sql2);
		$r3 = mysqli_query($con, $sql3);
		$result = array();
		$name = array();
		
			while ($row = mysqli_fetch_array($r)){
				$temp = array();
				//$temp['detail'] = $row['detail'];
				$temp['firstname'] = $row['firstname'];
				$temp['lastname'] = $row['lastname'];
				array_push($result, $temp);
				// array_push($result, $row);
			}
		
		if(mysqli_num_rows($r2) > 0){
			while ($row = mysqli_fetch_array($r2)){
				$temp = array();
				$temp['firstname'] = $row['firstname'];
				$temp['lastname'] = $row['lastname'];
				array_push($result, $temp);
			}
		}
		elseif(mysqli_num_rows($r3) > 0){
			while ($row = mysqli_fetch_array($r3)){
				$temp = array();
				$temp['firstname'] = $row['firstname'];
				$temp['lastname'] = $row['lastname'];
				array_push($result, $temp);
			}
		}

		echo json_encode(array('result' => $result));
		//echo json_encode(array('name' => $name));


		
	}
	mysqli_close($con);
?>