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
                                    <form role="form" method="POST" action="<c:url value='/mailing/edit' />">
	                                    <div class="form-group">
                                            <label>FROM EMAIL Address </label>
											<p class="form-control-static">${resultMap.FROMEMAIL}</p>
	                                    </div>
	                                    <div class="form-group">
                                            <label>TO EMAIL Address </label>
											<p class="form-control-static">${resultMap.TOEMAIL}</p>
	                                    </div>
	                                    <div class="form-group">
                                            <label>SUBJECT</label>
											<p class="form-control-static">${resultMap.SUBJECT}</p>
	                                    </div>
	                                    <div class="form-group">
                                            <label>MESSAGE</label>
											<pre class="form-control-static">${resultMap.MESSAGE}</pre>
	                                    </div>
                                        <button type="submit" class="btn btn-default">Mailing Button</button>
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
