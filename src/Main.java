import java.util.ArrayList;

/**
 * Created by Глеб on 13.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        for(int i = 100000; i <= 999999; i++){
            list.add(i);
        }
        for(Integer begun: list){
            int a = begun / 1000;
            int b = begun % 1000;
            int a1 = a / 100;
            int a2 = a / 10 % 10;
            int a3 = a % 10;
            int a4 = a1 + a2 + a3;
            int b1 = b / 100;
            int b2 = b / 10 % 10;
            int b3 = b % 10;
            int b4 = b1 + b2 + b3;
            if(a4 == b4){
                list1.add(begun);
            }
        }
        try{
            for (int i = 0; i < list1.size(); i = i + 20){
                for (int j = i; j < i + 20; j++){
                    System.out.print(list1.get(j) + " ");
                }
                System.out.println();
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println();
            System.out.println("Arrays size = " + list1.size());
            System.out.println("The end of the array");
        }

    }
}
