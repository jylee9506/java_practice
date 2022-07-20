package org.zerock.voter.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.zerock.voter.dao.VoterDAO;
import org.zerock.voter.domain.VoterVO;

@RequiredArgsConstructor
public class VoterService {

    @NonNull
    private VoterDAO voterDAO;

    public VoterVO readOne(Integer vno)throws Exception{
        VoterVO voter = voterDAO.getOne(vno);

        if(voter == null){
            throw new Exception("Voter is null");
        }

        return voter;
    }

}
