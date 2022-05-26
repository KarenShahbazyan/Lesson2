import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;

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
//        int sum = 0;
//        int[] array = {1, 4, 5, 6, 7, 9, 11, 14, 15, 18, 19, 20};
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                sum += array[i];
//                i++;
//            }
//        }
//
//        System.out.println(sum);


//        //Task
//        Random random = new Random();
//        int[] array = new int[20];
//        for (int i = 0; i < 20; i++) {
//            array[i] = random.nextInt(100);
//        }
//
//        int max = 0;
//        int min = 0;
//        max = array[0];
//        min = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//            if (array[i] < min) {
//                min = array[i];
//            }
//            System.out.print(array[i] + " ");
//        }
//
//        System.out.println();
//        System.out.println("MAX:" + max + " MIN:" + min);


        //task231
        //      int[] array = {1, 4, -5, 6, 7, 9, -11, 14, 15, -18, 19, 20};
//        int count=0;
//        for(int i=0;i<array.length;i++){
//            if(array[i]%2==0){
//                count++;
//            }
//        }
//
//        System.out.println(count);
//Task232
//        int sum = 0;
//        int art = 1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                sum = sum + array[i];
//                art = art * array[i];
//            }
//        }
//        System.out.println(sum+" "+art);
//
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (i >= 0) {
//                count++;
//                sum = sum + array[i];
//            }
//        }
//        System.out.println(sum / count);
//Task 214
//        int[] array = {1, 4, -5, 6, 7, 9, -11, 14, 15, -18, 19, -20};
//        int count = 0;
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (i <=0) {
//                count++;
//                sum = sum+ array[i];
//            }
//        }
//        System.out.println(sum / count);

//Task216
//        int[] array = {1, 4, -5, 6, 7, 9, -11, 14, 15, -18, 19, -20};
//        int count=0;
//        int sum=0;
//        for (int i = 0; i < array.length; i++) {
//            if (i%2==0) {
//                count++;
//                sum=sum+array[i];
//            }
//        }
//        System.out.println(sum);

        //Task217

//        int[] array = {1, 4, -5, 6, 7, 9, -11, 14, 15, -18, 19, -20};
//        int count=0;
//        int art=1;
//        for (int i = 0; i < array.length; i++) {
//            if(i%2==0){
//                count++;
//                art=art*array[i];
//            }
//        }
//        System.out.println(art);

//        int[] array = new int [60];
//        int count=0;
//        int k=2;
//        for (int i = 0; i < array.length; i++) {
//            if(i%k==0){
//                count++;
//            }
//        }
//        System.out.println(count);


        //Task220


//        int[] array = {1, 4, -5, 6, 7, 9, -11, 14, 15, -18, 19, -20};
//        int countd = 0;
//        int countb = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                countb++;
//            } else {
//                countd++;
//            }
//        }
//        System.out.println(countb+" "+countd);


        //Task261


//        int[] x = {1, 3, 5, 9, 8};
//        int[] y = {10, 11, 13, 14};
//        int count = 0;
//        int count1 = 0;
//        int art=1;
//        for (int i = 0; i < x.length; i++) {
//            count=count+x[i];
//        }
//        for (int i = 0; i < y.length; i++) {
//            count1=count1+y[i];
//        }
//        System.out.println(count/x.length+" "+count1/y.length);
//        art=count/x.length*count1/y.length;
//        System.out.println(art);

//        int[] a={2,4,11,7};
//        int temp=0;
//        for (int i = 0; i < a.length / 2; i++) {
//            temp=a[i];
//            a[i]=a.length-1-i;
//            temp=a.length-1-i;
//
//        }
//        System.out.println(temp);//sxala

        int[][] array = {{11, 25, 17,4}, {41, 65, 22,10}, {12, 10, 79,13}, {18, 71, 24,15}};
        for(int i=0;i< array.length;i++){
            for (int j = 0; j < array[i].length; j++) {
                if(i>=j){
                    System.out.print(array[j][i]+" ");
                }else {
                    System.out.print(" ");}

            }
            System.out.println();
        }
    }
}
