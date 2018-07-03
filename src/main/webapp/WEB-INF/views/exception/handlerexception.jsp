<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <!-- /.row -->
     <c:set var="message" value="${errorMessageMap}"></c:set>
     <div class="row">
         <div class="col-lg-12">
             <div class="panel panel-default">
                 <div class="panel-heading">
                     ${message.errorTitle }
                 </div>
                 <div class="panel-body">
                     <div class="row">
                         <div class="col-lg-12">
                         	<h3>${message.errorMessage}</h3>
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
