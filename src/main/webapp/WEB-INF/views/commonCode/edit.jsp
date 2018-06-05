<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Edit</h1>
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
                                <div class="col-lg-12">
                                    <form role="form" method="POST" action="<c:url value='/commonCode/merge' />">
                                        <input type="hidden" name="forwardView" value="/commonCode/read">
                                        <input type="hidden" name="ATTRIBUTION_1" value="">
                                        <input type="hidden" name="ATTRIBUTION_2" value="">
                                        <input type="hidden" name="SYSTEM_CODE_YN" value="System_Code_No">
                                        <input type="hidden" name="USE_YN" value="Yes">
                                        <div class="form-group">
                                            <label>Common ID Name Text Input </label>
                                            <input class="form-control" type="text" name="COMMON_CODE_ID" value="${resultMap.COMMON_CODE_ID }">
                                        </div>
                                        <div class="form-group">
                                            <label>Common Code Name Text Input </label>
                                            <input class="form-control" type="text" name="NAME" value="${resultMap.NAME }">
                                        </div>
                                        <div class="form-group">
										    <label for="disabledSelect">ORDER_NUMBER Disabled input </label>
										    <input class="form-control" type="text" name="ORDER_NUMBER" placeholder="1"  value="${resultMap.ORDER_NUMBER }">
                                        </div>
                                        <div class="form-group">
                                            <label>DESCRIPTION Text area</label>
                                            <textarea class="form-control" rows="3" name="DESCRIPTION" placeholder="Describe yourself here...">${resultMap.DESCRIPTION }</textarea>
                                        </div>
                                        <div class="form-group">
										    <label for="disabledSelect">PARENT_COMMON_CODE_ID Disabled input </label>
										    <input class="form-control" type="text" name="PARENT_COMMON_CODE_ID" value="${paramMap.PARENT_COMMON_CODE_ID }" readonly>
                                            <p class="help-block">using Parent UUID method with disabled</p>
                                        </div>
                                        <button type="submit" class="btn btn-default">${paramMap.action == 'update' ? 'Update' : 'Insert' } Button</button>
                                        <button type="reset" class="btn btn-default">Reset Button</button>
                                    </form>
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
