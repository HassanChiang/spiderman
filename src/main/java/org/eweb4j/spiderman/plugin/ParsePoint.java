package org.eweb4j.spiderman.plugin;

import java.util.List;
import java.util.Map;

import org.eweb4j.spiderman.fetcher.Page;
import org.eweb4j.spiderman.spider.SpiderListener;
import org.eweb4j.spiderman.xml.Target;


public interface ParsePoint extends Point{

	void init(Target target, Page page, SpiderListener listener) throws Exception;
	
	List<Map<String, Object>> parse(List<Map<String, Object>> models) throws Exception;

}
