package com.design23.grop2structure.s5Combine.simple;

import java.util.ArrayList;

//场景类中main方法没有变动，
// 遍历组织机构树的getTreeInfo稍有修改，就是把用到ICorp接口的地方修改为Corp抽象类，仅仅修改了粗体部分，其他保持不变，运行结果相同。这就是组合模式。
public class ClientS5Simple {

    //遍历整棵树,只要给我根节点，我就能遍历出所有的节点
    public static String getTreeInfo(Branch root) {
        ArrayList<Corp> subordinateList = root.getSubordinate();
        String info = "";
        for (Corp s : subordinateList) {
            if (s instanceof Leaf) {
                //是员工就直接获得信息
                info = info + s.getInfo() + "\n";

            } else {
                //是个小头目
                info = info + s.getInfo() + "\n" + getTreeInfo((Branch) s);
            }
        }
        return info;
    }

}
