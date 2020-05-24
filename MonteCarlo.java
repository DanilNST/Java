package com.company;

public class MonteCarlo {

    public static int total_number_of_iteration = 10000000;
    public static int number_of_threads;


    public static double getPi(int number_of_thread) throws InterruptedException {
        number_of_threads=number_of_thread;
        int n_points_in_circle=0;
        int n_of_iteration = total_number_of_iteration/number_of_threads;
        MonteCarloThread[] threads = new MonteCarloThread[number_of_threads];

        for(int i=0;i<number_of_threads;i++){
            threads[i] = new MonteCarloThread(n_of_iteration);
            threads[i].start();
        }

        for(int i=0;i<number_of_threads;i++){
            threads[i].join();
            n_points_in_circle+=threads[i].number_of_points_in_circle;

        }

        return((double)n_points_in_circle/total_number_of_iteration)*4;
    }


}
