package variable;

//import ...


//public class BooleanEx {
//    boolean power; //선언만 가능
//
//    //    power = false; 멤버변수에서 초기화만 따로 할 수 없다.
//    void turn() {
//        boolean onOff; //지역변수에서는 선언과 초기화를 따로 할 수 있다.
//        onOff = true;
//        power = !power;
//        System.out.println(power);
//    }
//    public static void main(String[] args) {
//        //new를 만나면 멤버변수가 기본값으로 초기화가 된다.
//        BooleanEx booleanEx = new BooleanEx();
//        booleanEx.turn();
//        booleanEx.turn();
//        booleanEx.turn();
//        booleanEx.turn();
//
//    }
//
//}
//
//class Myfrm extends JFrame {
//    private JButton btnConfirm;
//    public Myfrm() throws HeadlessException {
//        btnConfirm = new JButton("확인");
//        setLayout(null);
//        btnConfirm.setBounds(100, 50, 100, 100);
//        add(btnConfirm);
//        setSize(500, 400);
//        setVisible(true);
//
//    }
//}

public class BooleanEx {
    static Boolean power;

    static void turn() {
        if(power) {
            power = false;
        } else {
            power = true;
        }
        System.out.println(this + "전원이 " + power + " 되었습니다.");
        // this : 자신이 속한 클래스(class)
    }

    public static void main(String[] args) {
//        power = true;
        BooleanEx b = new BooleanEx();
//        b.power = false;
//        b.turn();
        b.turn();
        b.turn();
        BooleanEx b1 = new BooleanEx();
        b1.turn();
        Tv tv = new Tv();
        tv.turn();

    }
    // static은 따로 저장되 있어서 먼저 실행
}

class Tv {
    String model;
    String maker;

    int channel;
    //자바에서 연산할 때 4바이트 단위로 연산하기 떄문에 int를 많이 쓴다.
    boolean power;
    int volume;

    void turn() {
        power = power ? false : true;
    }
    void channel() {

    }
    void volup() {

    }
    void volDown() {

    }
}