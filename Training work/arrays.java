public class arrays {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        //scanner.nextInt();
        int array10[] = {2, 4, 6, 3, 5, 8, 7, 9, 1, 13};
        int sum;
        sum = sumOfArray(array10);
        System.out.println(sum);
    }

    static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i ++)
            sum = arr[i] + sum;
        return sum;
    }
}