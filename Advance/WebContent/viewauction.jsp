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
AuctionDAO ad=new AuctionDAO();
List<Auction> li=ad.getAllAuctions();
%>
<table>
<tr>
<th>Auctionid</th>
<th>Playerid</th>
<th>Teamid</th>
<th>year</th>
<th>amount</th>

<th></th>
</tr>
<%
for(Auction a:li){
%>
<tr>
<td><%= a.getAuctionid() %></td>
<td><%= a.getPlayerid() %></td>
<td><%= a.getTeamid() %></td>
<td><%= a.getYear() %></td>
<td><%= a.getAmmount() %></td>

<td><a href="editauction.jsp?id=<%=a.getAuctionid()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>