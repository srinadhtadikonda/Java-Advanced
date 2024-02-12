<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<HTML>
    <HEAD>
        <TITLE>Submitting Text Areas</TITLE>
    </HEAD>
 
    <BODY>
        <H1>Submitting Text Areas</H1>
        <FORM ACTION="/myjsp/ta.jsp" METHOD="POST">
            Please enter your text:
            <BR>
            <TEXTAREA NAME="textarea1" ROWS="5"></TEXTAREA>
            <BR>
            <INPUT TYPE="SUBMIT" VALUE="Submit">
        </FORM>
    </BODY>
<HTML>
      
 <%
 request.setCharacterEncoding("UTF-8");
 String content = request.getParameter("textarea1");
out.println(content);
%>