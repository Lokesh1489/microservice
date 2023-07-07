package com.nt.model;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulPostFilter extends ZuulFilter {
	public Logger logger = LoggerFactory.getLogger(ZuulPostFilter.class);

	@Override
	public boolean shouldFilter() {
		
		return true;//enables the filter
	}

	@Override
	public Object run() throws ZuulException {
		 //get RequestContext object
		RequestContext context=RequestContext.getCurrentContext();
		//get Http servletresponse object From this
		HttpServletResponse res = context.getResponse();
		System.out.println("ZuulPostFilter.run()::from post filters ");
		logger.info("======from Post filter======");
		logger.info("response Context Type::"+res.getContentType());
		logger.info("response status ::"+res.getStatus());
		logger.info("response status code ::"+res.getHeader("host"));
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return FilterConstants.POST_TYPE;// enables the filter as post
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;// high priority
	}

}
