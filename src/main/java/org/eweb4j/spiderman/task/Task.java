package org.eweb4j.spiderman.task;

import org.eweb4j.spiderman.xml.Site;
import org.eweb4j.spiderman.xml.Target;



public class Task {

	public Task(String url, String sourceUrl, Site site, int sort) {
		super();
		this.url = url;
		this.sourceUrl = sourceUrl;
		this.site = site;
		this.sort = sort;
	}

	public Site site ;
	public Target target;//当前Task匹配到的target目标引用
	public double sort = 10;
	public String url;
	public String sourceUrl;//task.url的来源
	
	public String toString() {
		return "Task [site=" + site.getName() + ", sort=" + sort + ", url=" + url + ", sourceUrl=" + sourceUrl + "]";
	}
}
