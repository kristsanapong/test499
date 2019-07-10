<?php
	
	include 'db_connect.php';

	if (isset($_POST)) {
		$news_lead = $_POST['news_lead'];
		
		$sql = "DELETE FROM news WHERE news.news_lead = '$news_lead'";
		mysqli_query($con,$sql);
		
		if(mysqli_affected_rows($con) > 0){
            echo "delete success";
        } else {
            echo "fail";
        }

		
	}
	mysqli_close($con);
?>