package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        int englishScore = 30;
        int mathScore = 80;
        int sum;
        double average = 60;

        if(average < 60){
            System.out.println("시험 불합격");
        }else if(englishScore < 40 || mathScore <40){
            System.out.println("한 과목 과락으로 불합격");
        }else{
            System.out.println("시험 합격");
        }


    }
}
