package com.cos.springlegacy.dto;

import lombok.Data;

@Data
public class RequestInfoDto {
	private String addr;
	private String hobby;
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
}
