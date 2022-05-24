public class homewoork {
    public static void main(String[] args) {
        //Task220
        //       int[] array = {1, -4, 5, -6, 7, 9, -11};
//        int positive = 0;
//        int negative = 0;
//        for (int i = 0; i <array.length; i++) {
//            if(array[i]<=0){
//                negative++;
//            }else {
//                positive++;
//            }
//        }
//        System.out.println("negative="+negative+":positive="+positive);


        //task221
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum+= array[i];
//        }
//        System.out.println(sum);

        //int[] array = {1, -4, 5, -6, 7, 9, -11};

        //task222
//        int artadryal = 1;
//        for (int i = 0; i < array.length; i++) {
//            artadryal *= array[i];
//        }
//        System.out.println(artadryal);


        //Task223
//        int count=0;
//        for(int i=0;i<array.length;i++){
//            count=array.length;
//        }
//        System.out.println(count);

        //Task227
        int count = 0;
        int index = 0;
        int[] array = {1, 4, 5, 6, 7, 9, 11, 14, 15, 18, 19, 20};
        for (int i = 1; i < array.length; i++) {
            if (i % 2 != 0) {
                index += i;
                index++;
            } else {
                count = count + array[i];
                count++;
            }
        }
        System.out.println(count);


    }
}
