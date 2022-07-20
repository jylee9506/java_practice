package org.zerock.candidate.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DAOTests {

    private CandidateDAO dao;

    @BeforeEach
    public void ready(){
        System.out.println("ready.....");
        dao = new CandidateDAO();
    }

    @Test
    public void test1(){

        Assertions.assertEquals(dao.getAll()[1].getName(),"윤석열");

        System.out.println(Arrays.toString(dao.getAll()));

    }

}
