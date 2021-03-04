package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
//функция принимает два arrayList обязательного размера. В результате складывается два arraylist и выводится второй нетронутый

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 89, 3444, 56666, 677777, 888888));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2, 6, 8));
        ArrayList<Integer> result = merge(A, B);
        System.out.println(result);
    }

    public static void bubbleSort(ArrayList<Integer> al) {
        int n = al.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (al.get(j) > al.get(j + 1)) {
                    int temp = al.get(j);
                    al.set(j, al.get(j + 1));
                    al.set(j + 1, temp);
                }
            }
        }
    }

 static ArrayList<Integer> merge (ArrayList<Integer> A,
                                  ArrayList<Integer> B){
     ArrayList<Integer> C = new ArrayList<>();
     Integer counterA = 0, counterB = 0;
     for (int i = 0; i < 12; i++) {
         if (counterA == A.size()){
             C.add(i, B.get(counterB));
             counterB++;
         }
         else if (counterB == B.size()) {
             C.add(i, A.get(counterA));
             counterA++;
         }
         else if (A.get(counterA) < B.get(counterB)){
             C.add(i, A.get(counterA));
             counterA++;
         }
         else if (B.get(counterB) < A.get(counterA)){
             C.add(i, B.get(counterB));
             counterB++;
         }
     }
     return C;
 }
}
