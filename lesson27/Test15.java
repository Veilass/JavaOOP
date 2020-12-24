package com.company.lesson27;

import java.util.TooManyListenersException;

public class Test15 {
    void marathon(int tempRuns,int tempAir) throws TuckFootException {
        if(tempRuns > 12){
            throw new TuckFootException("Temp runs too high: " + tempRuns);
        }if(tempAir > 32){
            throw new ContractedMuscleException();
        }
        System.out.println("You ran marathon");
    }

    public static void main(String[] args)  {
        Test15 t = new Test15();
        try {
            t.marathon(13, 26);
        }catch (TuckFootException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Anyway you get diploma");
        }
    }
}




class TuckFootException extends Exception{
    TuckFootException (String message){
        super(message);
    }
    TuckFootException(){ }
}

class ContractedMuscleException extends RuntimeException{
    ContractedMuscleException (String message){
        super(message);
    }
    ContractedMuscleException(){ }
}