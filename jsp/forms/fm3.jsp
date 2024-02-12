<html>
<head>
<title>Reading Checkbox Data</title>
</head>
<body>
<center>
<h1>Reading Checkbox Data</h1>
<ul>
<li><p><b>Maths Flag:</b><%= request.getParameter("maths")%></p></li>
<li><p><b>Physics Flag:</b><%= request.getParameter("physics")%></p></li>
<li><p><b>Chemistry Flag:</b><%= request.getParameter("chemistry")%></p></li>
</ul>
</body>
</html>
