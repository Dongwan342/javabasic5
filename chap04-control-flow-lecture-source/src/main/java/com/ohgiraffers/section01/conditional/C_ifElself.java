package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElself {

    public void testSimpleIfElseIfStatement() {

        /* 수업목표. if-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
        * [if - else - if 문 표현식]
        * if(조건식1) {
               조건식1이 true일 때 실행할 명령문;
        * } else if {
               조건식1이 false이고, 조건식2가 true일 때 실행할 명령문;
        * } else {
        *    위의 조건 2개가 모두 거짓인 경우 실행할 명령문;
        *  }

        /* 필기.
        * if-else-if 문은 조건식 1의 결과 값이 참(true) 이면 if { } 안에 있는 코드 실행
        * 조건식 1이 false이면 조건식 2를 확인하여 참(true)이면 else if { } 안에 있는 코드 실행
        * 코드를 실행한다
        * 조건식 1과 조건식 2의 결과 값이 모두 거짓(false)이면 else { } 안에 있는 코드 실행

        // 여러 개의 조건을 제시하여 그 중 한 가지를 반드시 실행시키고 싶은 경우 사용한다.

         */
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨렸다...");
        System.out.println("나무꾼이 어쩔줄 몰라하던 그 때...");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");

        System.out.print("어느 도끼가 너의 도끼이느냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) : ");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if(answer == 1) {

            System.out.println("이런 거짓말쟁이!! 너에게는 아무런 도끼를 줄 수 없다.. 이 욕심쟁이..");
        } else if(answer ==2) {

            System.out.println("욕심이 과하진 않지만 그래도 넌 거짓말을 하였군.. 썩 꺼지거라");
        } else {

            System.out.println("오~ 정직한 놈이로구나.. 여기 있는 모든 도끼를 너에게 주마");
        }

        System.out.println("그렇게 산신령은 다시 연못 속으로 사라졌다...");

        System.out.println("어느 나라에 가야하지?");
        System.out.println("맛있는 거 먹고 싶은데");
        System.out.println("밀크티가 유명한 나라들로 목록을 뽑아볼까?");
        System.out.print("어디로 갈까요? (1. 홍콩 2. 영국 3. 인도 4. 대만) : ");
        Scanner sc2 = new Scanner(System.in);
        int answer2 = sc2.nextInt();
        if(answer2 == 1)
            System.out.println("홍콩은 스타킹 밀크티라고 진하면서 시큼한 맛이 난대");
        else if(answer2 ==2)
            System.out.println("영국은 달콤하고 향이 강해서 라떼류 좋아하면 여기로!");
        else if(answer2 ==3)
            System.out.println("인도는 향신료가 워낙 많아서 마살라 티 같은 것도 마시면 좋을걸?");
        else if(answer2 ==4)
        System.out.println("대만은 여러가지 맛의 밀크티가 많고 싸서 골라마시는 재미가 있지롱!");


    }


}
