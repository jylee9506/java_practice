package org.zerock.review;

import lombok.AllArgsConstructor;
import org.zerock.store.StoreDTO;
import org.zerock.store.StoreLoader;

import java.util.Scanner;

@AllArgsConstructor
public class ReviewUI {

    private Scanner scanner; //외부 주입을 위한 작업
    private ReviewService reviewService;
    private StoreLoader storeLoader;


    public void play(){

        String oper = inputStr("1.리뷰등록, 2. 조회, 3. 종료");

        switch (oper){
            case "1":
                makeReview();
                break;
            case "2":
                findReview();
                break;
            case "3":
                break;

        }
        play();
    }

    private void findReview() {
        System.out.println("findReview");
        ReviewDTO[] reviewDTOS = reviewService.sortByScore();

        for (ReviewDTO review:reviewDTOS) {
            if(review == null){
                continue;
            }
            System.out.println(review);
        }
    }

    private void makeReview(){

        System.out.println("--------------------------------------");
        StoreDTO[] stores = storeLoader.getStores();

        for (StoreDTO store: stores)
        {
            System.out.println(store.getSno() + ":" + store.getName());
        }


//        System.out.println("가게번호를 입력하세요");
//        int sno = Integer.parseInt(scanner.nextLine());
        // 이 두가지를 계속 입력하기보다는 아래 input 으로 만들어 아래처럼 호출하는 느낌으로함

        int sno = input("가게번호를 입력하세요");
        int score = input("5점만점에 몇점?");

        ReviewDTO reviewDTO = ReviewDTO.builder()
                .sno(sno)
                .score(score)
                .build();

       int num = reviewService.add(reviewDTO);
        System.out.println(num + "번 리뷰가 등록되었습다");

        String oper = inputStr("계속하시겠습니까? Y/N");

        if(oper.equals("N")){
            return;
        }
        makeReview();
    }


    private int input(String msg){

//        System.out.println(msg);
//        int value = Integer.parseInt(scanner.nextLine());
        //이 두개를 또 줄이기
        int value = Integer.parseInt(inputStr(msg));
        return value;
    }

    private String inputStr(String msg){

        System.out.println(msg);
        String value = scanner.nextLine();
        return value;
    }

}
