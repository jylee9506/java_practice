package org.zerock.review;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class ReviewDTO {

    private int rno; // 리뷰번호
    private int sno; //가게번호
    private int score; // 점수


    //리뷰번호는 변겨
}