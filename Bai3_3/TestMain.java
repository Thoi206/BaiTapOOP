package Bai3_3;

import java.math.BigInteger;
public class TestMain {
    public static void main(String[] args){
        BigInteger i1 = new BigInteger("69");
        BigInteger i2 = new BigInteger("92");

        BigInteger sum = i1.add(i2);
        System.out.println("Sum: " + sum);
        BigInteger product = i1.multiply(i2);
        System.out.println("Product: " + product);


    }
}