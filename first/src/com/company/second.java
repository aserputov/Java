package com.company;
import java.util.Random;
public class second {



    public void second() {
        Random rand = new Random(); //instance of random class
        int upperbound = 5;
        //generate random values from 0-24
        int int_random = 1 + rand.nextInt(upperbound);
        int int_random1 = 1 + rand.nextInt(upperbound);
        int sum = int_random + int_random1;
        System.out.println("Result of the first dice : " + int_random);
        System.out.println("Result of the second dice : " + int_random1);
        System.out.println("Sum is : " + sum);
        switch(sum) {
            case 2:
            case 3:
            case 12:
                System.out.println("Craps, Better Luck Next Time, You lose");
                break;
            case 7:
            case 11:
                System.out.println("Congratulations, You win");
                break;
            default:
                System.out.println("You rolled " + int_random + "+" + int_random1 + "=" + sum);
                int point = sum;
                System.out.println("Point is (established) set to " + point);
                do{
                    int random = 1 + rand.nextInt(upperbound);
                    int random1 = 1 + rand.nextInt(upperbound);
                    sum = random + random1;
                    System.out.println("You rolled " + random + "+" + random1 + "=" + sum);
                }while(sum != 7 && sum != point);

                if(sum != 7){
                    System.out.println("Congratulations, You Win");
                }else{
                    System.out.println("Craps, Better Luck Next Time, You Lose");
                }
        }
    }
}


