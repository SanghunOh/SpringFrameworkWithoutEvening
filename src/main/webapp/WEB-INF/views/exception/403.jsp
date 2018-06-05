<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <!-- /.row -->
     <div class="row">
         <div class="col-lg-12">
             <div class="panel panel-default">
                 <div class="panel-heading">
                     ${errorMessageMap.errorTitle }
                 </div>
                 <div class="panel-body">
                     <div class="row">
                         <div class="col-lg-12">
                         	<h3>${errorMessageMap.errorMessage}</h3>
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
