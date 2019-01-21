<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <script>
    $(document).ready(function() {
        $("#layerModal").on("click",function(){
    		fn_selectContentsPop();
    	});
    });

    var fn_selectContentsPop = function(){
		var url = "<c:url value='/commonCode/popup' />";
		common.layerPopup(url,"#myModal");
	};
    </script>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
					<input type="hidden" name="forwardView" value="/commonCode/list">                    
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Advanced Tables
							<button id="layerModal" class="btn btn-primary btn-sm">
                            	Launch Demo Modal with Ajax and Popup
                            </button>
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
											<th><input type="checkbox" id="selectall" /></th>
                                            <th>COMMON_CODE_ID</th>
                                            <th>NAME</th>
                                            <th>Update</th>
                                            <th>Parent List</th>
                                            <th>Child List</th>
                                        </tr>
                                    </thead>
                                    <tbody>
										<c:forEach items="${resultList}" var="resultData" varStatus="loop">
	                                        <tr class="${(loop.index+1)%2 == 2 ? 'odd gradeX' : 'even gradeC'}">
												<td><input type="checkbox" class="checkbox" name="COMMON_CODE_ID" value="${resultData.COMMON_CODE_ID}" /></td>
												<td>
													<a href="<c:url value="/commonCode/read?COMMON_CODE_ID=${resultData.COMMON_CODE_ID}" />">
													${resultData.COMMON_CODE_ID}</a>
												</td>
												<td>${resultData.NAME}</td>
												<td>
													<a href="<c:url value="/commonCode/update?COMMON_CODE_ID=${resultData.COMMON_CODE_ID}&forwardView=/commonCode/edit" />">
													Update</a>
												</td>
												<td>
													<a href="<c:url value="/commonCode/list?COMMON_CODE_ID=${resultData.PARENT_COMMON_CODE_ID}" />">
													Parent(${resultData.PARENT_COMMON_CODE_ID})</a>
												</td>
												<td>
													<a href="<c:url value="/commonCode/list?PARENT_COMMON_CODE_ID=${resultData.COMMON_CODE_ID}" />">
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
	</div>
	<!-- /.modal -->	    