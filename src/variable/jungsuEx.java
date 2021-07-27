package variable;

import java.sql.SQLOutput;

public class JungsuEx {
    byte b1;
    short s1;
    int i1;
    long l1;

    public JungsuEx() {    } //초기화 byte 0, short 0, int 0, long 0l

    public static void main(String[] args) {
        JungsuEx j = new JungsuEx();
        //new는 참조형 변수에만 붙어서 초기화
        //class 이름에 ()붙은 것 생성자
        byte b2=0;
        System.out.println(j.b1);
        System.out.println(j.s1);
        System.out.println(j.i1);
        System.out.println(j.l1);
        System.out.println(b2);
        System.out.println(j.b1+b2);
        System.out.println(j.b1+j.s1);
        j.i1=130+j.s1;
        j.s1=(short)j.i1; //큰데서 작은데로 (명시적 형변환)
        j.i1=(int)j.s1; //작은데서 큰데로(묵시적 형변환 => 생략가능)
        j.i1=j.s1;
        System.out.println(j.i1);
        j.l1=10_000_000_000L;
        System.out.println(j.l1);

    }
}
