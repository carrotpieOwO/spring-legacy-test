package com.cos.springlegacy.dto;

import lombok.Data;

@Data
public class RequestJsonDto {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
