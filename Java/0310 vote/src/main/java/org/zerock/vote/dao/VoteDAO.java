package org.zerock.vote.dao;

import org.zerock.vote.domain.VoteVO;

import java.util.ArrayList;

public class VoteDAO {

    private ArrayList<VoteVO> voArrayList;

    public VoteDAO(){
        voArrayList = new ArrayList<>();
    }

    public void add(VoteVO voteVO){
        voArrayList.add(voteVO);
    }

    public ArrayList<VoteVO> getResult(){

        return (ArrayList<VoteVO>) voArrayList.clone();

    }


    public void checkVoter(Integer voter) throws Exception {
    }
}
