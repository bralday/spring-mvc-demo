<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>


<html>

<head>
<title>Student Registration Form</title>

</head>

<body>
	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" />
		<br>
		<br>
	
	Last Name: <form:input path="lastName" />
		<br>
		<br>
	
	Country: 	<form:select path="country">
				<!-- <form:option value="Philippines" label="Philippines" />
				<form:option value="Japan" label="Japan" />
				<form:option value="Canada" label="Canada" /> -->
				
				<form:options items="${student.countryOptions}" />
				</form:select>
		<br>
		<br>
		
		Java	<form:radiobutton path="favoriteLanguage" value="Java"/>
		C#		<form:radiobutton path="favoriteLanguage" value="C#"/>
		PHP		<form:radiobutton path="favoriteLanguage" value="PHP"/>
		<br>
		<br>
		
		Windows	<form:checkbox path="operatingSystems" value="Windows"/>
		Mac OS	<form:checkbox path="operatingSystems" value="Mac OS"/>
		Linux	<form:checkbox path="operatingSystems" value="Linux"/>
		<br>
		<br>
		
		<input type="submit" value="Submit" />
		<br>
		<br>

	</form:form>

</body>

</html>