<%-- 
    Document   : Users
    Created on : 08-Mar-2018, 13:00:27
    Author     : wajid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="assets/css/bootstrap.min.cs" rel="stylesheet" type="text/css">
        <script src="assets/js/bootstrap.js" type="text/javascript"></script>
        <script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
    </head>
    <body>
        <hr>
        <div style="alignment-adjust: central">
            <div><a href="index.htm">Add Employee</a></div>
            <div><a href="search.htm">Search Employee</a></div>
        </div>
        <hr>
        <table class="table">
            <thead>
                <tr>
                    <th>#</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Designation</th>
                    <th>Salary</th>
                    <th>Department</th>
                    <th colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${employees}" var="employee">
                    <tr>
                        <td><c:out value="${employee.id}"></c:out></td>
                        <td><c:out value="${employee.fname}"></c:out></td>
                        <td><c:out value="${employee.lname}"></c:out></td>
                        <td><c:out value="${employee.designation}"></c:out></td>
                        <td><c:out value="${employee.pay}"></c:out></td>
                        <td><c:out value="${employee.department}"></c:out></td>
                        <td><a href="edit.htm?id=<c:out value="${employee.id}"></c:out>">Update</a></td>
                        <td><a href="delete.htm?id=<c:out value="${employee.id}"></c:out>">Delete</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
