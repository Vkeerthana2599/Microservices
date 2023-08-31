package com.keerthi.notificationservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthi.notificationservice.appconstant.AppConstant;
import com.keerthi.notificationservice.dto.EmailDto;
import com.keerthi.notificationservice.service.EmailService;

@RestController
@RequestMapping(value=AppConstant.FORWARD_SLASH)
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@Value("${logging.file.name}")
	private String loggerPath;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmailController.class);

	
	@PostMapping(value=AppConstant.SEND_EMAIL)
	public boolean sendMailDetails(@RequestBody EmailDto dto) {
		LOGGER.info(" inside sendEmailDetails () of EmailController dto {} :"+dto);
		return emailService.sendMail(dto);
	}

}
