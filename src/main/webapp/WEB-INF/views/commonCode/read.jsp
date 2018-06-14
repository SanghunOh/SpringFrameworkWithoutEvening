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

    <!-- Social Buttons CSS -->
	<link type="text/css" href="<c:url value='/resources/css/bootstrap-social.css' />" rel="stylesheet" />

    <!-- jQuery -->
	<script type="text/javascript" src="<c:url value='/resources/js/jquery.min.js' />"></script>

    <!-- Bootstrap Core JavaScript -->
	<script type="text/javascript" src="<c:url value='/resources/js/bootstrap.min.js' />"></script>

    <!-- Metis Menu Plugin JavaScript -->
	<script type="text/javascript" src="<c:url value='/resources/js/metisMenu.min.js' />"></script>

    <!-- Custom Theme JavaScript -->
	<script type="text/javascript" src="<c:url value='/resources/js/sb-admin-2.js' />"></script>
<title>Read</title>
</head>
<body>
    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="<c:url value='/' />">Clustering Incubation Center</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-sign-in fa-fw"></i> Single Mailing</a>
                        </li>
                        <li><a href="#"><i class="fa fa-random fa-fw"></i> Double Mailing</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-messages -->
                </li>
                <!-- /.dropdown -->

                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="<c:url value='/login' />"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li class="sidebar-search">
                            <div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="Search...">
                                <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                            </div>
                            <!-- /input-group -->
                        </li>
                        <li>
                            <a href="<c:url value='/' />"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-sitemap fa-fw"></i> Organization<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="<c:url value='/organization/list' />">Organization List</a>
                                </li>
                                <li>
                                    <a href="<c:url value='/organization/edit' />">Organization Edit</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-user fa-fw"></i> Member<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="<c:url value='/member?action=list' />">Member List</a>
                                </li>
                                <li>
                                    <a href="<c:url value='/member?action=edit' />">Member Edit</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-file-code-o fa-fw"></i> Common Code<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="<c:url value='/commonCode/list' />">Common Code List</a>
                                </li>
                                <li>
                                    <a href="<c:url value='/commonCode/edit' />">Common Code Edit</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-files-o fa-fw"></i> Multi Board<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="#">Board List</a>
                                </li>
                                <li>
                                    <a href="#">Board Edit</a>
                                </li>
                                <li>
                                    <a href="#">Board Manager <span class="fa arrow"></span></a>
                                    <ul class="nav nav-third-level">
                                        <li>
                                            <a href="#">Manager List</a>
                                        </li>
                                        <li>
                                            <a href="#">Manager Edit</a>
                                        </li>
                                    </ul>
                                    <!-- /.nav-third-level -->
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Read</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Form Elements
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form" method="POST" action="<c:url value='/commonCode/edit' />">
                                    <div class="form-group">
										<label>COMMON_CODE_ID Static Control</label>
										<p class="form-control-static">${resultMap.COMMON_CODE_ID}</p>
                                    </div>
	                                    <div class="form-group">
											<label>NAME Static Control</label>
											<p class="form-control-static">${resultMap.NAME}</p>
	                                    </div>
                                        <div class="form-group">
											<label>DESCRIPTION Static Control</label>
											<pre class="form-control-static">${resultMap.DESCRIPTION}</pre>
                                        </div>
                                        <button type="submit" class="btn btn-default">Add Button</button>
										<a href="<c:url value='/commonCode/edit' />">Add With a Tag</a>
                                    </form>
                                </div>
                                <!-- /.col-lg-6 (nested) -->
                                <div class="col-lg-6">
                                    <div class="form-group">
										<label>PARENT_COMMON_CODE_ID Static Control</label>
										<p class="form-control-static">${resultMap.PARENT_COMMON_CODE_ID}</p>
                                    </div>
                                    <div class="form-group">
										<label>ORDER_NUMBER Static Control</label>
										<p class="form-control-static">${resultMap.ORDER_NUMBER}</p>
                                    </div>
                                </div>
                                <!-- /.col-lg-6 (nested) -->
                            </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->
</body>
</html>