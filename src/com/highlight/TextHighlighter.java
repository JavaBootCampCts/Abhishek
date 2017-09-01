package com.highlight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import com.criteria.HighlightCriteria;

public class TextHighlighter {

	public String highlightText(List<HighlightCriteria> highlightCriteriaList,
			String inputText) {
		List<String> tokenisedInputText = splitInputText(inputText);
		List<String> processedInputText = processInputText(tokenisedInputText,
				highlightCriteriaList);
		String outputText = concatenateOutputText(processedInputText);
		return outputText;
	}

	private String concatenateOutputText(List<String> processedInputText) {
		// TODO Auto-generated method stub
		String outputText = new String();
		for (String currentToken : processedInputText) {
			outputText += " " + currentToken;
		}
		return outputText;
	}

	private List<String> processInputText(List<String> tokenisedInputText,
			List<HighlightCriteria> highlightCriteriaList) {
		// TODO Auto-generated method stub
		Iterator<String> inputIterator = tokenisedInputText.iterator();

		List<String> processedInputTextList = new ArrayList<String>();
		while (inputIterator.hasNext()) {
			String currentInputToken = inputIterator.next();
			Iterator<HighlightCriteria> criteriaIterator = highlightCriteriaList
					.iterator();
			while (criteriaIterator.hasNext()) {
				HighlightCriteria criteria = criteriaIterator.next();
				if (currentInputToken.equalsIgnoreCase(criteria.getKeyword())) {
					switch (criteria.getCaseOfKeyword()) {
					case "capital":
						currentInputToken = currentInputToken.toUpperCase();
						break;
					case "lower":
						currentInputToken = currentInputToken.toLowerCase();
						break;
					}
					switch (criteria.getFontType()) {
					case "bold":
						currentInputToken = "[bold]" + currentInputToken
								+ "[bold]";
						break;
					}
					currentInputToken = "[" + criteria.getColour() + "]"
							+ currentInputToken + "[" + criteria.getColour()
							+ "]";
					break;
				}
			}
			processedInputTextList.add(currentInputToken);
		}
		return processedInputTextList;
	}

	private List<String> splitInputText(String inputText) {
		// TODO Auto-generated method stub
		StringTokenizer stringTokenizer = new StringTokenizer(inputText, " ");
		List<String> tokenisedInputText = new ArrayList<String>();
		while (stringTokenizer.hasMoreElements()) {
			tokenisedInputText.add(stringTokenizer.nextToken());
		}
		return tokenisedInputText;
	}
}
