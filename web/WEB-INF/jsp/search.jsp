<%-- 
    Document   : search
    Created on : 05-Oct-2018, 07:12:03
    Author     : wajid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <form class="form-light mt-20" role="form" action="searchResult.htm" method="GET">
                        
                           <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Enter ID</label>
                                    <input type="text" id="id" name="id" class="form-control" placeholder="Enter your ID to search record">
                                    </div>
                            </div>
                            </div>
                            <button type="submit" name="submit" class="btn btn-two">Search</button><p><br/></p>
           </form>
    </body>
</html>
