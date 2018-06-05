<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <script>
    $(document).ready(function() {
        $("#layerModal").click(function(){
           // $("#myModal").modal();
        });
    });
    </script>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Advanced Tables
							<button id="layerModal" class="btn btn-primary btn-sm">
                            	Launch Demo Modal with jQuery
                            </button>
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
											<th><input type="checkbox" id="selecctall" /></th>
                                            <th>ORGANIZATION_SEQ</th>
                                            <th>NAME</th>
                                            <th>TELEPHONE</th>
                                            <th>ORDER_NUMBER</th>
                                            <th>Update</th>
                                            <th>Parent List</th>
                                            <th>Child List</th>
                                        </tr>
                                    </thead>
                                    <tbody>
										<c:forEach items="${resultList}" var="resultData" varStatus="loop">
	                                        <tr class="${(loop.index+1)%2 == 2 ? 'odd gradeX' : 'even gradeC'}">
												<td><input type="checkbox" class="checkbox" name="ORGANIZATION_SEQ" value="${resultData.ORGANIZATION_SEQ}" /></td>
												<td>
													<a href="<c:url value="/organization/read?ORGANIZATION_SEQ=${resultData.ORGANIZATION_SEQ}" />">
													${resultData.ORGANIZATION_SEQ}</a>
												</td>
												<td>${resultData.NAME}</td>
												<td>${resultData.TELEPHONE}</td>
												<td>${resultData.ORDER_NUMBER}</td>
												<td>
													<a href="<c:url value="/organization/update?ORGANIZATION_SEQ=${resultData.ORGANIZATION_SEQ}&forwardView=/organization/edit" />">
													Update</a>
												</td>
												<td>
													<a href="<c:url value="/organization/list?ORGANIZATION_SEQ=${resultData.PARENT_ORGANIZATION_SEQ}" />">
													Parent(${resultData.PARENT_ORGANIZATION_SEQ})</a>
												</td>
												<td>
													<a href="<c:url value="/organization/list?PARENT_ORGANIZATION_SEQ=${resultData.ORGANIZATION_SEQ}" />">
													Child (${resultData.NAME})</a>
												</td>
	                                        </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
	<!-- Modal -->        
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
	                <h4 class="modal-title" id="myModalLabel">Modal title</h4>
	            </div>
	            <div class="modal-body">
	                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
	            </div>
	            <div class="modal-footer">
	                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
	                <button type="button" class="btn btn-primary">Save changes</button>
	            </div>
	        </div>
	        <!-- /.modal-content -->
	    </div>
	    <!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->