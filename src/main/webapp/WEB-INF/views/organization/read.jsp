<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
                                    <form role="form" method="POST" action="<c:url value='/organization/edit' />">
                                    <input type="hidden" name="PARENT_ORGANIZATION_SEQ" value="${resultMap.PARENT_ORGANIZATION_SEQ}">
	                                    <div class="form-group">
											<label>NAME Static Control</label>
											<p class="form-control-static">${resultMap.NAME}</p>
	                                    </div>
                                        <div class="form-group">
											<label>TELEPHONE Static Control</label>
											<p class="form-control-static">${resultMap.TELEPHONE}</p>
                                        </div>
                                        <button type="submit" class="btn btn-default">Add Button</button>
										<a href="<c:url value='/organization/list?PARENT_ORGANIZATION_SEQ=${resultMap.PARENT_ORGANIZATION_SEQ}' />"> Forware Lis</a>
                                    </form>
                                </div>
                                <!-- /.col-lg-6 (nested) -->
                                <div class="col-lg-6">
                                    <div class="form-group">
										<label>ORGANIZATION_SEQ Static Control</label>
										<p class="form-control-static">${resultMap.ORGANIZATION_SEQ}</p>
                                    </div>
                                    <div class="form-group">
										<label>PARENT_ORGANIZATION_SEQ Static Control</label>
										<p class="form-control-static">${resultMap.PARENT_ORGANIZATION_SEQ}</p>
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
