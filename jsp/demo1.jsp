<%@page import="java.lang.*,java.util.*,java.math.*"%>
<!doctype html>
<html>
<head>
<title>demo1</title>
<meta charset="UTF-8">
<style type="text/css">
body
{
background-color:green;
}
h3
{
background-color:cyan;
}
</style>
</head>
<body onLoad="greet()">
<h3>JSP EXAMPLE</h3>
<%
out.print("<font color=blue face=verdana size=10>"+"welcome to jsp"+"</font>"+"<br>");
Date D=new Date();
out.print("Today's Date="+D+"<br>");
out.print(Math.PI);
%>
</body>
<script type="text/javascript">
function greet()
{
name=prompt("Enter Your Name");
age=prompt("Enter Yout Age");
if(age<18)
{
alert("Tou Are Not Eligible!");
window.location="http://www.google.com");
}
else
{
alert(name+" "+"welcome To My Site");
}
}
</script>
</html>