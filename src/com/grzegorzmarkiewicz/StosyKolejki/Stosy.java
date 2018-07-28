package com.grzegorzmarkiewicz.StosyKolejki;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Stosy {
    public static void main(String[] args) {
        System.out.println("Zadanie 1:");
        Stack<Character> charStack = new Stack<Character>();
        String string = "ABC";

        System.out.println(string);

        for (int i =0; i < string.length(); i++){
            charStack.push(string.charAt(i));
        }

        System.out.println(reverse(charStack));

        System.out.println("Zadanie 2:");
        Scanner inputString = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String inString = inputString.nextLine();

        for (int i = 0; i < inString.length(); i++){
            charStack.push(inString.charAt(i));
        }
        String testString = reverse(charStack);

        if (testString.equals(inString)){
            System.out.println("To jest palindrom");
        } else {
            System.out.println("To nie jest palindrom");
        }

        LinkedList<String> women = new LinkedList<>();
        LinkedList<String> men = new LinkedList<>();

        System.out.println("Podaj liczbe osob");
        int num = inputString.nextInt();
        inputString.nextLine();
        for (int i = 0; i < num; i++){
            System.out.println("Kobieta/Mezczyzna");
            String gender = inputString.nextLine();
            if (gender.equals("k")) {
                women.addLast(gender);
            }
            if (gender.equals("m")){
                men.add(gender);
            }
            System.out.println("Kobiety: " + women + "\nMezczyzni: " + men);
            if ((women.isEmpty() == false) && (men.isEmpty() == false)){
                women.removeFirst();
                men.removeFirst();
            }
            System.out.println("Kobiety: " + women + "\nMezczyzni: " + men);
        }
    }

    public static String reverse(Stack<Character> stack){
        String string = "";
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            string += stack.pop();
        }
        return string;
    }
}
