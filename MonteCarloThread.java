package com.company;

public class MonteCarloThread extends Thread {
    int number_of_points_in_circle;
    private int number_of_iteration;

    public MonteCarloThread(int number_of_iteration){
        this.number_of_iteration = number_of_iteration;
    }

    public void run(){
        for(int i=0; i<number_of_iteration; i++){
            double x = Math.random();
            double y = Math.random();
            if (Math.sqrt(Math.pow(x,2)+Math.pow(y,2))<=1)
                number_of_points_in_circle++;
        }
    }
}
