<% 
String clrs[] = request.getParameterValues("fruit");
if(clrs != null)
{
%>
<p><b>You have selected the following fruits</b></p>
<ul>
<%
for(int i=0; i<clrs.length; i++)
{
%>
<li><%=clrs[i]%></li>
<%
}
%>
</ul>
<%
}
%>
