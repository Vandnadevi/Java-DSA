package Java;

public class Loops {
    public static void main(String[] args) {

        // for loop

        // start from 152 and end on 154

//        for(int i = 152; i <= 154; i++){
//            System.out.println(i);
//            System.out.println("Iteration completed");
//        }
        int start = 152;
        int end = 154;

        while( end >= start){
            System.out.println(end);
            end--;
        }
    }
}
