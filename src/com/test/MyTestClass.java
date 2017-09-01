package com.test;

import java.util.ArrayList;
import java.util.List;

import com.criteria.HighlightCriteria;
import com.highlight.TextHighlighter;

public class MyTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<HighlightCriteria> highlightCriteria = new ArrayList<HighlightCriteria>();
		highlightCriteria.add(new HighlightCriteria("as", "blue", "capital", "normal"));
		highlightCriteria.add(new HighlightCriteria("if", "red", "lower", "bold"));
		highlightCriteria.add(new HighlightCriteria("and", "red", "capital", "bold"));
		highlightCriteria.add(new HighlightCriteria("then", "green", "lower", "normal"));
		highlightCriteria.add(new HighlightCriteria("when", "blue", "lower", "normal"));
		String inputText = "If we write a program and compile it, then as we run the program, we will get the output";
		String outputText = new TextHighlighter().highlightText(highlightCriteria, inputText);
		System.out.println(outputText);
	}

}
