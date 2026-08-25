package exercise8;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        SpellCheker sc = new SpellCheker();

        if(sc.isLetter('h')){
            System.out.println("H is a letter.");
        }

        if(sc.isLetter('=')){
            System.out.println("= is a letter.");
        }

        if(sc.isLetter('a')){
            System.out.println("A is a letter.");
        }

        if(sc.isLetter('ö')){
            System.out.println("Ö is a letter.");
        }

        if(sc.isLetter('X')){
            System.out.println("X is a letter.");
        }
        //Denna metod returnerar true om tecknet är en engelsk bokstav annars false


        //QianWen gives a upgraded version
        /*






package exercise8; // 保持你的包名一致

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // 1. 创建扫描器
        Scanner scan = new Scanner(System.in);

        // 2. 实例化 SpellCheker 对象 (假设你的类名拼写是 SpellCheker)
        SpellCheker sc = new SpellCheker();

        System.out.print("请输入一个字符: ");

        // 3. 读取整行输入 (防止用户只按回车导致报错)
        String input = scan.nextLine();

        // 4. 核心逻辑：检测长度是否为 1
        if (input.length() == 1) {
            // 提取第一个字符
            char userChar = input.charAt(0);

            // 5. 调用老师写的 isLetter 方法进行判断
            // 注意：这里传入的是 char 类型的 userChar
            if (sc.isLetter(userChar)) {
                System.out.println("结果: '" + userChar + "' 是一个英文字母。");
            } else {
                System.out.println("结果: '" + userChar + "' 不是英文字母。");
            }
        } else {
            // 如果用户输入了空行或者超过1个字符
            System.out.println("错误：请确保只输入了一个字符！");
        }

        scan.close();
    }
}
         */




    }
}
