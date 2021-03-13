<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

      <%@ page import ="java.util.*,com.llts.serveletsdemo.model.*,com.ltts.serveletsdemo.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int tid=Integer.parseInt(request.getParameter("id"));
TeamDAO td=new TeamDAO();
Team t1=td.getTeamById(tid);
%>
<form action="./UpdateTeamServlet" method="post">
Teamid: <input type="text" value="<%= t1.getTeamId() %>" name="teamId"><br><br>
Teamname: <input type="text" value="<%= t1.getTeamName() %>" name="TeamName"><br><br>
Coachname: <input type="text" value="<%= t1.getCoachname() %>" name="Coachname"><br><br>
<input type="submit" value="Update Team">

</form>
</body>
</html>