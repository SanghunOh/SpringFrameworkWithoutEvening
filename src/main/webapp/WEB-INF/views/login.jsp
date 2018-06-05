<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Bootstrap Core CSS -->
	<link type="text/css" href="<c:url value='/resources/css/bootstrap.min.css' />" rel="stylesheet" />

    <!-- MetisMenu CSS -->
	<link type="text/css" href="<c:url value='/resources/css/metisMenu.min.css' />" rel="stylesheet" />

    <!-- Custom CSS -->
	<link type="text/css" href="<c:url value='/resources/css/sb-admin-2.css' />" rel="stylesheet" />

    <!-- Custom Fonts -->
	<link type="text/css" href="<c:url value='/resources/css/font-awesome.css' />" rel="stylesheet" />

    <!-- jQuery -->
	<script type="text/javascript" src="<c:url value='/resources/js/jquery.min.js' />"></script>

    <!-- Bootstrap Core JavaScript -->
	<script type="text/javascript" src="<c:url value='/resources/js/bootstrap.min.js' />"></script>

    <!-- Metis Menu Plugin JavaScript -->
	<script type="text/javascript" src="<c:url value='/resources/js/metisMenu.min.js' />"></script>

    <!-- Custom Theme JavaScript -->
	<script type="text/javascript" src="<c:url value='/resources/js/sb-admin-2.js' />"></script>
	
<title>Edit</title>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Sign In</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="E-mail" name="email" type="email" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Password" name="password" type="password" value="">
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                    </label>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                <a href="<c:url value='/' />" class="btn btn-lg btn-success btn-block">Login</a>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>