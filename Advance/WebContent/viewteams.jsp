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
TeamDAO td=new TeamDAO();
List<Team> li=td.getAllTeams();
%>
<table>
<tr>
<th>Teamid</th>
<th>Teamname</th>
<th>Coachname</th>

<th></th>
</tr>
<%
for(Team t:li){
%>
<tr>
<td><%= t.getTeamId() %></td>
<td><%= t.getTeamName() %></td>
<td><%= t.getCoachname() %></td>

<td><a href="editteam.jsp?id=<%=t.getTeamId()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>