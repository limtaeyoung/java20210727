package variable;

public class SilsuEx {
    public static void main(String[] args) {
        float f1 = 0.1f; //4byte
        double d1 = 0.1; //8byte 숫자 뒤 d or D 는 생략가능
        long l1 = 10_000_000_000L;
        f1 = l1; //표현범위가 float가 더 크기 때문에 묵시적 형변환
        l1 = (long) f1; //표현범위가 long이 작기 때문에 명시적 형변환
        System.out.println(f1);
        System.out.println(d1);
        final float PI = 3.141592f;
        System.out.println(PI);

    }
}
