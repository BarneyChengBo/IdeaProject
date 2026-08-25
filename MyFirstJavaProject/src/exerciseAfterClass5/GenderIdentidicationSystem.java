package exerciseAfterClass5;

public class GenderIdentidicationSystem {
    public static void main(String[] args) {
        String personNumber = "19880908-3458";

        // 1. 获取字符串的总长度
        int numberLength = personNumber.length();

        // 2. 计算倒数第二位的索引 (长度 - 2)
// 比如长度是11，索引就是9。
// 索引: 0123456789(目标)10
        int targetIndex = numberLength - 2;

// 3. 提取该位置的字符
        char secondToLast = personNumber.charAt(targetIndex);
        // 4. (可选) 将字符转换为整数进行奇偶判断
// Character.getNumericValue 是 Java 中将 char 转 int 的安全方法

        int digit = Character.getNumericValue(secondToLast);

        if ( digit % 2 == 0 ) {
            System.out.println("The gender with this person number is a woman.");
        } else {
            System.out.println("The gender with this person number is a man");
        }



    }
}
