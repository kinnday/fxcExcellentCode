package com.design23.perfectworld.p1CommandChain.standard.df;

import com.design23.perfectworld.p1CommandChain.standard.Command;
import com.design23.perfectworld.p1CommandChain.standard.CommandVO;

public class DFCommand extends Command {
    public String execute(CommandVO vo) {
        return super.buildChain(AbstractDF.class).get(0).handleMessage(vo);
    }
}
