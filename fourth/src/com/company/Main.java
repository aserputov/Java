/**********************************************
 Workshop #
 Course:JAC444 - Semester
 Last Name:Serputov
 First Name:Anatoliy
 ID:167389188
 Section:NFF
 This assignment represents my own work in accordance with Seneca Academic Policy. Signature
 Date:02/21/2021
 **********************************************/

package com.company;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Main {

    public static void main(String[] args) throws IOException {
        int wrong = 0;
        Scanner ans = new Scanner(System.in);
        String answer;
        do {
            wrong = 0;
            File file = new File("hangman.txt");
            Scanner read = new Scanner(new FileReader(file));
            read.useDelimiter(",");
            ArrayList<String> st = new ArrayList<String>();
            while (read.hasNext()) {
                st.add(read.next());
            }

            Random rng = new Random();
            String word = st.get(rng.nextInt(st.size()));

            String correct = "";
            String check = "";

            for (int i = 0; i < word.length(); i++) {
                correct += "*";
            }

            System.out.print("(Guess) Enter a letter in word ");
            String a;
            Scanner S = new Scanner(System.in);
            while (!correct.equals(word)) {
                System.out.print(" > ");
                char ok = S.next().charAt(0);

                for (int i = 0; i < check.length(); i++) {
                    char ch = check.charAt(i);
                    if (ch == ok) {
                        System.out.println(ok + " is already in the word");
                        wrong ++;
                    }
                }

                System.out.print("(Guess) Enter a letter in word ");

                for (int i = 0; i < word.length(); i++) {
                    char not = word.charAt(i);
                    if (not == ok) {
                        correct = correct.substring(0, i) + not + correct.substring(i + 1);
                    }
                }

                check += ok;
                System.out.print(correct);

            }
            System.out.println();
            System.out.print("The word is " + correct +". You missed time "+ wrong );
            System.out.println();
            Scanner sc = new Scanner(System.in); //System.in is a standard input stream
            System.out.print("Enter a new word to be added in the memory >");
            String str = sc.nextLine();

            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write("," + str);

            br.close();
            fr.close();

            System.out.print("Do you want to guess another word? Enter y or n > ");
            answer = ans.nextLine();
        }while(!answer.equals("n"));
    }
}

//
