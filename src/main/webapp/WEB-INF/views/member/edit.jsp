<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <script>
	var fn_setFormTagCheckbox = function(url, id, params) {
		$.ajax({
	        type : "POST",
	        url : url,
	        data : params,
	        cache: false,
	        success : function(data) {

	        	var formTag = "";
		     	$.each(data, function(i,item){
					formTag += "<label class='checkbox-inline'>";
		     		formTag += '<input type=checkbox name="AUTHORITY_ID" value="'+item.AUTHORITY_ID+'">'+item.NAME;
			     	formTag += '</label> ';
		   		});
				$('#'+id).html(formTag);
				
		    },
	        error : function(xhr, status, exception){
	        	alert("Failure \n ("+status+")");
				return false;
	        }
	    });
	}

	var fn_setFormTagSelect = function(url, id, params) {
		$.ajax({
	        type : "POST",
	        url : url,
	        data : params,
	        cache: false,
	        success : function(data) {

	        	var formTag = "";
				formTag += "<select class='form-control' name='ORGANIZATION_SEQ'>";
		     	$.each(data, function(i,item){
		     		formTag += '<option value="'+item.ORGANIZATION_SEQ+'">'+item.NAME;
		   		});
		     	formTag += '</select> ';
				$('#'+id).html(formTag);
				
		    },
	        error : function(xhr, status, exception){
	        	alert("Failure \n ("+status+")");
				return false;
	        }
	    });
	}
	
	$(document).ready(function() {
       // show Authorities with Ajax
       //fn_setFormTagCheckbox("<c:url value='/ws/authorityList' />", "authorityDIV");
       fn_setFormTagSelect("<c:url value='/ws/organizationList' />", "organizationDIV");
    });
    </script>
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
                                    <form id="" role="form" method="POST" action="<c:url value='/member/merge' />" >
	                                    <input type="hidden" name="forwardView" value="/member/read" />
	                                    <input type="hidden" name="MEMBER_SEQ" value="${resultMap.MEMBER_SEQ }" />
                                        <div class="form-group">
                                            <label>MEMBER_ID Text Input </label>
                                            <input class="form-control" type="text" name="MEMBER_ID" value="${resultMap.MEMBER_ID }">
                                        </div>
                                        <div class="form-group">
                                            <label>Member PASSWORD Text Input </label>
                                            <input class="form-control" type="password" name="PASSWORD" value="${resultMap.PASSWORD }">
                                        </div>
                                        <div class="form-group">
                                            <label>Member Name Text Input </label>
                                            <input class="form-control" type="text" name="NAME" value="${resultMap.NAME }">
                                        </div>
                                        <div class="form-group">
                                            <label> Organization Selects </label>
                                            <div id=organizationDIV></div>
                                        </div>
                                        <div class="form-group">
                                            <label> Authority Inline Checkboxes </label>
                                            <div id=authorityDIV></div>
                                        </div>
                                        <div class="form-group">
                                            <label>EMAIL Text Input with Placeholder </label>
                                            <input class="form-control" type="text" name="EMAIL" placeholder="incubator@clustringincubation.com" value="${resultMap.EMAIL }">
                                            <p class="help-block">Base form incubator@clustringincubation.com</p>
                                        </div>
                                        <div class="form-group">
                                            <label>CELLPHONE Text Input with Placeholder </label>
                                            <input class="form-control" type="text" name="CELLPHONE" placeholder="000-0000-0000" value="${resultMap.CELLPHONE }">
                                            <p class="help-block">Base form 000-0000-0000</p>
                                        </div>
										<div class="form-group">
                                            <label>Image File input</label>
                                            <input type="file" name="ATTACHEDFILES" />
                                            <input type="file" name="ATTACHEDFILES02" />
                                        </div>	                                    
                                        <button type="submit" class="btn btn-default">${paramMap.action == 'update' ? 'Update' : 'Insert' } Button</button>
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
