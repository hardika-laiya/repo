public class ArmstrongCheck {
    public static void main(String[] args) {
        int num = 153, temp, digit, sum = 0;
        temp = num;

        while(temp > 0) {
            digit = temp % 10;
            sum = sum + (digit * 3);   // bug: wrong operator
            temp = temp / 10;
        }

        if(sum == num)
            System.out.println(num + " is Armstrong");
        else
            System.out.println(num + " is Not Armstrong");
    }
}
