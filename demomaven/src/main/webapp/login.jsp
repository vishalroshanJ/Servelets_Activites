
<%@ page import="java.sql.*"%>
<%
    String userName = request.getParameter("user");   
    String password = request.getParameter("pass");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo",
            "root", "root");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from loginn where userName='" + userName + "' and password='" +password + "'");
    if (rs.next()) {
        session.setAttribute("userid", userName);
        response.sendRedirect("index.html");
    } else {
        out.println("Invalid password <a href='index.jsp'>try again</a>");
    }
%>