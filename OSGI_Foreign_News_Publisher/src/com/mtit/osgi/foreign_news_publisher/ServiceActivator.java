package com.mtit.osgi.foreign_news_publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class ServiceActivator implements BundleActivator {
	
	//Register the service
	ServiceRegistration foreignNewsPublishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Publisher start");
		ServicePublish publishService = new ServicePublishImpl();
		
		foreignNewsPublishServiceRegistration = context.registerService(ServicePublish.class.getName(),publishService,null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher stop");
		foreignNewsPublishServiceRegistration.unregister();
	}

}
