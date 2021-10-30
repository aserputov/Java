package com.company;

import java.io.IOException;
import java.io.*;
import java.util.ArrayList;

public class part {
    public static void main(String[] args) throws IOException {

        File file = new File("work.txt");
    String strLine;
    ArrayList<String> ans= new ArrayList<String>();

    BufferedReader br = new BufferedReader(new FileReader(file));
        while ((strLine = br.readLine()) != null) {
                ans.add(strLine);
                }
                String st;

                char ok;
                for(char alphabet = 'a'; alphabet <='z'; alphabet++ ) {
                int counts = 0;
                int countL = 0;
                ok = Character.toUpperCase(alphabet);
                for ( String result: ans){
                for (int i = 0; i < result.length(); i++){
        char c = result.charAt(i);
        if(c == alphabet){
        counts++;
        }

        if(c == ok){
        countL++;
        }


        }


        }
        System.out.println("Number of " + alphabet+ "'s:" + counts);
        System.out.println("Number of " + ok + "'s:" + countL);
        }
    }
}
