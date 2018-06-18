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
                                <div class="col-lg-12">
                                    <form role="form" method="POST" action="<c:url value='/organization/merge' />" enctype="multipart/form-data">
                                    <!-- form role="form" method="POST" action="<c:url value='/sample_organization/file' />" -->
                                        <input type="hidden" name="forwardView" value="/organization/read">
                                        <input type="hidden" name="ORGANIZATION_SEQ" value="${resultMap.ORGANIZATION_SEQ }" >
                                        <div class="form-group">
                                            <label>Organization Name Text Input </label>
                                            <input class="form-control" type="text" name="NAME" value="${resultMap.NAME }">
                                        </div>
                                        <div class="form-group">
                                            <label>TELEPHONE Text Input with Placeholder </label>
                                            <input class="form-control" type="text" name="TELEPHONE" placeholder="000) 00-0000-0000" value="${resultMap.TELEPHONE }">
                                            <p class="help-block">Base form 000) 00-0000-0000</p>
                                        </div>
                                        <div class="form-group">
										    <label for="disabledSelect">ORDER_NUMBER Disabled input </label>
										    <input class="form-control" type="text" name="ORDER_NUMBER" placeholder="1"  value="${resultMap.ORDER_NUMBER }">
                                        </div>
                                        <div class="form-group">
										    <label for="disabledSelect">PARENT_ORGANIZATION_SEQ Disabled input </label>
										    <input class="form-control" type="text" name="PARENT_ORGANIZATION_SEQ" value="${resultMap.PARENT_ORGANIZATION_SEQ }" readonly>
                                            <p class="help-block">using Parent UUID method with disabled</p>
                                        </div>
										<div class="form-group">
                                            <label>Image File input</label>
                                            <input type="file" name="ATTACHEDFILES" />
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
