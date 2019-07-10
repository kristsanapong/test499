<?php
	include 'db_connect.php';

	if (isset($_POST)) {
		
		$news_lead = $_POST['news_lead'];
			
		$sql = "INSERT INTO news (news_lead) VALUES ('$news_lead')";
		if(mysqli_query($con,$sql)){
			echo 'success';
		}else{
			echo 'fail';
		}
		
		
	}
	mysqli_close($con);
?>