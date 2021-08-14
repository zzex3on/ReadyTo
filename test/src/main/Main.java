package main;
import level1.sub.NumberOfK;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfK sol = new NumberOfK();
		// int array[] = {1, 5, 2, 6, 3, 7, 4};
		// int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int array[] = {1, 6, 3, 8, 1, 9, 2};
		int commands[][] = {{1, 7, 3}, {3, 4, 2}, {2, 5, 1}};
		
		
		System.out.println("¾ßÈ£");
		
		sol.solution(array, commands);

	}

}
