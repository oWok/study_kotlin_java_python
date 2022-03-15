import java.util.Arrays;

public class Main {
    public static void main(String[] agrs) {



        // 삽입 정렬
        System.out.println("삽입정렬");

        int[] arr_num = randomNum();
        System.out.println(Arrays.toString(arr_num));

        for(int i=1;i<arr_num.length;i++) {
            int temp = arr_num[i];
            int prev = i-1;
            while (prev >= 0 && arr_num[prev] > temp) {
                arr_num[prev + 1] = arr_num[prev];
                prev--;
            }
            arr_num[prev+1] = temp;

            System.out.println(i + " 회전 : " + Arrays.toString(arr_num));
        }

        System.out.println(Arrays.toString(arr_num));

        //버블정렬
        System.out.println("버블정렬");

        arr_num = randomNum();
        System.out.println(Arrays.toString(arr_num));

        for(int i=1;i<arr_num.length-1;i++) {
            for(int j=0;j<arr_num.length-i;j++){
                if(arr_num[j] > arr_num[j+1])
                    swap(arr_num,j,j+1);
            }
            System.out.println(i + " 회전 : " + Arrays.toString(arr_num));
        }

        System.out.println(Arrays.toString(arr_num));

        //선택 정렬
        System.out.println("선택정렬");


        arr_num = randomNum();
        System.out.println(Arrays.toString(arr_num));

        for(int i=0;i<arr_num.length-1;i++) {
            int check = arr_num[i];
            int check_turn = -1;

            for(int j=i+1;j<arr_num.length;j++) {
                if(check > arr_num[j]) {
                    check = arr_num[j];
                    check_turn = j;
                }
            }

            if(check_turn != -1) {
                swap(arr_num,i,check_turn);
            }

            System.out.println(i+1 + " 회전 : " + Arrays.toString(arr_num));
        }

        System.out.println(Arrays.toString(arr_num));

    }

    static int[] randomNum() {
        int arr_num[] = new int[5];

        for(int i = 0;i<5;i++) {
            arr_num[i] = (int) (Math.random() * 100 + 1);
        }

        return arr_num;
    }

    static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

}
