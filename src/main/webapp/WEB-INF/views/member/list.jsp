<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <script>
    $(document).ready(function() {
        $("#layerModal").on("click",function(){
    		// fn_selectContentsPop();
    	});
    });

    var fn_selectContentsPop = function(){
		var url = "<c:url value='/member/edit?popupYN=Yes' />";
		common.layerPopup(url,"#myModal");
	};
    </script>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Advanced Tables
							<button id="layerModal" class="btn btn-primary btn-sm">
                            	Launch Demo Modal with Ajex and Titles
                            </button>
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
											<th><input type="checkbox" id="selecctall" /></th>
                                            <th>MEMBER_ID</th>
                                            <th>NAME</th>
                                            <th>CELLPHONE</th>
                                            <th>EMAIL</th>
                                            <th>Update</th>
                                            <th>Delete</th>
                                        </tr>
                                    </thead>
                                    <tbody>
										<c:forEach items="${resultList}" var="resultData" varStatus="loop">
	                                        <tr class="${(loop.index+1)%2 == 2 ? 'odd gradeX' : 'even gradeC'}">
												<td><input type="checkbox" class="checkbox" name="MEMBER_SEQ" value="${resultData.MEMBER_SEQ}" /></td>
												<td>
													<a href="<c:url value="/member/read?MEMBER_SEQ=${resultData.MEMBER_SEQ}" />">
													${resultData.MEMBER_ID}</a>
												</td>
												<td>${resultData.NAME}</td>
												<td>${resultData.CELLPHONE}</td>
												<td>${resultData.EMAIL}</td>
												<td>
													<a href="<c:url value="/member/update?MEMBER_SEQ=${resultData.MEMBER_SEQ}&forwardView=/member/edit" />">
													Update</a>
												</td>
												<td>
													<a href="<c:url value="/member/delete?MEMBER_SEQ=${resultData.MEMBER_SEQ}&forwardView=/member/list" />">
													Delete</a>
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
          	<form id=""></form>
	<!-- Modal -->        
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	</div>
	<!-- /.modal -->	    