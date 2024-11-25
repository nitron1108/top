import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main implements Pult {
    public static void main(String[] args) {
//        Main main = new Main();
//        main.greeting();
//        int num = main.summ(5,7);
//        int num1 = Pult.num;
//        System.out.println(num);
        Pult1 pult1 = (x) -> x.length() > 5;
        System.out.println(pult1.chek("hello world"));
        System.out.println(pult1.chek("hello "));


//        Animal<Integer> an1 = new Animal<>();
//        an1.name = 123;
//        Animal<Boolean> an2 = new Animal<>();
//        an2.name = false;

//        int[] array=new int[5];
        Random random = new Random();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new LinkedList<>();
        for (int i = 0; i <= 1_000_000; i++) {
            l1.add(i);
        }
        for (int i = 0; i <= 1_000_000; i++) {
            System.out.println(
                    i + "- " + l1.get(random.nextInt(1_000_000))
            );

        }


    }

    public void greeting() {
        System.out.println("Hello world");
    }

    public int summ(int num1, int num2) {
        return num1 + num2;
    }
}


interface Pult {
    int num = 10;

    void greeting();

    int summ(int num1, int num2);
}

interface Pult1 {
    boolean chek(String str);
}

interface Calc {
    int calculator(int num1, int num2);
}

