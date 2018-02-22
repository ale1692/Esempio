package it.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class DemoPoint {

	public static void main(String[] args) {

		HashSet<Point> pointsSet = new HashSet<Point>();
		Point p1 = new Point(1, 2);
		pointsSet.add(p1);
		pointsSet.add(p1);

		System.out.println("Prova, aggiungo elemento in Set duplicato:");
		for (Point point : pointsSet) {
			System.out.println(point.getX() + "-" + point.getY());
		}

		System.out.println("Hash Code p1: " + p1.hashCode());

		Point p2 = new Point(1, 3);
		Point p3 = new Point(1, 3);
		pointsSet.add(p2);

		System.out.println("Hash Code p2: " + p2.hashCode());

		System.out.println("Comparison p1 - p2: " + p1.equals(p2));
		System.out.println("Comparison p2 - p3: " + p2.equals(p3));

		System.out.println("Prova, aggiungo elemento in Set distinto:");
		for (Point point : pointsSet) {
			System.out.println(point.getX() + "-" + point.getY());
		}

		TreeSet<Point> pointset = new TreeSet<Point>();
		Point p4 = new Point(1, 2);
		Point p5 = new Point(1, 3);
		Point p6 = new Point(1, 4);
		pointset.add(p4);
		pointset.add(p5);
		pointset.add(p6);
		System.out.println("Elementi TreeSet:");
		for (Point point : pointset) {
			System.out.println(point.getX() + "-" + point.getY());
		}

	}

}
