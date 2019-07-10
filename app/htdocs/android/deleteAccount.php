<?php
	
	// define('HOST','localhost');
	// define('USER','root');
	// define('PASS','');
	// define('DB','blood_donation');
	// $con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to connect');
	// mysqli_set_charset($con,"utf8");
	include 'db_connect.php';

	if (isset($_POST)) {
		$firstname = $_POST['firstname'];
		$lastname = $_POST['lastname'];
		
		$sql = "DELETE FROM account WHERE account.firstname = '$firstname' AND account.lastname = '$lastname'";
			mysqli_query($con,$sql);
		
		if(mysqli_affected_rows($con) > 0){
            echo "delete success";
        } else {
            echo "fail";
        }

		
	}
	mysqli_close($con);
?>