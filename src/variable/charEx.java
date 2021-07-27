package variable;

public class charEx {
//    char c4=' ';
    char c4='\u0000';

    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'h';
        char c3 = 'a';
        charEx ce  =  new charEx();
        // char의 기본값은 공백
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        System.out.println();
        System.out.print("Take on Me");
        System.out.println(Integer.parseInt("123"));
        System.out.println(c1+1);
        System.out.println(c1+1);

    }
}

// short(2byte), char(2byte)는 음수가 없다