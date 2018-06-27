<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
result code : ${resultMap.resultCode }<br>
	<form method="POST" action="<c:url value='/mail/sendMulti' />">
		<p>
			* From File by Multi User
		</p>
		<p>
			From email address: <input name="FROMEMAIL" value="mahau.master@gmail.com" />
		</p>
		<p>
			Mail subject: <input name="SUBJECT" value="Test Multi Mail Sender">
		</p>
		<p>
			<input type="submit" name="Action" value="sendsendMulti" />
		</p>
	</form>
---------------------------------------------------------------------------<br>
	<form method="POST" action="<c:url value='/mail/sendSingle' />">
		<p>
			* From File by Single User
		</p>
		<p>
			From email address: <input name="FROMEMAIL" value="mahau.master@gmail.com" />
		</p>
		<p>
			To email address: <input name="EMAIL" value="mahau.master@gmail.com" />
		</p>
		<p>
			Mail subject: <input name="SUBJECT" value="Test Single Mail Sender">
		</p>
		<p>
			Mail message:
			<textarea name="MESSAGE"><h1>Test Mail Sender</h1></textarea>
		</p>
		<p>
			<input type="submit" name="Action" value="sendSingle" />
		</p>
	</form>
</body>
</html>