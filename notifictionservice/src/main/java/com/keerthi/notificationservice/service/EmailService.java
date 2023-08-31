package com.keerthi.notificationservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.keerthi.notificationservice.dto.EmailDto;

@Service
public class EmailService 
{
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@KafkaListener(topics = "emailTemplate")
	public void handleNotification(EmailDto emailDto) {
		sendEmail(emailDto);
	}

	
	private void sendEmail(EmailDto emailDto) {

		System.out.println("mail sended");
	}


	@Value("${logging.file.name}")
	private String loggerPath;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);
	
	public boolean sendMail(EmailDto dto) {
		
		LOGGER.info(" inside sendMail ()   EmailService dto {} :"+dto);
		try {
			SimpleMailMessage mailMessage= new SimpleMailMessage();
			
			mailMessage.setFrom(dto.getSendMailId());
			mailMessage.setTo(dto.getReceiptMailId());
			mailMessage.setText(dto.getSubject());
			mailMessage.setSubject(dto.getMailBodyContext());
			
			javaMailSender.send(mailMessage);
			return true;
		}
		
		catch(Exception e) {
			return false;
		}
	}

}
