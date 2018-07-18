<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
							<input type="hidden" name="${_csrf.parameterName}"value="${_csrf.token}" />                            
                                    <input type="hidden" name="PARENT_COMMON_CODE_ID" value="${resultMap.PARENT_COMMON_CODE_ID}">
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
										<a href="<c:url value='/commonCode/list?PARENT_COMMON_CODE_ID=${resultMap.PARENT_COMMON_CODE_ID}' />"> Forware Lis</a>
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
