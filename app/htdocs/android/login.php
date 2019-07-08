<?php
	
	define('HOST','localhost');
	define('USER','root');
	define('PASS','');
	define('DB','blood_donation');
	$con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to connect');
	$json = array();

	if (isset($_POST)) {
		$username = $_POST['username'];
		$password = $_POST['password'];
		
			$query = "SELECT * FROM account WHERE username = '$username' AND password = '$password'";
			
			$result = mysqli_query($con,$query);
			if(mysqli_num_rows($result) > 0){
           
                $json['success'] = 1;
                $json['message'] = "Successfully logged in";
                echo "success";
            } else {
            	$json['success'] = 0;
                $json['message'] = "Failed to log in";
            	echo "fail";
            }
           
	}
	
	mysqli_close($con);
?>