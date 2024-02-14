package com.ohgiraffers.section01.array;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. 배열을 사용하는 예시를 이해하고 적용해보자 */
        /* 필기. 랜덤한 카드를 한 장 뽑아서 출력해보자 */

//        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
//        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};
//
//        int randomShapeIndex = (int)(Math.random() * shapes.length);
//        int randomCardNumberIndex = (int)(Math.random() * cardNumbers.length);
//
//        System.out.println("당신이 뽑은 카드는 ? " + shapes[randomShapeIndex] + " " + cardNumbers[randomCardNumberIndex] + "카드 입니다.");
//
//

        String[] dialects = {"문디", "쌔쓰개", "빤닥새", "서울까투리"};
        String[] dialects2 = {"개드사리", "째깐한입주댕이", "찌끄래기", "찐찌버거"};

        int randomdialects = (int)(Math.random() * dialects.length);
        int randomdialects2 = (int)(Math.random() * dialects2.length);
        System.out.println("당신은 " + dialects[randomdialects] + "이고, " + dialects2[randomdialects2] + "입니다.");

        String[] drinks = {"라떼", "스무디", "밀크티", "술", "물", "오줌"};
        String[] warmth = {"따뜻하게", "차갑게", "미지근하게", "연하게", "진하게"};

        int randomdrinks = (int)(Math.random() * drinks.length);
        int randomwarmth = (int)(Math.random() * warmth.length);

        System.out.println("저는 " + drinks[randomdrinks] + " 주시고요, " + warmth[randomwarmth] + " 만들어 주세요.");

    }
}
