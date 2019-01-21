<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <script>
    $(document).ready(function() {
        $("#layerModal").on("click",function(){
    		fn_selectContentsPop();
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
											<th><input type="checkbox" id="selectall" /></th>
                                            <th>MEMBER_ID</th>
                                            <th>NAME</th>
                                            <th>CELLPHONE</th>
                                            <th>EMAIL</th>
                                            <th>Update</th>
                                            <th>Delete</th>
                                        </tr>
                                    </thead>
                                    <tbody>
										<c:forEach items="${resultMap.resultList}" var="resultData" varStatus="loop">
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
													<a href="<c:url value="/member/delete?MEMBER_SEQ=${resultData.MEMBER_SEQ}&forwardView=/member/list_pagination" />">
													Delete</a>
												</td>
	                                        </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
					<div class="row">
						<c:set var="page" value="${resultMap.pagination}" /> 
						<div class="col-sm-6">
							<div class="dataTables_info" id="dataTables-example_info" role="status" aria-live="polite">
								Showing ${page.pageBegin} to ${page.pageEnd} of ${page.totalCount} entries
							</div>
						</div>
						<div class="col-sm-6">
							<div class="dataTables_paginate paging_simple_numbers"
								id="dataTables-example_paginate">
								<ul class="pagination">
<%-- <c:if test="${page.currentPage>1 }">
<a href="<c:url value="/member/list_pagination?currentPage=1&search_option=${search_option}&search=${search}" />">Begin</a>
</c:if> --%>
									<%-- <c:if test="${page.currentBlock > 1 }"> --%>
									<li class="paginate_button previousious"
										aria-controls="dataTables-example" tabindex="0" id="dataTables-example_previousious">
										<a href="<c:url value="/member/list_pagination?currentPage=${page.previousPage}" />">Previous</a>
									</li>
									<%-- </c:if> --%>
									<c:forEach var="pageNum" begin="${page.blockStart}" end="${page.blockEnd}">
											<c:choose>
											    <c:when test="${pageNum==page.currentPage }">
													<li class="paginate_button active" aria-controls="dataTables-example" tabindex="0">
														<a href="#">${pageNum}</a>
													</li>
											    </c:when>
											    <c:otherwise>
													<li class="paginate_button" aria-controls="dataTables-example" tabindex="0">
														<a href="<c:url value="/member/list_pagination?currentPage=${pageNum}" />">${pageNum}</a>
													</li>
											    </c:otherwise>
											</c:choose>
									</c:forEach>
									<%-- <c:if test="${page.currentBlock <= page.totalBlock}"> --%>
									<!-- <li class="paginate_button next disabled" -->
									<li class="paginate_button next"	
										aria-controls="dataTables-example" tabindex="0" id="dataTables-example_next">
										<a href="<c:url value="/member/list_pagination?currentPage=${page.nextPage}" />">Next</a>
									</li>
									<%-- </c:if> --%>
<%-- <c:if test="${page.currentPage < page.totalPage}">
<a href="<c:url value="/member/list_pagination?currentPage=${page.totalPage}&search_option=${search_option}&search=${search}" />">End</a>
</c:if> --%>
								</ul>
							</div>
						</div>
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