package com.clustering.project.component;

import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class MailComponent {
	
	@Autowired
	private JavaMailSender mailSender;

	public String sendMail(Map<?, ?> dataMap){

		MimeMessage message = mailSender.createMimeMessage();
		
		try{
			MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");

			// set plain text message
	        helper.setFrom((String) dataMap.get("FROMEMAIL"));
	        helper.setTo((String) dataMap.get("TOEMAIL"));
	        helper.setSubject((String) dataMap.get("SUBJECT"));
	        helper.setText((String) dataMap.get("MESSAGE"), true);

	        mailSender.send(message);
		} catch (Exception e)  {	// with AddressException, MessageingException
			return "Failure" ; 	// error send mail
		}
		
		return "Success" ;
	}

}
