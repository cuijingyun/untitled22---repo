package test;
import java.util.Scanner;

// 定义People类，代表格斗游戏中的角色
public class People {
    // 代表角色的编号
    private int number;
    // 代表角色的血量
    private int blood;

    // 获取血量的方法
    public int getBlood() {
        return blood;
    }

    // 设置血量的方法
    public void setBlood(int blood) {
        this.blood = blood;
    }

    // 获取编号的方法
    public int getNumber() {
        return number;
    }

    // 设置编号的方法
    public void setNumber(int number) {
        this.number = number;
    }

    // 带参构造函数，用于初始化角色的血量和编号
    public People(int blood, int number) {
        this.blood = blood;
        this.number = number;
    }

    // 无参构造函数
    public People() {
    }

    // 攻击方法，被攻击方血量减少damage值
    public void attack(People opponent, int damage) {
        int opponentBlood = opponent.getBlood();
        opponentBlood -= damage;
        if (opponentBlood < 0) {
            opponentBlood = 0;
        }
        opponent.setBlood(opponentBlood);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入乔峰的初始血量：");
        int qiaofengBlood = scanner.nextInt();

        System.out.println("请输入鸠摩智的初始血量：");
        int jiumozhiBlood = scanner.nextInt();

        // 创建乔峰角色，假设编号为1
        People qiaofeng = new People(qiaofengBlood, 1);
        // 创建鸠摩智角色，假设编号为2
        People jiumozhi = new People(jiumozhiBlood, 2);

        // 模拟战斗过程
        qiaofeng.attack(jiumozhi, 20); // 乔峰攻击鸠摩智，造成20点伤害
        System.out.println("乔峰攻击鸠摩智，造成20点伤害，鸠摩智剩余血量：" + jiumozhi.getBlood());

        jiumozhi.attack(qiaofeng, 15); // 鸠摩智攻击乔峰，造成15点伤害
        System.out.println("鸠摩智攻击乔峰，造成15点伤害，乔峰剩余血量：" + qiaofeng.getBlood());

        // 持续模拟攻击，直到一方血量为0
        while (qiaofeng.getBlood() > 0 && jiumozhi.getBlood() > 0) {
            int qiaofengDamage = (int) (Math.random() * 20 + 1);
            qiaofeng.attack(jiumozhi, qiaofengDamage);
            System.out.println("乔峰攻击鸠摩智，造成" + qiaofengDamage + "点伤害，鸠摩智剩余血量：" + jiumozhi.getBlood());
            if (jiumozhi.getBlood() == 0) {
                System.out.println("乔峰K.O.了鸠摩智");
                break;
            }

            int jiumozhiDamage = (int) (Math.random() * 20 + 1);
            jiumozhi.attack(qiaofeng, jiumozhiDamage);
            System.out.println("鸠摩智攻击乔峰，造成" + jiumozhiDamage + "点伤害，乔峰剩余血量：" + qiaofeng.getBlood());
            if (qiaofeng.getBlood() == 0) {
                System.out.println("鸠摩智K.O.了乔峰");
                break;
            }
        }

        scanner.close();
    }
}