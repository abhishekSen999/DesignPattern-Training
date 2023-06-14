package com.iteratrlearning.design_patterns.examples.immutability;

/**
 * Trivial demo of a record class.
 */
public class PersonRecordDemo {

	/** This is all it takes to define a record -
	 * compiler generates constructor, final fields, toString, equals/hashcode, etc.
	 * Hint: after compiling this file, do:
	 * javap PersonRecordDemo$Person
	 */
// This will not compile unless you have a modern JDK and have set the module/project
// Compiler settings to Java 17 (well, 15 will do but not 8 or 11!)
/*
	public record Person(String name, String email) { }

	public static void main(String[] args) {
		Person p = new Person("Harold Potter", "harry@ministryofmagic.uk");
		System.out.println(p);
	}
*/
}
