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
playerDAO pd=new playerDAO();
List<Player> li=pd.getAllPlayers();
%>
<table>
<tr>
<th>Player Id</th>
<th>Team ID</th>
<th>Name</th>
<th>DOB</th>
<th>Email</th>
<th>Matches</th>
<th>Runs</th>
<th>Wickets</th>
<th>Achievements</th>
<th></th>
</tr>
<%
for(Player p:li){
%>
<tr>
<td><%= p.getPlayerId() %></td>
<td><%= p.getTeamId() %></td>
<td><%= p.getName() %></td>
<td><%= p.getDateOfBirth() %></td>
<td><%= p.getSkill() %></td>
<td><%= p.getNumberOfMatches() %></td>
<td><%= p.getRuns() %></td>
<td><%= p.getWickets() %></td>
<td><%= p.getNationality() %></td>
<td><a href="editplayer.jsp?id=<%=p.getPlayerId()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>