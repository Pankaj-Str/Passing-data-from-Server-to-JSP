<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="p4n.Student"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

      <table class="table table-bordered border-primary container">
      <h1 class="text-center">Displaying Student List</h1>
         <tr bgcolor="black" style="color:#ffffff";>
          <th><b>Student Name</b></th>
          <th><b>Student Age</b></th>
          <th><b>Course Undertaken</b></th>
         </tr>
        <%-- Fetching the attributes of the request object
             which was previously set by the servlet 
              "StudentServlet.java"
        --%> 
        <%ArrayList<Student> std = 
            (ArrayList<Student>)request.getAttribute("data");
        for(Student s:std){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=s.getName()%></td>
                <td><%=s.getAge()%></td>
                <td><%=s.getCrs()%></td>
            </tr>
            <%}%>
        </table> 
        <hr/>
    </body>
</body>
</html>