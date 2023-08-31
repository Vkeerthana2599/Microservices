package com.keerthi.orderservice.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmailDto implements Serializable {

	private String sendMailId;

	private String receiptMailId;

	private String subject;

	private String mailBodyContext;

}
