package org.zerock.candidate.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.candidate.dao.CandidateDAO;
import org.zerock.candidate.domain.CandidateVO;

import java.util.Arrays;

public class ServiceTest {

    private CandidateService service;

    @BeforeEach
    public void ready(){

        CandidateDAO dao = new CandidateDAO();
        service = new CandidateService(dao);
    }

    @Test
    public void test1(){
        Assertions.assertNotNull(service);
    }
    @Test
    public void testReadAll(){

        CandidateVO[] arr = service.readAll();

        for (CandidateVO vo: arr) {
            System.out.println(vo);
        }

    }
    @Test
    public void read후보자읽기(){
        Arrays.stream(service.readAll()).forEach(vo -> System.out.println(vo));
    }
}
