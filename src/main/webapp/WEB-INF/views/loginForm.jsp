<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="page-wrapper">
     <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Sign In</h3>
                    </div>
                    <div class="panel-body">
                    	<fieldset>
                    		<c:if test="${not empty param.fail}">
								<font color="red"> Your login attempt was not successful, try again.<br /> Reason:
									${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}<br />
								</font>
								<br/>
							</c:if>
                    	</fieldset>
                        <form role="form" action="<c:url value='/j_spring_security_check' />" method='POST'>
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="member ID" name="email" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Password" name="password" type="password" value="">
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember-me" type="checkbox" value="true" checked>Remember Me
                                    </label>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                <input type="submit" class="btn btn-lg btn-success btn-block" value="Login" />
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
     </div>
     <!-- /.row -->
 </div>
 <!-- /#page-wrapper -->
