package com.prabu.maven.simple;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.Reporter;

public class TestListener implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Hi i am here");
	}

	@Override
	public void onFinish(ISuite suite) {
		Reporter.log("I finished my stuff.");
	}

}
