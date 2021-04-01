package com.nt.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/employee")
public class EmployeeRestController {
	@GET
	@Path("/msg")
public String showMsg() {
		System.out.println("Executed...");
	return "WELCOME TO FIRST REST APP!";
}
}
