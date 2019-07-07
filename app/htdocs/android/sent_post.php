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
	$stmt = $conn->prepare("INSERT INTO account (username, password, firstname, lastname, citizen_id, sex, bloodgroup) VALUES ();");
	
	//test data
	$sql = "INSERT INTO account (username, password, firstname, lastname, citizen_id, sex, bloodgroup) VALUES ('wichaya_poka', '6117', 'Wichaya', 'Pokasuwanna', '1520100119381', 'M', 'B')";
	//post data
	if ($conn->query($sql) === TRUE) {
    	echo "New record created successfully";
	} else {
    	echo "Error: " . $sql . "<br>" . $conn->error;
	}
	$conn->close();