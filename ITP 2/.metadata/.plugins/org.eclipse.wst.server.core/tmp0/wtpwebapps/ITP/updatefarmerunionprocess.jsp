<%@page import="Utility.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>


<%




String id = request.getParameter("id");
String name = request.getParameter("name");
String noOfFarmers=request.getParameter("noOfFarmers");
String district=request.getParameter("district");
String province=request.getParameter("province");

if(id != null)
{
	DBConnection db = new DBConnection();
	Connection con = db.createConnection();
	

	


int personID = Integer.parseInt(id);
try
{

String sql="Update farmerunion set id=?,name=?,noOfFarmers=?,district=?,province =? where id="+id;

PreparedStatement ps = con.prepareStatement(sql);

ps.setString(1,id);
ps.setString(2, name);

ps.setString(3, noOfFarmers);
ps.setString(4, district);
ps.setString(5, province);

int i = ps.executeUpdate();
if(i > 0)
{
out.print("Record Updated Successfully");
}
else
{
out.print("There is a problem in updating Record.");
}
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}

}
%>