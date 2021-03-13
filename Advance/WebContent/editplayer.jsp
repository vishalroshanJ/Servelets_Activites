
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
<% int tid=Integer.parseInt(request.getParameter("id"));
playerDAO pd=new playerDAO();
Player p1=pd.getPlayerById(tid);
%>
<form action="./UpdatePlayerServlet" method="post">
Player PlayerId:<input type="text" value="<%= p1.getPlayerId() %>" name="Playerid"><br><br>
Player Name: <input type="text" value="<%= p1.getName() %>" name="Name"><br><br>
Player DateOfBirth: <input type="text" value="<%= p1.getDateOfBirth() %>" name="DateOfBirth"><br><br>
Player Skill: <input type="text" value="<%= p1.getSkill() %>" name="skill"><br><br>
Player Matches: <input type="text" value="<%= p1.getNumberOfMatches() %>" name="numberOfMatches"><br><br>
Player Runs: <input type="text" value="<%= p1.getRuns() %>" name="runs"><br><br>
Player Wickets: <input type="text" value="<%= p1.getWickets() %>" name="Wickets"><br><br>
Player Nationality: <input type="text" value="<%= p1.getNationality() %>" name="Nationality"><br><br>
Player PowerRating:<input type="text" value="<%= p1.getPowerRating() %>" name="powerRating"><br><br>
Player TeamId: <input type="text" value="<%= p1.getTeamId() %>" name="TeamId"><br><br>

<input type="submit" value="Update Player">

</form>
</body>
</html>