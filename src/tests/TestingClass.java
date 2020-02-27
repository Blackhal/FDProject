package tests;

import tools.*;
import items.*;

public class TestingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dd4 = {1,1,2,2};
		int[] dd6 = {2,3,3,4,4,4};
		int[] dd8 = {4,5,6,6,7,7,8,8};
		int[] dd12 = {7,8,9,10,11,12,7,8,9,10,11,12};
		int[] dd20 = {11,12,13,14,15,16,17,18,19,20,11,12,13,14,15,16,17,18,19,20};
		int[] dd30 = {21,22,23,24,25,26,27,28,29,30,21,22,23,24,25,26,27,28,29,30,21,22,23,24,25,26,27,28,29,30};
		Dice d4 = new Dice(4, dd4);
		Dice d6 = new Dice(6, dd6);
		Dice d8 = new Dice(8, dd8);
		Dice d12 = new Dice(12, dd12);
		Dice d20 = new Dice(20, dd20);
		Dice d30 = new Dice(30, dd30);
		
		System.out.println("Dado de d4, Resultado: " + d4.getResult());
		System.out.println("Dado de d6, Resultado: " + d6.getResult());
		System.out.println("Dado de d8, Resultado: " + d8.getResult());
		System.out.println("Dado de d12, Resultado: " + d12.getResult());
		System.out.println("Dado de d20, Resultado: " + d20.getResult());
		System.out.println("Dado de d30, Resultado: " + d30.getResult());
		
		Driver d1 = new Driver("Ivan Barrio Munoz");
		Driver d2 = new Driver("Caroline Griffne");
		
		Team team1 = new Team();
		team1.createTeam("SMY Racing Team", d1, d2);
		team1.createCars();
		d1.assignCar(team1.getCar1());
		d2.assignCar(team1.getCar2());
		
		System.out.println(d1.getDriverStatus());
		System.out.println(d2.getDriverStatus());
	}

}
