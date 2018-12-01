<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="layout.css">
<title>HMS welcome page</title>
</head>
<body>

	<div class="top_panel">
		<div class="div_logo">
			<img id="logo" alt="HMS" src="logo.png">
		</div>

		<div class="div_name">
			<h1>WELCOME</h1>
		</div>

		<div class="div_logout">
			<a href="logout.jsp">Logout</a>
		</div>
	</div>
	<div class="middle_panel">
		<div id="blur_img"></div>
		<div class="left_panel">
		<br> ${successMessage} <br>
			<table>
				<tr>
					<td><a id="bookRoom" href="hotels.jsp">Book room</a></td>
				</tr>
				<tr>
					<td><a id="CancelRoom" href="cancel.jsp">Cancel room</a></td>				
				</tr>
				<tr>
					<td><a id="EditRoom" href="editroom.jsp">Edit room</a></td>				
				</tr>				
				<tr>
					<td><a href="#">My booking</a></td>
				</tr>
				<tr>
					<td><a id="addRoom" href="addRoom.jsp">Add room</a></td>
				</tr>
				<tr>
					<td><a href="#">Hotel Details</a></td>
				</tr>
			</table>
		</div>

		<div class="center_panel">
			<h1> ${message} !!! </h1>
		</div>

		<div class="right_panel"></div>
	</div>


	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script type="text/javascript" src="script.js"></script>



</body>
</html>