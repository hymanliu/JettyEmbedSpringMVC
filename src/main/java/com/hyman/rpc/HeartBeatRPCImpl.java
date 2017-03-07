package com.hyman.rpc;

import org.springframework.stereotype.Component;

@Component("heartBeatRPCImpl")
public class HeartBeatRPCImpl implements HeartBeatRPC {

	@Override
	public boolean isAlive(String name) {
		return true;
	}

}
