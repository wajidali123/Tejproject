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
            <a href="index.htm">Add Employee</a>
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
                    <tr>
                        <td>${id}</td>
                        <td>${fname}</td>
                        <td>${lname}</td>
                        <td>${designation}</td>
                        <td>${pay}</td>
                        <td>${department}</td>
                        <td><a href="edit.htm?id=${id}">Update</a></td>
                        <td><a href="delete.htm?id=${id}">Delete</a></td>
                    </tr>
            </tbody>
        </table>
    </body>
</html>
