package com.mtit.osgi.local_news_publisher;

import java.util.Scanner;

public class ServicePublishImpl implements ServicePublish {

	public String localNewsPublishService() {
		
		String medium;
		String category;
		
		System.out.println("");
		System.out.println("\t\t ---------*** Welcome to Instant News service (Local) ***--------- ");
		System.out.println("");
		
		System.out.println("");
		System.out.println("\t\t             Medium            ");
		System.out.println("\t\t -------------------------------");
		System.out.println("");
		
		System.out.println("\t\t\t 1. Sinhala");
		System.out.println("\t\t\t 2. English");
		
		 Scanner myObj = new Scanner(System.in);
		 System.out.print("Enter Medium (1/2):");
		
		medium = myObj.nextLine();
		
		System.out.println("");
		System.out.println("\t\t             News Category            ");
		System.out.println("\t\t --------------------------------------");
		System.out.println("");
		
		System.out.println("\t\t\t 1. Sport");
		System.out.println("\t\t\t 2. Weather");
		System.out.println("\t\t\t 3. Covid 19");
		System.out.println("\t\t\t 4. Politics");
		System.out.println("\t\t\t 5. Other");
		
		System.out.print("Enter News category (1/2/3/4/5):");
		category =  myObj.nextLine();
		
		 if(medium == "1" ) {
			switch(category) {
			case "1":
				return "Here Sport news in sinhala";
			case "2":
				return "Here Weather news in sinhala";
			case "3": 
				return "Here Covid 19 news in Sinhala";
			case "4":
				return "Here Politics news in sinhala";
			default:
				return "Here other news in sinhala...";
			}
		}else {
			switch(category){
			case "1":
				return "Here Sport news in english";
			case "2":
				return "Here Weather news in english";
			case "3": 
				return "Here Covid 19 news in english";
			case "4":
				return "Here Politics news in english";
			default:
				return "Here other news in english...";
			}
		}
		
		
	}
}
