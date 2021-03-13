<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import ="java.util.*,java.sql.*,com.llts.serveletsdemo.model.*,com.ltts.serveletsdemo.dao.*,com.ltts.serveletsdemo.configure.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int aid=Integer.parseInt(request.getParameter("id"));
AuctionDAO ad=new AuctionDAO();
Auction a1=ad.getAuctionById(aid);
%>
<form action="./UpdateAuctionServlet" method="post">
Auctionid: <input type="text" value="<%= a1.getAuctionid() %>" name="Auctionid"><br><br>
Playerid: <input type="text" value="<%= a1.getPlayerid() %>" name="Playerid"><br><br>
Teamid: <input type="text" value="<%= a1.getTeamid() %>" name="Teamid"><br><br>
Year: <input type="text" value="<%= a1.getYear() %>" name="year"><br><br>
Amount: <input type="text" value="<%= a1.getAmmount() %>" name="ammount"><br><br>

<input type="submit" value="Update Auction">

</form>
</body>
</html>