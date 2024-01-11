package com.hspedu.houserent.view;

import com.hspedu.houserent.domain.House;
import com.hspedu.houserent.service.HouseService;
import com.hspedu.houserent.utils.Utility;

/**
 * 1.显示界面
 * 2.接收用户输入
 * 3.调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {

    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接收用户选择
    private HouseService houseService = new HouseService(2);//设置数组的大小为10

    //根据id修改房屋信息
    public void update() {
        System.out.println("========================修改房屋信息========================");
        System.out.println("请选择待修改房屋编号(-1表示退出): ");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("========================放弃修改========================");
            return;
        }
        //根据输入得到updateId,查找对象
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("========================编号不存在========================");
            return;
        }
        System.out.print("姓名(" + house.getName() + "): ");
        String name = Utility.readString(8, "");//这里如果用户直接回车,表示不修改信息,默认""
        if (!"".equals(name)) {//接收的name不是""(空), 要修改
            house.setName(name);
        }

        System.out.print("电话(" + house.getPhone() + "): ");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }

        System.out.print("地址(" + house.getAddress() + "): ");
        String address = Utility.readString(18, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }
        System.out.print("租金(" + house.getRent() + "): ");
        int rent = Utility.readInt(-1);//默认值 -1
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.print("状态(" + house.getState() + "): ");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }
        System.out.println("=========修改成功=========");
    }

    //查找房屋 根据id
    public void findHouse() {
        System.out.println("========================查找房屋信息========================");
        System.out.print("请输入要查找的id: ");
        int findId = Utility.readInt();
        //调用方法
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("========================id不存在========================");
        }
    }


    //完成退出确认
    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    //编写delHouse() 接收输入的id,调用del()
    public void delHouse() {
        System.out.println("========================删除房屋信息========================");
        System.out.print("请输入待删除房屋的编号(-1退出): ");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("========================放弃删除========================");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("========================删除成功========================");
            } else {
                System.out.println("========================删除失败:房屋编号不存在========================");
            }
        } else {
            System.out.println("========================放弃删除========================");
        }
    }


    //编写addHouse() 接收输入,创建House对象,调用add()
    public void addHouse() {
        System.out.println("========================添加房屋========================");
        System.out.print("姓名: ");
        String name = Utility.readString(8);
        System.out.print("电话: ");
        String phone = Utility.readString(12);
        System.out.print("地址: ");
        String address = Utility.readString(16);
        System.out.print("月租: ");
        int rent = Utility.readInt();
        System.out.print("状态: ");
        String state = Utility.readString(3);
        //创建一个新的House对象, 注意 id 是系统 分配的
        House newhouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newhouse)) {
            System.out.println("========================添加房屋成功========================");
        } else {
            System.out.println("========================添加房屋失败========================");
        }
    }


    //编写listHouses() 显示房屋列表
    public void listHouses() {
        System.out.println("========================房屋列表========================");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {//有很多空值
            if (houses[i] == null) {//如果是空的,就不显示
                break;//
            }
            System.out.println(houses[i]);
        }
        System.out.println("========================房屋列表显示完毕========================");
    }


    //显示主菜单
    public void mainMenu() {

        do {
            System.out.println("\n========================房屋出租系统菜单========================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退       出");
            System.out.print("请输入你的选择(1-6): ");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);

    }
}
