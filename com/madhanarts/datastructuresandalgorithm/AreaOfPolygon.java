package com.madhanarts.datastructuresandalgorithm;

import java.util.Scanner;

class Point
{
	public int x;
	public int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

public class AreaOfPolygon {
	
	private static double crossProduct(Point a, Point b) {
		return a.x * b.y - b.x * a.y;
	}
	
	private static double areaOfPolygon(Point[] points, int n) {
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += crossProduct(points[i], points[(i+1)%n]);
			System.out.println(crossProduct(points[i], points[(i+1)%n]));
		}
		
		return Math.abs(sum) / 2.0;

	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = Integer.parseInt(in.nextLine());
		Point[] points = new Point[n];
		for(int i = 0; i < n; i++)
		{
			String line = in.nextLine();
			String[] values = line.split(" ");
			points[i]= new Point(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
		}
		
		System.out.println("Area of Polygon is : " + areaOfPolygon(points, n));
		
		in.close();
		
	}

}
