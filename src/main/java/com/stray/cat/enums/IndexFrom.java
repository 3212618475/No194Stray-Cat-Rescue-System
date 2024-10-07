package com.stray.cat.enums;


public enum IndexFrom {

	Post(0, "启示"),

	Share(1, "分享"),

	Sponsor(2, "赞助");

	private Integer status;
	private String desc;

	private IndexFrom(Integer status, String desc) {
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
