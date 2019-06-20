package com.nickfonseca.Visitor;

public class Smartphone implements Alert{
	public void alert(AlertVisitor alertVisitor) {
        alertVisitor.visit(this);
    }

}
