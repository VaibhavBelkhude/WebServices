package com.nt.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ClientTest1 {
	private static final String uri ="http://localhost:8080/WebServiceProj-1-JerseyApp-Integration/";
	private static String path ="/rest/emp/msg";
	public static void main(String[] args) {
		try {
			//1. create one empty client object
			Client c = ClientBuilder.newClient();
			
			//2. add uri and path to create webtarget
			WebTarget wt = c.target(uri).path(path);
			
			//3. convert to request builder object
			Invocation.Builder builder = wt.request();
			
			//4. provide header, body...etc
			//nothing as of now
			
			//5. execute request with type (get()/post()...)
			//6. Read Response from FC
			Response response = builder.get();
			
			//7. read details and 8. print details
			System.out.println(response.getStatus());
			System.out.println(response.getStatusInfo());
			System.out.println(response.readEntity(String.class));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}