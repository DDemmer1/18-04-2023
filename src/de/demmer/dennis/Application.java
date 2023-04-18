package de.demmer.dennis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

//		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(inputStreamReader);
//
//		try {
//			while (true) {
//				
//				String input = br.readLine();
//
//				if (input.equals("time")) {
//					System.out.print(new Date());
//				} else if (input.equals("exit")) {
//					br.close();
//					System.exit(0);
//				} else {
//					System.out.println("Command not implemented");
//				}
//				
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//-------------------------------------------------

		Scanner sc = new Scanner(System.in);

		while (true) {

			String input = sc.next();
			
			if(input.equals("time")) {
				System.out.print(new Date());
			} else if(input.equals("exit")) {
				sc.close();
				System.exit(0);
			} else {
				System.out.println("Command not implemented");
			}
			
		}

	}

}
