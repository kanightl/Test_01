package com.neuedu.work.TEST;

public class TestRestaurant {
    public static void main(String[] args) {
        Bill[] m = {
                new Bill("东北锅包肉", 35, 1),
                new Bill("东北大拉皮", 18, 1),
                new Bill("火山飞雪", 15, 2)
        };
        System.out.println("————————————————————————————————");
        System.out.println("菜单价格" + "       " + "数量");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].getName() + "         " + m[i].getPrice() + "元" + "              " + m[i].getNum());
        }
        System.out.println("————————————————————————————————");
        int sum = 0;
        for (int j = 0; j < m.length; j++) {
            sum += m[j].Price(m[j].getPrice(), m[j].getNum());
        }
        System.out.println("共计消费：" + sum + "元");
    }
}

class Menu {
    private String name;
    private int price;

    Menu() {
    }

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Bill extends Menu {
    private int num;

    Bill() {
    }

    public Bill(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Bill(String name, int price, int num) {
        super(name, price);
        this.num = num;
    }

    public int Price(int p, int n) {
        p = super.getPrice();
        n = this.num;
        return p * n;
    }
}
