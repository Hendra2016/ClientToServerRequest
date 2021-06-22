package com.simple.client;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

	@RequestMapping("/toserver")
	public String callBacktoServer(HttpServletResponse response) {
		response.setHeader("X-ResponseCode", "94");
		response.setHeader("X-ResponseDesc", "desc here");
		return "Hallo";

	}
}
