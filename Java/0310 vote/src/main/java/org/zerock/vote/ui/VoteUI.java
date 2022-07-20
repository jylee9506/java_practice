package org.zerock.vote.ui;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.zerock.candidate.service.CandidateService;
import org.zerock.vote.domain.VoteVO;
import org.zerock.vote.service.VoteService;
import org.zerock.voter.service.VoterService;

import java.util.Arrays;
import java.util.Scanner;

@RequiredArgsConstructor
public class VoteUI {

    @NonNull
    private VoteService voteService;
    @NonNull
    private VoterService voterService;
    @NonNull
    private CandidateService candidateService;
    @NonNull
    private Scanner scanner;

    public void voteDisplay(){
        System.out.println("후보자들을 봅시다.");
        Arrays.stream(candidateService.readAll()).forEach(candidateVO -> System.out.println(candidateVO));

        System.out.println("유권자 번호를 입력하세요");
        Integer voterNum = Integer.parseInt(scanner.nextLine());

        try {
            voterService.readOne(voterNum);
        } catch (Exception e) {
            System.out.println("해당번호의 유권자가 없습니다. 다시 확인해 주세요");
            voteDisplay();
        }

        System.out.println("후보 번호를 입력하세요");
        Integer candidateNum = Integer.parseInt(scanner.nextLine());

        //후보자 번호를 확인 기능 필요

        VoteVO voteVO = new VoteVO(voterNum,candidateNum);

        try {
            voteService.vote(voteVO);
            System.out.println("정상적으로 투표가 완료 되었습니다.");

        } catch (Exception e) {
            System.out.println("투표에 문제가 생겼어요 ");
        }


        voteDisplay();
    }

}
