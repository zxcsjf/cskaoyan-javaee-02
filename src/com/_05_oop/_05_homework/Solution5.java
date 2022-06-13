package com._05_oop._05_homework;

/**
 * 对象与类基础语法练习题 设计物品（Item）类
 * 它具有以下属性：名字、价格、类别  它具有以下行为：
 * 售卖。该方法需要传入一个参数表示购买使用的金钱，如果金钱足够则打印"xx物品被卖出"的信息，
 * 并将找零作为返回值。否则打印"金钱不足，购买失败"，并将"-1"作为返回值表示购买失败。
 * <p>
 * 类定义完毕后，试着创建三个对象并使用"对象名点"完成属性赋值：
 * "手机类的   Samsung Galaxy S21 8000元"
 * "家具类的   海尔冰箱 3000元"
 * "日用品类的  海飞丝洗发水 30元"
 * 然后自行调用一下售卖方法，测试一下。
 * <p>
 * 注：  不要将类定义在其它类的内部（内部类），在定义class时，一定要看清楚大括号！
 *
 * @author zxcsjf
 * @since 2022/06/10 19:03
 */
public class Solution5 {
    public static void main(String[] args) {
        // Item phone = new Item();
        // phone.name = "Samsung Galaxy S21";
        // phone.price = 8_000;
        // System.out.println(phone.sold(800));
        // System.out.println("----------");
        //
        // Item furniture = new Item();
        // furniture.name = "海尔冰箱";
        // furniture.price = 3_000;
        // System.out.println(furniture.sold(3_000));
        // System.out.println("----------");

        Item commodity = new Item();
        commodity.name = "海飞丝洗发水";
        commodity.price = 30;

        System.out.println(commodity.sold(25));

    }
}

class Item {
    String name = "潘婷";
   double price = 10;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, double price) {
        this(name);
        this.price = price;
    }

    public double sold(double money) {
        if (money >= price) {
            System.out.println(name + "物品被卖出");
            return money - price;
        }
        System.out.println(name + "金钱不足，购买失败");
        return -1;
    }
}

