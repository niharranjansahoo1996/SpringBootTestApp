package com.nihar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("WELCOME TO SPRINGBOOT APPLICATION BY GIT");
		int i=10;
		System.out.println("Some modifications for second time");
	}

}
