package com.oca.assesment;

import java.util.ArrayList;

public class Egret {
	private String color;

	public Egret() {
		this("white");
	}

	public Egret(String color) {
		color = color;
	}

	public static void main(String[] args) {
		int ids[], types;

		Egret e = new Egret();
		System.out.println("Color:" + e.color);
	}

}
