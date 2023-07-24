package com.mysite.sbb;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
// @setter
public class HelloLombok {
	
	private final String hello;
	private final int lombok;

	public static void main(String[] args) {
		HelloLombok helloLombok = new HelloLombok("하이욤", 100);
		
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}
}
