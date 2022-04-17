package com.tyss.assignment6;
/**
* @author Abisheikha
*/
public class Area extends Shape {

	@Override
	void RectangleArea(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}

	@Override
	void SquareArea(int x) {
		// TODO Auto-generated method stub
		System.out.println(x*x);
	}

	@Override
	void CircleArea(int y) {
		// TODO Auto-generated method stub
		System.out.println(3.14*y*y);
	}

}
