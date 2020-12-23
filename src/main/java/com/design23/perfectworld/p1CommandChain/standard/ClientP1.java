package com.design23.perfectworld.p1CommandChain.standard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientP1 {
    public static void main(String[] args) throws IOException {
        Invoker invoker = new Invoker();
        while (true) {
            //UNIX下的默认提示符号
            System.out.print("#");
            //捕获输出
            String input = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            //输入quit或exit则退出
            if (input.equals("quit") || input.equals("exit")) {
                return;
            }
            System.out.println(invoker.exec(input));
        }
    }
}

//#ls -l
//.
//..
//file1
//file2
//file3
//#ls -a
//.
//..
//file1
//file2
//file3
//#df -h
//命令无法执行
//#df -g
///	10
///usr	100
///home	t10000
//