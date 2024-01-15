package com.hspedu.exception_.try_;


/**
 * @author 丁聪
 * @version 1.0
 *
 * 捕获多个异常时,要求 子类异常 写在 父类异常 前面
 */
public class TryCatchDetail02 {
    public static void main(String[] args) {

        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;
        } catch (NullPointerException e){//子类异常,空指针
            System.out.println("空指针异常="+ e.getMessage());
        }catch (ArithmeticException e){//子类异常,算数异常
            System.out.println("算数异常="+e.getMessage());
        }catch (Exception e) {//父类异常
            System.out.println(e.getMessage());
        } finally {

        }

    }
}

class Person{
    private String name = "jack";

    public String getName() {
        return name;
    }
}