<%@page import="Utility.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String pid = request.getParameter("pid");
DBConnection db = new DBConnection();
Connection con = db.createConnection();
Statement statement = con.createStatement();
ResultSet resultSet = null;

%>
<%
try{

String sql ="select * from product where pid='"+pid+"'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>  AGRO  </title>
<link rel="stylesheet" href="Update_Pri.css">

</head>

<body>




<div class="bod" >
<center><h2><font color="#02075d">UPDATE PRODUCT</font></h2></center>
<form method="post" action="update_process_ni.jsp">
<h3>
<pre>
	PID : 		<input type="number" name="pid" value="<%=resultSet.getString("pid") %>" /></br>
	PRODUCT NAME : 	<input type="text" name="product" value="<%=resultSet.getString("product") %>" /></br>
	SEASON : 	<input type="text" name="season"  value="<%=resultSet.getString("season") %>" ></br>
	CATEGORY : 	<input type="text" name="category" value="<%=resultSet.getString("category") %>" /><br>
	PLACES : 	<input type="text" name="places" value="<%=resultSet.getString("places") %>" /></br>
	DETAILS : <input type="text" name="details" value="<%=resultSet.getString("details") %>" /><br>
	</pre>
	</h3>
	
	<center><input type="submit" class="submit" value="UPDATE">
</form>
</div>
<%
}
con.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>