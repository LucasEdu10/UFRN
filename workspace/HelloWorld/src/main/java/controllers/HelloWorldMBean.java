package controllers;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorldMBean {
	public String getWorld() {
		return "Hello World JSF!";
	}
}
