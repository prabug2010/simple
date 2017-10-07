package com.prabu.maven.simple;

import java.net.URI;

import org.testng.Assert;

import com.offbytwo.jenkins.client.JenkinsHttpClient;
import com.offbytwo.jenkins.model.JobWithDetails;

public class JenkinsClientDisplay {
	public static void main(String[] args) throws Exception {
		JenkinsHttpClient client = new JenkinsHttpClient(new URI("http://localhost:8080/job/MyJob/"), "admin",
				"lakshmi");
		JobWithDetails details = client.get("http://localhost:8080/job/MyJob/", JobWithDetails.class);
		Assert.assertEquals(details.getDisplayName(), "MyJob");
	}
}
