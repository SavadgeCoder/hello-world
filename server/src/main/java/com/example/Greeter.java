package com.example;

/**
 * This is a class.
 */
public class Greeter {
	System.out.println("Hi!");
	System.out.println("This is a test run with GitHub and it sucks.");
  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  //TODO: Add javadoc comment
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
    
  }
}
