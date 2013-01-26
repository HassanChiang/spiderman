package org.eweb4j.spiderman.xml;

import org.eweb4j.util.xml.AttrTag;

public class Target {

	@AttrTag
	private String name;
	
	@AttrTag
	private String cType;
	
	private Urls urls ;
	
	private Model model;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Urls getUrls() {
		return urls;
	}

	public void setUrls(Urls urls) {
		this.urls = urls;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public String getCType() {
		return this.cType;
	}

	public void setCType(String cType) {
		this.cType = cType;
	}
	
}
