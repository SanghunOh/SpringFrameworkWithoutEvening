<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <script src="//cdn.ckeditor.com/4.5.9/standard/ckeditor.js"></script>
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
                                    <form id="" role="form" method="POST" action="<c:url value='/mailing/sending' />">
	                                    <input type="hidden" name="forwardView" value="/mailing/read" />
                                        <div class="form-group">
                                            <label>FROM EMAIL Address </label>
											<div class="form-group input-group">
                                            	<span class="input-group-addon">@</span>
                                            <input type="text" class="form-control" placeholder="Username" name="FROMEMAIL">
                                        	</div>                                        
                                            <label>TO EMAIL Address </label>
											<div class="form-group input-group">
                                            	<span class="input-group-addon">@</span>
                                            <input type="text" class="form-control" placeholder="Username" name="TOEMAIL">
                                        	</div>                                        
                                        </div>
                                        <div class="form-group">
                                            <label>SUBJECT</label>
                                            <input class="form-control" type="text" name="SUBJECT">
                                        </div>
                                        <div class="form-group">
                                            <label>MESSAGE</label>
											<textarea class="form-control" rows="3" name="MESSAGE" placeholder="Describe yourself here..."></textarea>                                        
											 <script>
											     CKEDITOR.replace( 'MESSAGE' );
											 </script>
										</div>
                                        <button type="submit" class="btn btn-default">Mailing Button</button>
                                        <button type="reset" class="btn btn-default">Reset Button</button>
                                    </form>
                                </div>
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
