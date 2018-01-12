package com.jslsolucoes.nginx.admin.agent.model.response;

import org.apache.commons.lang3.exception.ExceptionUtils;

public class NginxExceptionResponse implements NginxResponse {

	private String stackTrace;
	
	public NginxExceptionResponse() {
		
	}
	
	public NginxExceptionResponse(Throwable throwable) {
		this.stackTrace = ExceptionUtils.getStackTrace(throwable);
	}

	public String getStackTrace() {
		return stackTrace;
	}

	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}
}