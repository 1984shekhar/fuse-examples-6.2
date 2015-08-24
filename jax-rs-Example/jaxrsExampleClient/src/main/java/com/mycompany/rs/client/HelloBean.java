package com.mycompany.rs.client;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.mycompany.example.jaxrsExampleService.Customer;
import com.mycompany.example.jaxrsExampleService.CustomerService;

public class HelloBean {
	private CustomerService customerService;

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public void getCustomer() {
		 System.out.println("Within CustomerService");
		/* CustomerService customerService = JAXRSClientFactory.create("http://localhost:9000/testREST/customerservice",CustomerService.class); 
		 System.out.println("After CustomerService");
		 Customer c = customerService.getCustomer("123");
		 System.out.println("name: "+c.getName()+" id:"+c.getId());*/
		 
		 
		 Client client = ClientBuilder.newBuilder().newClient();
		 WebTarget target = client.target("http://localhost:9000/testREST");
		 String id = "123";
		 //create a query like http://localhost:9000/testREST/customerservice/customers/123
		 target = target.path("/customerservice/customers/"+id);
		 System.out.println(target.getUri().toString());
		 Invocation.Builder builder = target.request();
		 Response response = builder.get();
		 Customer customer = builder.get(Customer.class);
		 System.out.println(response.getStatus()+": "+ customer.getId()+", "+customer.getName());
		 
		 
	}

}
