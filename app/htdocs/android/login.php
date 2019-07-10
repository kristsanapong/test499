<?php
	
	// define('HOST','localhost');
	// define('USER','root');
	// define('PASS','');
	// define('DB','blood_donation');
	// $con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to connect');
	include 'db_connect.php';
	$json = array();
	
	if (isset($_POST)) {
		$username = $_POST['username'];
		$password = $_POST['password'];
		
			$query = "SELECT * FROM account WHERE username = '$username' AND password = '$password'";
			$query2 = "SELECT * FROM technician_account WHERE username = '$username' AND password = '$password'";
			$result = mysqli_query($con,$query);
			$result2 = mysqli_query($con, $query2);
			if(mysqli_num_rows($result) > 0){
                
                while ($row = mysqli_fetch_array($result)){
					$temp = array();
					$temp['username'] = $row['username'];
					$temp['bloodgroup'] = $row['bloodgroup'];
					array_push($json, $temp);
				}
				echo json_encode(array('result' => $json));
                echo "user success";
            } elseif(mysqli_num_rows($result2) > 0){
            	while ($row = mysqli_fetch_array($result)){
					$temp = array();
					$temp['username'] = $row['username'];
					$temp['firstname'] = $row['firstname'];
					$temp['lastname'] = $row['lastname'];
					array_push($json, $temp);
				}
                echo json_encode(array('result' => $json));
                echo "admin success";
            } else {
            	$json['success'] = 0;
                $json['message'] = "Failed to log in";
            	echo "fail";
            }
            
           
	}
	
	mysqli_close($con);
?>