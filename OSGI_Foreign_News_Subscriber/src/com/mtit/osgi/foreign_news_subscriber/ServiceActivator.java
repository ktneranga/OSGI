package com.mtit.osgi.foreign_news_subscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.osgi.foreign_news_publisher.ServicePublish;

public class ServiceActivator implements BundleActivator {
	
	//implement the service reference to refer the service.
	ServiceReference serviceReference;

	public void start(BundleContext context) throws Exception {
		System.out.println("Start subscriber service");
		serviceReference = context.getServiceReference(ServicePublish.class.getName());
		ServicePublish servicePublish = (ServicePublish)context.getService(serviceReference);
		System.out.println(servicePublish.foreignNewsPublishService());
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Good bye");
		context.ungetService(serviceReference);
	}

}
