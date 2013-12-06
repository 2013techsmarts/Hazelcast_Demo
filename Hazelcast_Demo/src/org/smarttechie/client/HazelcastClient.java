package org.smarttechie.client;

import java.util.Collection;
import java.util.Map;

import org.smarttechie.model.Customer;

import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.getGroupConfig().setName("dev").setPassword("dev-pass");
		clientConfig.addAddress("localhost:5701", "localhost:5702");

		HazelcastInstance client = com.hazelcast.client.HazelcastClient.newHazelcastClient(clientConfig);
		//All cluster operations that you can do with ordinary HazelcastInstance
		Map<String, Customer> mapCustomers = client.getMap("customers");
		mapCustomers.put("1", new Customer("1", "xyz", "xyz", "xyz"));
		mapCustomers.put("2", new Customer("2", "abc", "abc", "abc"));
		mapCustomers.put("3", new Customer("1", "123", "123", "123"));

		Map<String, Customer> colCustomers = client.getMap("customers");
		 System.out.println(colCustomers.size());
		
	}

}
