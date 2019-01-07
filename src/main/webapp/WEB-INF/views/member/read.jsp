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
                                    <form role="form" method="POST" action="<c:url value='/member/edit' />">
	                                    <div class="form-group">
											<label>MEMBER_ID Static Control</label>
											<p class="form-control-static">${resultMap.MEMBER_ID}</p>
	                                    </div>
	                                    <div class="form-group">
											<label>PASSWORD Static Control</label>
											<p class="form-control-static">${resultMap.PASSWORD}</p>
	                                    </div>
	                                    <div class="form-group">
											<label>NAME Static Control</label>
											<p class="form-control-static">${resultMap.NAME}</p>
	                                    </div>
	                                    <div class="form-group">
											<label>Organization</label>
											<p class="form-control-static">${resultMap.ORGANIZATION_NAME}</p>
	                                    </div>
	                                    <div class="form-group">
											<label>Authorities</label>
											<p class="form-control-static">
												<c:forEach items="${resultMap.authorityList}" var="resultData" varStatus="loop">
													${resultData.AUTHORITY_NAME}
												</c:forEach>
											</p>
	                                    </div>
	                                    <div class="form-group">
											<label>EMAIL Static Control</label>
											<p class="form-control-static">${resultMap.EMAIL}</p>
	                                    </div>
	                                    <div class="form-group">
											<label>CELLPHONE Static Control</label>
											<p class="form-control-static">${resultMap.CELLPHONE}</p>
	                                    </div>
	                                    <div class="form-group">
                                            <label>Image File input</label>
											<p class="form-control-static">
												<c:forEach items="${resultMap.attachFileList}" var="resultData" varStatus="loop">
													${resultData.ORGINALFILE_NAME}
												</c:forEach>
											</p>
	                                    </div>
                                        <button type="submit" class="btn btn-default">Add Button</button>
										<a href="<c:url value='/member/list' />">list</a>
                                    </form>
                                </div>
                                <!-- /.col-lg-6 (nested) -->
                                <div class="col-lg-6">
                                    <div class="form-group">
										<label>MEMBER_SEQ Static Control</label>
										<p class="form-control-static">${resultMap.MEMBER_SEQ}</p>
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
