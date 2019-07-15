<?php
	header("content-type:text/javascript;charset=utf-8");
	define('HOST','localhost');
	define('USER','root');
	define('PASS','');
	define('DB','blood_donation');

	if ($_SERVER['REQUEST_METHOD']=='GET') {

		$con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to connect');

		mysqli_set_charset($con,"utf8");
		$sql = "SELECT news.news_lead, DATE(news.news_date) FROM news ORDER BY news_date DESC";
		$r = mysqli_query($con,$sql);
		$result = array();

		while ($row = mysqli_fetch_array($r)){
			$temp = array();
			
			$temp['news_lead'] = $row['news_lead'];
			$temp['news_date'] = $row['DATE(news.news_date)'];
			array_push($result, $temp);
		}

		echo json_encode(array('result' => $result));

		mysqli_close($con);
}
