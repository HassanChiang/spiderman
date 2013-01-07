package org.eweb4j.spiderman.fetcher;

import org.eweb4j.spiderman.xml.Site;



/**
 * TODO
 * @author weiwei l.weiwei@163.com
 * @date 2013-1-7 下午06:41:33
 */
public interface PageFetcher {
	public void init(Site site) ;
	public FetchResult fetch(String url) throws Exception ;
}
