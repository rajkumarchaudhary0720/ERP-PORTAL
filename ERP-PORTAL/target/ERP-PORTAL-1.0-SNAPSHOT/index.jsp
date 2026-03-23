<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>

    <title>Student ERP Portal</title>

    <style>

        body{
            font-family:Arial;
            background:#f4f4f4;
            text-align:center;
        }

        .container{
            margin-top:120px;
            background:white;
            width:400px;
            padding:30px;
            margin-left:auto;
            margin-right:auto;
            border-radius:10px;
            box-shadow:0px 3px 10px rgba(0,0,0,0.2);
        }

        h1{
            color:#333;
        }

        a{
            display:block;
            margin:15px;
            padding:12px;
            background:#007bff;
            color:white;
            text-decoration:none;
            border-radius:5px;
            font-size:16px;
        }

        a:hover{
            background:#0056b3;
        }

    </style>

</head>

<body>

<div class="container">

    <h1>Student ERP Portal</h1>

    <a href="addStudent.jsp">Add Student</a>

    <a href="viewStudents.jsp">View Students</a>

</div>

</body>
</html>