<?php 
 
	/*
	* Created by Belal Khan
	* website: www.simplifiedcoding.net 
	* Retrieve Data From MySQL Database in Android
	*/
	
	//database constants
	define('DB_HOST', 'localhost');
	define('DB_USER', 'root');
	define('DB_PASS', '');
	define('DB_NAME', 'blood_donation');
	
	//connecting to database and getting the connection object
	$conn = new mysqli(DB_HOST, DB_USER, DB_PASS, DB_NAME);
	
	//Checking if any error occured while connecting
	if (mysqli_connect_errno()) {
		echo "Failed to connect to MySQL: " . mysqli_connect_error();
		die();
	}
	
	//creating a query
	$stmt = $conn->prepare("SELECT username, password, firstname, lastname, citizen_id, sex, bloodgroup FROM account;");
	
	//executing the query 
	$stmt->execute();
	
	//binding results to the query 
	$stmt->bind_result($username, $password, $firstname, $lastname, $citizen_id, $sex, $bloodgroup);
	
	$account = array(); 
	
	//traversing through all the result 
	while($stmt->fetch()){
		$temp = array();
		$temp['username'] = $username; 
		$temp['password'] = $password; 
		$temp['firstname'] = $firstname; 
		$temp['lastname'] = $lastname; 
		$temp['citizen_id'] = $citizen_id; 
		$temp['sex'] = $sex;
		$temp['bloodgroup'] = $bloodgroup; 
		array_push($account, $temp);
	}
	
	//displaying the result in json format 
	echo json_encode($account);