package com.neuedu.work.homework;

public class TestCompany {
    public static void main(String[] args) {
        ColaEmployee[] c1 = {
                new SalaryiedEmployee("tom", 6, 4000),
                new HourEmployee("jerry", 9, 300, 18),
                new SalaryEmployee("jack", 12, 6000, 0.8)};

        for (int i = 0; i < c1.length; i++) {
            Company c2 = new Company();
            c2.getsalary(c1[i], 7);
        }
    }
}

class ColaEmployee {
    String name;
    int birth;

    public ColaEmployee() {
    }


    public ColaEmployee(String name, int birth) {
        this.name = name;
        this.birth = birth;
    }

    public double getSalary(int month) {
        return 0;
    }

}

class SalaryiedEmployee extends ColaEmployee {
    double monthsalary;

    public SalaryiedEmployee() {
    }

    public SalaryiedEmployee(String name, int birth, double monthsalary) {
        super(name, birth);
        this.monthsalary = monthsalary;
    }

    @Override
    public double getSalary(int month) {
        if (month == super.birth) {
            return monthsalary + 100;
        } else {
            return monthsalary;
        }
    }
}

class HourEmployee extends ColaEmployee {
    private int hour;
    private double housalary;

    public HourEmployee() {
    }


    public HourEmployee(String name, int birth, int hour, double housalary) {
        super(name, birth);
        this.hour = hour;
        this.housalary = housalary;
    }

    @Override
    public double getSalary(int month) {
        if (month == super.birth) {
            if (hour > 160) {
                return hour * housalary + (hour - 160) * 1.5 * housalary + 100;
            } else {
                return housalary * hour + 100;
            }
        } else {
            if (hour > 160) {
                return hour * housalary + (hour - 160) * 1.5 * housalary;
            } else {
                return housalary * hour;
            }
        }
    }
}

class SalaryEmployee extends ColaEmployee {
    int salesvolume;
    double rate;

    public SalaryEmployee() {
    }

    public SalaryEmployee(String name, int birth, int salesvolume, double rate) {
        super(name, birth);
        this.salesvolume = salesvolume;
        this.rate = rate;
    }


    @Override
    public double getSalary(int month) {
        if (month == super.birth) {
            return salesvolume + (salesvolume * rate) + 100;
        } else {
            return salesvolume + (salesvolume * rate);
        }
    }
}

class Company {
    ColaEmployee c = new ColaEmployee();

    public void getsalary(ColaEmployee c, int month) {
        System.out.println("出生在" + c.birth + "月的" + c.name + "的薪资为" + c.getSalary(month));
    }

}




















