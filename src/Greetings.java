public class Greetings {
    public static void main(String[] args) {
        String alininCevabi = ali(1, "babacigim");
        System.out.println(alininCevabi);

//        String alininAnnesineCevabi = ali();
//        System.out.println(alininCevabi + "annecigim");
//
//        String alininAbisineCevabi = ali();
//        System.out.println(alininCevabi + "abicigim");
    }

    //    public static String ali(String hitap) {
//    return "Efendim" + hitap ;
    public static String ali(int gunNumarasi, String hitap) {


        {
            if (gunNumarasi == 1) {
                return "Buyur " + hitap;
            } else {
                return "Efendim" + hitap;

            }
        }
    }
}

        //        int [] numbers = {1,2,3};
//        prn (numbers);
//        for (int num:numbers)
//            System.out.println(num);
//    }
//    public static void prn(int[] nums){
//        nums[0] = 100;
//        for (int num:nums);
//        System.out.println(num);
//
//        }
//
//        }
//
//
