 <%@page import="Utility.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Cost view</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
body {
  font-family: Arial;
}

* {
  box-sizing: border-box;
}

form.example input[type=text] {
  padding: 10px;
  font-size: 17px;
  border: 1px solid grey;
  float: left;
  width: 80%;
  background: #f1f1f1;
}

form.example button {
  float: left;
  width: 20%;
  padding: 10px;
  background: #2196F3;
  color: white;
  font-size: 17px;
  border: 1px solid grey;
  border-left: none;
  cursor: pointer;
}

form.example button:hover {
  background: #0b7dda;
}

form.example::after {
  content: "";
  clear: both;
  display: table;
}
</style>
    

</head>
<body background="img/bg-cost.jpg">

<br>
<br>
<br>
<div class="container"> 
  <div class="canvas_div_pdf">
	<button id="cmd" onClick="getPDF()" class="btn btn-primary active">generate PDF</button>
  
<div class="container" style="background-color: white">

  <h2 class="text-center">Province</h2><br>
    
    <br>
    <br>
    <%
	String id = request.getParameter("userId");
	DBConnection db = new DBConnection();

	Connection con = db.createConnection();
	Statement statement = con.createStatement();
	ResultSet resultSet = null;
%>
    
          
  <table class="table table-hover table-info">
    <thead>
      <tr>
       
        <th>Cost ID</th>
        <th>Province</th>
        <th>Product</th>
   
        <th>Amount</th>
      </tr>
    </thead>
   
    
 <%
try{ 

String a = request.getParameter("search");
String sql ="SELECT *FROM costguide where province='"+a+"'";

resultSet = statement.executeQuery(sql);
 
while(resultSet.next()){
	
	%>
      <tr>
        <td><%=resultSet.getString("Cid") %>  </td>
        <td> <%=resultSet.getString("province") %> </td>
        <td> <%=resultSet.getString("product") %>  </td>
        
        <td> <%=resultSet.getString("cost") %> </td>
     </tr>   
        
     
 
  <% 
 
 
 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
    </tbody>
  </table>
    <br>
</div>
    <br><br>
</div>    

	<script>
	
	function getPDF(){
		 
		var HTML_Width = $(".canvas_div_pdf").width();
		var HTML_Height = $(".canvas_div_pdf").height();
		var top_left_margin = 15;
		var PDF_Width = HTML_Width+(top_left_margin*2);
		var PDF_Height = (PDF_Width*1.5)+(top_left_margin*2);
		var canvas_image_width = HTML_Width;
		var canvas_image_height = HTML_Height;
		
		var totalPDFPages = Math.ceil(HTML_Height/PDF_Height)-1;
		
		$(document).ready(function(){
		    $("#cmd").hide();
		});

		html2canvas($(".canvas_div_pdf")[0],{allowTaint:true}).then(function(canvas) {
			canvas.getContext('2d');
			
			console.log(canvas.height+"  "+canvas.width);
			
			
			var imgData = canvas.toDataURL("image/jpeg", 1.0);
			var pdf = new jsPDF('p', 'pt',  [PDF_Width, PDF_Height]);
		    pdf.addImage(imgData, 'JPG', top_left_margin, top_left_margin,canvas_image_width,canvas_image_height);
			
			
			for (var i = 1; i <= totalPDFPages; i++) { 
				pdf.addPage(PDF_Width, PDF_Height);
				pdf.addImage(imgData, 'JPG', top_left_margin, -(PDF_Height*i)+(top_left_margin*4),canvas_image_width,canvas_image_height);
			}
			
		    pdf.save("ProvienceSummary.pdf");
	    });
		
		$(document).ready(function(){
		    $("#cmd").showq1();
		});
	};
	
	</script>    
	
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.3/jspdf.min.js"></script>
	<script src="https://html2canvas.hertzen.com/dist/html2canvas.js"></script>

</body>
</html>