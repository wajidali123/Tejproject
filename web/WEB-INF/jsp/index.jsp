<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

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
        <div>
            
            <div class="container">
                <hr>
                    <div><a href="Employees.htm">Employees List</a></div>
                    <div><a href="search.htm">Search Employee</a></div>
                <hr>
                <div><h4>Employee Registration Form</h4></div>
                <hr>
            <div class="row">
                <div class="col-md-8">
                    <form:form class="form-light mt-20" role="form" modelAttribute="emp" method="POST">
<!--                        <div class="form-group">
                            <label>ID</label>
                            <input type="text" id="id" name="id" class="form-control" placeholder="Enter Your ID">
                        </div>-->
                        
                           <div class="form-group">
                                    <label>First Name</label>
                                    <input type="text" id="fname" name="fname" class="form-control" placeholder="Enter your first Name">
                            </div>
                           <div class="form-group">
                                    <label>Last Name</label>
                                    <input type="text" id="lname" name="lname" class="form-control" placeholder="Enter your Last Name ">
                            </div>
                        
<!--                        <div class="form-group">
                            <label>Date Of Birth</label>
                            <input type="date" id="dateofbirth" name="dateofbirth" class="form-control">
                        </div>-->
                        <div class="form-group">
                            <label>Designation</label>
                            <input type="text" class="form-control" id="designation" name="designation" placeholder="Enter your major here">
                        </div>
                        <div class="form-group">
                            <label>Salary</label>
                            <input type="text" class="form-control" id="pay" name="pay" placeholder="Enter your major here">
                        </div>
                        <div class="form-group">
                            <label>Department</label>
                            <input type="text" class="form-control" id="department" name="department" placeholder="Enter your major here">
                        </div>
                        <button type="submit" name="submit" class="btn btn-two">Save Records</button><p><br/></p>
                    </form:form>
                </div>
               
            </div>
        </div>
        </div>
        
    </body>
    
</html>
