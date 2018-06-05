<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
	                <h4 class="modal-title" id="myModalLabel"><tiles:getAsString name="layout.title" /></h4>
	            </div>
	            <div class="modal-body">
					<tiles:insertAttribute name="layout.body" />
	            </div>
	        </div>
	        <!-- /.modal-content -->
	    </div>
	    <!-- /.modal-dialog -->
