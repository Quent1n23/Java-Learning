package com.hspedu.exception_.try_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class TryCatchExercise03 {
    public static int method() {
        int i = 1;//1. i = 1

        try {
            i++;// 2. i = 2
            String[] names = new String[3];
            if (names[1].equals("tom")) {//3. 空指针异常
                System.out.println(names[1]);
            } else {
                names[3] = "hspedu";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {//4. 捕获
            //5.因为有finally, 不能马上执行return,所以先 ++i  i=3, 保存临时变量temp = 3
            return ++i; //8. return , 返回临时变量temp
        } finally {
            ++i; //6. i = 4
            System.out.println("i=" + i); // 7. i = 4
            // 由于finally中没有 return ,  必须要return
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
