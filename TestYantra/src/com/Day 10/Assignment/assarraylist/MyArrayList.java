package com.ob.day10.assarraylist;

import java.util.Arrays;

/**
* @author Abisheikha
*/
public class MyArrayList {
	private Object[] array;
	private int size = 10;
	int position;

	public MyArrayList() {
		array = new Object[size];
	}

	public MyArrayList(int size) {
		this.size = size;
		array = new Object[size];
	}

	public void add(Object obj) {
		if(position>size) {
			increaseCapacity();
		}
		array[position++]=obj;
	}
	private void increaseCapacity() {
		this.size=((size*3)/2)+1;
		Object[] temp=new Object[size];
		for(int i=0;i<array.length;i++) {
			temp[i]=array[i];
		}
		array=temp;
		
	}
	private void decreaseCapacity() {
		this.size=size-1;
		Object[] temp=new Object[size];
		for(int i=0;i<size;i++) {
			temp[i]=array[i];
		}
		array=temp;
	}
	
	public void remove(int index) {
		if(index>=array.length) {
			System.out.println("Cannot be deleted");
		}
		else {
		for(int i=index;i<array.length-1;i++) 
			array[i]=array[i+1];
		}
		decreaseCapacity();
	}
	public void test() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public Object get(int index) {
		return array[index];
	}

	@Override
	public String toString() {
		return "MyArrayList [array=" + Arrays.toString(array) + "]";
	}
	
	
}
