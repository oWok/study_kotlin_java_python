import java.util.Arrays;

public class Main {
    public static void main(String[] agrs) {

        int[] arr_num = randomNum();
        System.out.println(Arrays.toString(arr_num));

        // 삽입 정렬
        for(int i=1;i<arr_num.length;i++) {
            int temp = arr_num[i];
            int prev = i-1;
            while (prev >= 0 && arr_num[prev] > temp) {
                arr_num[prev + 1] = arr_num[prev];
                prev--;
            }
            arr_num[prev+1] = temp;
        }

        System.out.println(Arrays.toString(arr_num));

        arr_num = randomNum();
        System.out.println(Arrays.toString(arr_num));

        //버블정렬
        for(int i=1;i<arr_num.length-1;i++) {
            for(int j=0;j<arr_num.length-i;j++){
                if(arr_num[j] > arr_num[j+1])
                    swap(arr_num,j,j+1);
            }
        }

        System.out.println(Arrays.toString(arr_num));

        arr_num = randomNum();
        System.out.println(Arrays.toString(arr_num));

        //선택 정렬
//        for(int )

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
