<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<tiles:insertAttribute name="layout.header" />
<title><tiles:getAsString name="layout.title" /></title>
</head>
<body>
    <div id="wrapper">
       	<!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
			<tiles:insertAttribute name="layout.top" />
			<tiles:insertAttribute name="layout.left" />
	    <!-- /.navbar-static-side -->
        </nav>
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header"><tiles:getAsString name="layout.deeps" /></h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
			<tiles:insertAttribute name="layout.body" />
        </div>
        <!-- /#page-wrapper -->
    </div>
    <!-- /#wrapper -->	
</body>
</html>
