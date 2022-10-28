package TMSTasks.Computer;

import java.util.Scanner;

public class Computer implements Random {
    private String cpu;
    private String hhd;
    private String ram;
    private int balanceIncl;
    private int countBalanceIncl = 0;
    private boolean computerStatus = false;

    public Computer(String cpu, String hhd, String ram, int balanceIncl) {
        this.cpu = cpu;
        this.hhd = hhd;
        this.ram = ram;
        this.balanceIncl = balanceIncl;
    }

    public void displayInfo() {
        if (this.balanceIncl <= 0) {
            System.out.println("CPU: " + cpu + ", HHD: " + hhd + ", RAM: " + ram + ", BALANCE INCL: " + (this.balanceIncl) + ", Computer Status: НЕИСПРАВЕН");
        } else {
            System.out.println("CPU: " + cpu + ", HHD: " + hhd + ", RAM: " + ram + ", BALANCE INCL: " + (this.balanceIncl) + ", Computer Status: " + computerStatus);
        }
    }

    public void computerTurnOnOff() {
        if (this.balanceIncl > 0) {
            if (!computerStatus) {
                System.out.println("Неисправность системы: введите число 0 или 1");
                Scanner sc = new Scanner(System.in);
                if (sc.nextInt() != random()) {
                    computerStatus = true;
                    System.out.println("Неисправность устранена");
                    System.out.println("Компьютер включен");

                } else {
                    this.balanceIncl = 0;
                    System.out.println("ОШИБКА СИСТЕМЫ, КОМПЬЮТЕР СГОРЕЛ");
                }
            } else {
                computerStatus = false;
                System.out.println("Компьютер выключен");
                countBalanceIncl++;
                this.balanceIncl = balanceIncl - countBalanceIncl;
            }
        } else {
            System.out.println("ОШИБКА СИСТЕМЫ, Ресурс компьютера истощён");
        }

    }
}
