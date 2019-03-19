package com.hr.sm_p.entity;

public class Select {
	private String label;
	private String value;
	
	public Select() {
		// TODO Auto-generated constructor stub
	}

	public Select(String label, String value) {
		super();
		this.label = label;
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
