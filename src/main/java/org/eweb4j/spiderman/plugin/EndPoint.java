package org.eweb4j.spiderman.plugin;

import java.util.List;
import java.util.Map;

import org.eweb4j.spiderman.spider.SpiderListener;
import org.eweb4j.spiderman.task.Task;


public interface EndPoint extends Point{

	void init(Task task, List<Map<String, Object>> models, SpiderListener listener) throws Exception;
	
	List<Map<String, Object>> complete(List<Map<String, Object>> models) throws Exception;

}
