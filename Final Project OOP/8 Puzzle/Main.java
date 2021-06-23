/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EightPuzzle;

import java.util.Scanner;

public class Main {
    final static private String GOAL = "123804765";

    public static void main(String[] args) {
        String root = null;
        String inputUser;
        int ch;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("8 Puzzle AI");
            System.out.println("1. Choose State");
            System.out.println("2. Create State");
            System.out.println("Enter number : ");
            ch = scan.nextInt();
        }while(ch > 2 || ch < 1);
        
        switch(ch) {
        case 1 :
        	do {
        	System.out.println("1. Easy");
            	System.out.println("2. Medium");
            	System.out.println("3. Hard");
            	ch = scan.nextInt();
            }while(ch > 3 || ch < 1);
        	switch(ch) {
        	case 1 : 
        		root = "103824765";
        		break;
        	case 2 :
        		root = "134802765";
        		break;
        	case 3 :
        		root = "281043765";
        	}
        	break;
        case 2 :
        	do {
            	System.out.println("Masukkan Matrix dalam bentuk String[0-8]: ");
                scan.nextLine();
            	inputUser = scan.nextLine();
            }while(inputUser.length() > 9);
            root = inputUser;
        }
        
        BFS search = new BFS(new Node(root), GOAL);
        search.BreadthFirstSearch();


    }
}