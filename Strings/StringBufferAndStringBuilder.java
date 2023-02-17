package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class StringBufferAndStringBuilder {

	// Strings class
	// Strings notes
	// Difference b/w String buffer and String Builder
	// Difference b/w this keyword and this method
	// scope examples
	// Difference b/w mutable and custom immutable
	// Difference b/w explicit call and implicit call
	// Beginners book programs
	// Has A Relationship in edureka
	// Is A Relationship
	// Have to know about Jira and Jenkins software
	// InstanceOf examples
	// Double linked list
	// offer() method
	// Vector
	// Multi-threading
	// check classes there in which packages

	// what is load factor
	// what is threshold
	// how many buckets
	// collision - default value
	// Hash map - default capacity
	// default capacity and load factor can be changed or not
	// calculation once threshold exceeded
	// ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(3,4,8));
	// internal working of hashing algorithm
	// hash code and hash equals methods
	// stack and queues
	// priority dequeue
	// Array dequeue
	// collection hierarchy in java
	
	
	// jvm
	// jre
	// custom immutable
	// string methods
	// string objects
	// string buffer and string builder
	// to string method
	
	
	//Types of Exceptions
	//Types of Annotations
	//How to read the annotation values (Standard program)
	//Deep in annotation
	
	public static void main(String[] args) {
		String text = "user1";
		text = text + " user2";
		text = text + " user3";
		text = text + " user4";
		text = text + " user5";
		System.out.println(text);

		// 9 objs are created; 1 is active in

		// one obj is created
		StringBuffer textBuf = new StringBuffer("user1");
		textBuf.append(" user2");
		textBuf.append(" user3");
		textBuf.append(" user4");
		textBuf.append(" user5");
		System.out.println(textBuf);

		// one obj is created
		StringBuilder textBuild = new StringBuilder("user1");
		textBuild.append(" user2");
		textBuild.append(" user3");
		textBuild.append(" user4");
		textBuild.append(" user5");

		System.out.println(textBuild);
	}
}
