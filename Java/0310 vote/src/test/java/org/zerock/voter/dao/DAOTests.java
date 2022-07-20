package org.zerock.voter.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DAOTests {

    private VoterDAO dao;

    @BeforeEach
    public void ready(){
        dao = new VoterDAO();
    }

    @Test
    public void test(){
        Assertions.assertEquals(dao.getOne(1).getName(),"이종영");
        Assertions.assertNull(dao.getOne(10));
    }
}
