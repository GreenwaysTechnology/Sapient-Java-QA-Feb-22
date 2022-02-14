package com.sapient.core;

public class IFControlFlowStatement {
    public static void main(String[] args) {
        boolean isMoving = true;
//        if (isMoving){
//            System.out.println("Moving...");
//        }
        if (isMoving) System.out.println("Moving...");

        isMoving = false;
        //if...else
        if (isMoving) {
            System.out.println("Moving...");
        } else {
            System.err.println("The bicycle has already stopped!");
        }
        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

    }
}
