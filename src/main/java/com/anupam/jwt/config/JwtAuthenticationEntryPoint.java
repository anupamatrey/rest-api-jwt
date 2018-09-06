package com.anupam.jwt.config;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import com.anupam.model.ErrorObject;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException {

		String jsonStr = null;
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		ObjectMapper mapperObj = new ObjectMapper();
		ErrorObject obj = new ErrorObject();
		obj.setMessage("Unauthorized Access");
		obj.setErrorCode(401);

		try {
			jsonStr = mapperObj.writeValueAsString(obj);
		} catch (IOException e) {
			e.printStackTrace();
		}

		response.getWriter().write(jsonStr);

	}
}