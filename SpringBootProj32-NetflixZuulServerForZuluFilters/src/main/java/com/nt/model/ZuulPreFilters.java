package com.nt.model;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.protocol.RequestContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulPreFilters extends ZuulFilter {
	public Logger logger = LoggerFactory.getLogger(ZuulPreFilters.class);

	@Override
	public boolean shouldFilter() {
	
		return true;//enables the filter
	}

	@Override
	public Object run() throws ZuulException {
		//get requestContext object(it contains access to multiple other objects)
		RequestContext context=RequestContext.getCurrentContext();
		//get Http request  object from this
		HttpServletRequest req=context.getRequest();
		System.out.println("ZuulPreFilters.run():pre filters");
		//write log message about current request
		logger.info("=========From Pre Filters=======");
		logger.info("request content type ::"+req.getContentType());
		logger.info("request mode ::"+req.getMethod());
		logger.info("request path ::"+req.getServletPath());
		logger.info("request uri ::"+req.getRequestURI());

		return null;
	}

	@Override
	public String filterType() {
		
		return  FilterConstants.PRE_TYPE;//makes the filter as pre filter
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;//high priority
	}

}
