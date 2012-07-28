package com.helloworld.HerokuTester;

import com.bsb.common.vaadin.embed.support.EmbedVaadin;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmbedVaadin.forApplication(MyVaadinApplication.class).openBrowser(true).withContextRootDirectory("src/main/webapp").start();
	}

}
