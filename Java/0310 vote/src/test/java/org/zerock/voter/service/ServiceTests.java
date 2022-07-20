package org.zerock.voter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.voter.dao.VoterDAO;
import org.zerock.voter.domain.VoterVO;

public class ServiceTests {

    private VoterService voterService;

    @BeforeEach
    public void ready(){
        voterService = new VoterService(new VoterDAO());

    }

    @Test
    public void testReadOne() {
        VoterVO vo = null;
        try {
            vo = voterService.readOne(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertNull(vo);
    }
}
