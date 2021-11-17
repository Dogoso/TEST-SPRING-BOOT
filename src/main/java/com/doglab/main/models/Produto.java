package com.doglab.main.models;

public class Produto {

	private int id;
	private String name;
	private String desc;
	private String mark;
	private float value;
	
	public Produto(int id, String name, String desc, String mark, float value) {
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.mark = mark;
		this.value = value;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getMark() {
		return mark;
	}
	
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	public float getValue() {
		return value;
	}
	
	public void setValue(float value) {
		this.value = value;
	}
	
}
