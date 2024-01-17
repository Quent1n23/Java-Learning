package com.hspedu.homework;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {

        String name = "jack";
        String pwd = null;
        String email = "jack@sohu.com";
        try {
            userRegister(name, pwd, email);
            System.out.println("恭喜你注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    //输入用户名,密码,邮箱,如果信息录入正确,则提示注册成功,否则生成异常对象
    //用户名长度 2,3,4
    //密码长度6,要求全是数字
    //邮箱中包含 @和.  并且@在.前面

    public static void userRegister(String name, String pwd, String email) {

        //另外一些校验
        if (!(name != null && pwd != null & email != null)) {
            throw new RuntimeException("参数不能为空");
        }


        //name
        int userLength = name.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("用户名长度应该为2,3,4");
        }
        //pwd
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("要求密码长度6,且全是数字");
        }
        //email
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("要求邮箱中包含'@'和'.'并且'@'在'.'前面");
        }

    }

    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
