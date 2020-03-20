package com.action;

import org.eclipse.jdt.internal.compiler.ast.ThrowStatement;

import com.opensymphony.xwork2.ActionSupport;

import javafx.scene.shape.Line;

public class LineAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Line line;
	public Line getLine() {
		return line;
	}
	public void setLine(Line line) {
		this.line = line;
	}
	public String execute() throws Exception{
		return "success";		
	}
 	
}
