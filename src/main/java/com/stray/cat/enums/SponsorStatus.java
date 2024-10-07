package com.stray.cat.enums;


public enum SponsorStatus {

	Examine(0, "审核中"),

	Push(1, "发布"),

	Repulse(2, "发布");

	private Integer status;
	private String desc;

	private SponsorStatus(Integer status, String desc) {
		this.status = status;
		this.desc = desc;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
