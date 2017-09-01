package com.criteria;

public class HighlightCriteria {
	private String keyword;
	private String colour;
	private String caseOfKeyword;
	private String fontType;

	public HighlightCriteria(String keyword, String colour, String caseOfKeyword, String fontType) {
		this.keyword = keyword;
		this.colour = colour;
		this.caseOfKeyword = caseOfKeyword;
		this.fontType = fontType;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCaseOfKeyword() {
		return caseOfKeyword;
	}

	public void setCaseOfKeyword(String caseOfKeyword) {
		this.caseOfKeyword = caseOfKeyword;
	}

	public String getFontType() {
		return fontType;
	}

	public void setFontType(String fontType) {
		this.fontType = fontType;
	}
}
