public class Main implements Pult{
    public static void main(String[] args) {
//        Main main = new Main();
//        main.greeting();
//        int num = main.summ(5,7);
//        int num1 = Pult.num;
//        System.out.println(num);
        Pult1 pult1=(x) ->x.length()>5;
        System.out.println(pult1.chek("hello world"));
        System.out.println(pult1.chek("hello "));

    }
    public void greeting(){
        System.out.println("Hello world");
    }

    public int summ(int num1, int num2) {
        return num1 + num2;
    }
}


interface Pult{
    int num = 10;
    void greeting();
    int summ(int num1,int num2);
}
interface Pult1{
    boolean chek(String str);
}

interface Calc{
    int calculator(int num1,int num2);
}

