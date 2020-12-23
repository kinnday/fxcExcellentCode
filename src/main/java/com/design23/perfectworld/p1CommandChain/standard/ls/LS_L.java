package com.design23.perfectworld.p1CommandChain.standard.ls;

import com.design23.perfectworld.p1CommandChain.standard.CommandVO;

public class LS_L extends AbstractLS {
    //ls -l命令
    protected String echo(CommandVO vo) {
        return FileManager.ls_a(vo.formatData());
    }

    protected String getOperateParam() {
        return super.L_PARAM;
    }
}
