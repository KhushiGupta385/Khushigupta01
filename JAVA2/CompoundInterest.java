public class CompoundInterest {
    public static void main(String[]args) {
        double principal = 10000;
        double rate = 5;
        int time = 3;
        int n = 4;

        // compound interest formula: A=P(1+r/n)^(n*t)
        double amount = principal * Math.pow(1+(rate /100/n), n*time);
        double CompoundInterest = amount - principal;

        //print results
        System.out.println("principal:"+ principal);
        System.out.println("Rate:"+rate+"%");
        System.out.println("Time:"+time+"years");
        System.out.println("Compound:"+n+"timesper year");
        System.out.println("CompoundInterest:"+CompoundInterest);
        System.out.println("Total Amount:"+ amount);
    }
}
