package org.zerock.candidate.dao;

import org.zerock.candidate.domain.CandidateVO;

public class CandidateDAO {

    private CandidateVO[] arr;

    public CandidateDAO(){

        arr = new CandidateVO[3];
        arr[0] = new CandidateVO(1,"곽두팔");
        arr[1] = new CandidateVO(2,"김두한");
        arr[2] = new CandidateVO(3,"진무광");
    }

    public CandidateVO[] getAll(){
        return arr.clone();
    }

    public void check(Integer candidate) throws Exception{

        for (CandidateVO vo: arr) {
            if(candidate == vo.getCno()){
                return;
            }
        }
        throw new Exception("Cannot find candidate");

    }
}
