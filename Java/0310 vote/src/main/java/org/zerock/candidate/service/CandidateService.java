package org.zerock.candidate.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.zerock.candidate.dao.CandidateDAO;
import org.zerock.candidate.domain.CandidateVO;

@RequiredArgsConstructor
public class CandidateService {

    @NonNull
    private CandidateDAO candidateDAO;

    public CandidateVO[] readAll(){
        return candidateDAO.getAll();
    }
}
