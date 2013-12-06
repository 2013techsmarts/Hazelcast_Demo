package org.smarttechie.server;

import com.hazelcast.core.Hazelcast;

public class HazelcastServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hazelcast.newHazelcastInstance(null);
	}

}
