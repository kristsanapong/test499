<?php
	header("content-type:text/json;charset=utf-8");
	define('HOST','localhost');
	define('USER','root');
	define('PASS','');
	define('DB','blood_donation');
	$con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to connect');
	$json = array();
	mysqli_set_charset($con,"utf8");
	if (isset($_POST)) {
		$firstname = $_POST['firstname'];
		$lastname = $_POST['lastname'];
		// $firstname = 'กฤษณพงษ์';
		// $lastname = 'พุ่มดอกไม้';
		// $firstname = iconv("tis-620", "utf-8", $firstname);
		// $lastname = iconv("tis-620", "utf-8", 'พุ่มดอกไม้');
		
			$query = "SELECT * FROM account WHERE firstname = '$firstname' AND lastname = '$lastname'";
			$query2 = "SELECT * FROM technician_account WHERE firstname = '$firstname' AND lastname = '$lastname'";
			$result = mysqli_query($con,$query); //account
			$result2 = mysqli_query($con, $query2); //technician
			$account = array();
			$technician = array();
			if(mysqli_num_rows($result) > 0){
				while ($row = mysqli_fetch_array($result)){
					$temp = array();
					$temp['firstname'] = $row['firstname'];
					$temp['lastname'] = $row['lastname'];
					$temp['citizen_id'] = $row['citizen_id'];
					$temp['firstname'] = $row['firstname'];	
					$temp['username'] = $row['username'];
					$temp['sex'] = $row['sex'];
					$temp['bloodgroup'] = $row['bloodgroup'];
					array_push($account, $temp);
				}
				echo json_encode(array('result' => $account));
                
            } elseif (mysqli_num_rows($result2) > 0){
               	while ($row = mysqli_fetch_array($result2)){
					$temp = array();
					$temp['firstname'] = $row['firstname'];
					$temp['lastname'] = $row['lastname'];
					array_push($technician, $temp);
				}
				echo json_encode(array('result2' => $technician));
            } else {
            	echo "fail";
            }
            
           
	}
	
	mysqli_close($con);
?>