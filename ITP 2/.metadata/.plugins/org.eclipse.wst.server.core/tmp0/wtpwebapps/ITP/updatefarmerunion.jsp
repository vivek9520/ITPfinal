<%@page import="Utility.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
<body>
<h1>FARMER UNION</h1>

<form method="post" action="updatefarmerunionprocess.jsp">
<h3><%

int id2 = Integer.parseInt(request.getParameter("username"));
DBConnection db = new DBConnection();
Connection con = db.createConnection();
Statement statement = con.createStatement();
ResultSet resultSet = null;
%>
<%
try{

String sql ="select * from farmerunion where id='"+id2+"'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
	ID: <input type="text" name="id" value="<%=resultSet.getString("id") %>" /></br></br>
	Name : <input type="text" name="name" value="<%=resultSet.getString("name") %>" /></br></br>
	No Of Farmers : <input type="text" name="noOfFarmers" value="<%=resultSet.getString("noOfFarmers") %>" /></br></br>
	District: <input type="text" name="district" min="1" max="500" value="<%=resultSet.getString("district") %>" ></br></br>
	Province : <input type="text" name="province" value="<%=resultSet.getString("province") %>" /></br>


	


<%
}
con.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
<center><input type="submit" class="submit" value="UPDATE">
</form>
</body>
</html>