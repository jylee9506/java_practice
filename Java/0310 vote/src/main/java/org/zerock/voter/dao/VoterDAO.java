package org.zerock.voter.dao;

import org.zerock.voter.domain.VoterVO;

public class VoterDAO {

    private VoterVO[] arr;

    public VoterDAO(){
        arr= new VoterVO[4];
        arr[0] = new VoterVO(1,"홍길동");
        arr[1] = new VoterVO(2,"고길동");
        arr[2] = new VoterVO(3,"박길동");
        arr[3] = new VoterVO(4,"이길동");
    }

    public VoterVO getOne(Integer vno){
        VoterVO result = null;

        for (VoterVO vo:arr) {
            if(vo.getVno() == vno){
                result = vo;
                break;
            }
        }

        return result;
    }


    public void check(Integer voter) throws Exception{
    }
}
