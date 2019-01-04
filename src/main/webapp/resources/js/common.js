var common = new Object();
/*
 * ################# CONSTANTS ####################
 */

/*
 * common
 */

common.CONTEXT_PATH = '';
/*
 * for ajax form
 */
common.SUCCESS_FLAG = 'SUCCESS_FLAG';
common.URL_FOR_REDIRECT = 'URL_FOR_REDIRECT';
common.MSG_FOR_ALERT = 'MSG_FOR_ALERT';

/**
 * 공통 레이어 팝업
 */
common.layerPopup = function(url, id){
	$.ajax({
        type : "POST",
        url : url,
        cache: false,
        success : function(data) {
        	common.popupCallback(data, id);
	    },
        error : function(xhr, status, exception){
        	alert("전송에 실패하였습니다. \n ("+status+")");
			return false;
        }
    });
};

common.layerPopupParam = function(url, id, params){
	$.ajax({
        type : "POST",
        url : url,
        cache: false,
        data : params,
        success : function(data) {
        	common.popupCallback(data, id);
	    },
        error : function(xhr, status, exception){
        	alert("전송에 실패하였습니다. \n ("+status+")");
			return false;
        }
    });
};

/**
 * 팝업콜백함수
 */
common.popupCallback = function(data, id) {
	$(id).html(data);
	$(id).modal({
		modal: true,
		width: "auto",
		maxWidth: "1000px",
		height: "auto",
		minHeight: "500px",
		resizable: true
	});
};