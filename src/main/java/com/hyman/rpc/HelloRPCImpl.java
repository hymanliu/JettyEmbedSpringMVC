package com.hyman.rpc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hyman.service.TestService;

@Component("helloRPCImpl")
public class HelloRPCImpl implements HelloRPC {

	@Autowired TestService testService;
	
	@Override
	public String say(String name) {
		return testService.hellworld()+":"+name;
	}
}
