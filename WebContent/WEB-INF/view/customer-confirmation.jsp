<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>


<html>

<head>
<title>Customer Confirmation</title>

</head>

<body>
	Valid customer is confirmed: ${customer.firstName} ${customer.lastName}
	<br>
	Free Passes: ${customer.freePasses}
	<br> 
	Customer Postal Code: ${customer.postalCode}
	<br> 
	Customer Course Code: ${customer.courseCode}
	<br> 

</body>

</html>