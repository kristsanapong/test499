<?php
	
	define('HOST','localhost');
	define('USER','root');
	define('PASS','');
	define('DB','blood_donation');
	$con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to connect');

	if (isset($_POST)) {
		$q_username = $_POST['q_username'];
		
		$sql = "DELETE FROM queue WHERE queue.q_username = '$q_username'";
		mysqli_query($con,$sql);
		
		if(mysqli_affected_rows($con) > 0){
            echo "delete success";
        } else {
            echo "fail";
        }

		
	}
	mysqli_close($con);
?>