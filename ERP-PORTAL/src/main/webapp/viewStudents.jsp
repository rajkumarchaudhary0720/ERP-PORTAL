<%@ page import="java.util.*,com.erp.dao.*,com.erp.model.*" %>

<html>
<body>

<h2>Student List</h2>

<table border="1">

    <tr>
        <th>Name</th>
        <th>Roll</th>
        <th>Course</th>
        <th>Year</th>
        <th>Semester</th>
    </tr>

    <%

        StudentDAO dao = new StudentDAO();

        List<Student> list = dao.getStudents();

        for(Student s : list){

    %>

    <tr>

        <td><%= s.getName() %></td>
        <td><%= s.getRoll() %></td>
        <td><%= s.getCourse() %></td>
        <td><%= s.getYear() %></td>
        <td><%= s.getSemester() %></td>

    </tr>

    <% } %>

</table>

</body>
</html>