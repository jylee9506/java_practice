package org.zerock;

import org.zerock.candidate.dao.CandidateDAO;
import org.zerock.candidate.service.CandidateService;
import org.zerock.vote.dao.VoteDAO;
import org.zerock.vote.service.VoteService;
import org.zerock.vote.ui.VoteUI;
import org.zerock.voter.dao.VoterDAO;
import org.zerock.voter.service.VoterService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CandidateDAO candidateDAO = new CandidateDAO();
        VoterDAO voterDAO = new VoterDAO();
        VoteDAO voteDAO = new VoteDAO();

        CandidateService candidateService = new CandidateService(candidateDAO);
        VoterService voterService = new VoterService(voterDAO);
        VoteService voteService = new VoteService(voterDAO, candidateDAO,voteDAO);

        VoteUI voteUI = new VoteUI(voteService,voterService,candidateService, new Scanner(System.in));

        voteUI.voteDisplay();


    }
}
