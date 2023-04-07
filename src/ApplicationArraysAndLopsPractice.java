public class ApplicationArraysAndLopsPractice {
    public static void main(String[] args) {

        manipulate();

        System.out.println("main.1.kod satiri");
        System.out.println("main.2.kod satiri");
        System.out.println("main.3.kod satiri");

        System.out.println("main.4.kod satiri");
        System.out.println("main.5.kod satiri");
    }

    private static void manipulate() {
        System.out.println("manipulate.1. kod satiri");
        testFunc();
        System.out.println("manipulate.2. kod satiri");
    }
    private static void testFunc(){
        System.out.println("testFunc.1. kod satiri");
        System.out.println("testFunc.2. kod satiri");
    }
}

//        int a = 4;
//
//        manipulate(a);
//
//        System.out.println("a Deger: " + a);
//    }
//    private static void manipulate(int inputVal) {
//
//        inputVal = 100;
//        System.out.println("inputVal Deger: " + inputVal);

//        int[] values = {10, 20, 30, 40, 50};
//        int[] numbers = new int[5];
//        numbers = values;
//        numbers[2] = 1;
//        System.out.println("values[2]: " + values[2]);
//        System.out.println("numbers[2]: " + numbers[2]);
//        System.out.println("numbers[3]: " + numbers[3]);
//
//        int[] values = {10, 20, 30, 40, 50};
//        int[] numbers = new int[100];
//        int[] arr1, arr2, arr3;
//        arr1 = values;
//        arr2 = values;
//        arr3 = values;
//
//        numbers = values;
//        numbers[2] = 1;
//        System.out.println("values[2]: " + values[2]);
//        System.out.println("numbers[2]: " + numbers[2]);
//        System.out.println("numbers[3]: " + numbers[3]);

