package aula11;

import java.util.Scanner;

public class Programa01 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			i++;
			if(i == 5 || i == 7) {
				continue;
			}
			if(i == 9) {
				break;
			}
			System.out.println("Cambalhota: " + i);
		}
	}
}
