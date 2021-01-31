package com.designprinciples.calculator.expression;

import java.math.BigDecimal;

public class Expression {
	private BigDecimal first,second;
	private com.designprinciples.calculator.expression.Operator sign;
	public BigDecimal getFirst() {
		return first;
	}
	public BigDecimal getSecond() {
		return second;
	}
	public com.designprinciples.calculator.expression.Operator getSign() {
		return sign;
	}
	public Expression setFirst(BigDecimal first) {
			this.first=first;
			return this;
		}
	public Expression setSecond(BigDecimal second) {
		this.second=second;
		return this;
	}
	public Expression setSign(com.designprinciples.calculator.expression.Operator operator) {
		this.sign=operator;
		return this;
	}
	public String toString() {
		return ""+first+" "+(sign).getSign()+" "+second;
	}
}
