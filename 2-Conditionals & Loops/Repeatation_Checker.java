public class Repeatation_Checker {
    public static void main(String[] args) {
    int n = 5435215;
    int count = 0;
    //We are checking for number 5 repeatation here
    while(n > 0){
        int rem = n%10;
        if(rem == 5){
            count++;
        }
        n = n/10;
    }
        System.out.println(count);
    }
}
