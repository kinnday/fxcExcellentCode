package com.design23.perfectworld.p1CommandChain.standard.ls;

import com.design23.perfectworld.p1CommandChain.standard.CommandVO;

public class LS_A extends AbstractLS {
    //ls -a命令
    protected String echo(CommandVO vo) {
        return FileManager.ls_a(vo.formatData());
    }

    protected String getOperateParam() {
        return super.A_PARAM;
    }
}
