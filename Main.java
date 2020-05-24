package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        double pi=MonteCarlo.getPi(4);
        long end = System.currentTimeMillis();
        long time=end-start;

        System.out.println("PI is "+pi);
        System.out.println("THREADS "+ MonteCarlo.number_of_threads);
        System.out.println("ITERATIONS "+ MonteCarlo.total_number_of_iteration);
        System.out.println("TIME "+time+"ms");






    }
}