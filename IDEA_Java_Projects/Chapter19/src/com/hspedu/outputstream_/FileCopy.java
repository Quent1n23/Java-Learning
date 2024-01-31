package com.hspedu.outputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 丁聪
 * @version 1.0
 */
public class FileCopy {
    public static void main(String[] args) {
        //完成 文件拷贝，将 e:\\Koala.jpg 拷贝 c:\\
        //思路分析
        //1. 创建文件的输入流 , 将文件读入到程序
        //2. 创建文件的输出流， 将读取到的文件数据，写入到指定的文件.
        String srcFilePath = "e:\\a.txt";
        String desFilePath = "e:\\a2.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(desFilePath);
            //定义一个字节数组,提高效率
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1){
                //读取到后，就写入到文件 通过 fileOutputStream
                //即，是一边读，一边写
                fileOutputStream.write(buf,0,readLen);
            }
            System.out.println("拷贝成功~");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileInputStream!=null){
                    fileInputStream.close();
                }
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
