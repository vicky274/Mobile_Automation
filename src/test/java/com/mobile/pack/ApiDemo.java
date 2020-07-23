package com.mobile.pack;

import java.net.MalformedURLException;

public class ApiDemo extends BaseforApiDemo{

	public static void main(String[] args) {
		
		try {
			initializedriver();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
