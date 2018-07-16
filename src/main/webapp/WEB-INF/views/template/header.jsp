<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!-- Bootstrap Core CSS -->
	<link type="text/css" href="<c:url value='/resources/css/bootstrap.min.css' />" rel="stylesheet" />

    <!-- MetisMenu CSS -->
	<link type="text/css" href="<c:url value='/resources/css/metisMenu.min.css' />" rel="stylesheet" />

    <!-- Custom CSS -->
	<link type="text/css" href="<c:url value='/resources/css/sb-admin-2.css' />" rel="stylesheet" />

    <!-- Custom Fonts -->
	<link type="text/css" href="<c:url value='/resources/css/font-awesome.css' />" rel="stylesheet" />

    <!-- Timeline CSS -->
    <link href="<c:url value='/resources/css/timeline.css' />" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <%-- <link href="<c:url value='/resources/css/morris.css' />" rel="stylesheet"> --%>

    <!-- DataTables CSS -->
	<link type="text/css" href="<c:url value='/resources/css/dataTables.bootstrap.css' />" rel="stylesheet" />

    <!-- jQuery -->
	<script type="text/javascript" src="<c:url value='/resources/js/jquery.min.js' />"></script>

    <!-- jQuery UI-->
	<%-- <script type="text/javascript" src="<c:url value='/resources/js/jquery-ui.js' />"></script> --%>

    <!-- Bootstrap Core JavaScript -->
	<script type="text/javascript" src="<c:url value='/resources/js/bootstrap.min.js' />"></script>

    <!-- Metis Menu Plugin JavaScript -->
	<script type="text/javascript" src="<c:url value='/resources/js/metisMenu.min.js' />"></script>

    <!-- Custom Theme JavaScript -->
	<script type="text/javascript" src="<c:url value='/resources/js/sb-admin-2.js' />"></script>

    <!-- common JavaScript -->
	<%-- <script type="text/javascript" src="<c:url value='/resources/js/common.js' />"></script> --%>

    <!-- DataTables JavaScript -->
	<script type="text/javascript" src="<c:url value='/resources/js/jquery.dataTables.min.js' />"></script>
	<script type="text/javascript" src="<c:url value='/resources/js/dataTables.bootstrap.min.js' />"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
                responsive: true
        });

        $("#selecctall").change(function() {
			$(".checkbox").prop('checked', $(this).prop("checked"));
		});

    });
    </script>
    