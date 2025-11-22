public class Dayconversion {
    public static void main(String[]args){
        int TotalDays = 800;

        //CALCULATR YEAR,MONTH AND DAYS
        int years = TotalDays / 365;
        int remainingDays = TotalDays % 365;
        int month = remainingDays/30;
        int Days = remainingDays%30;

        //print result
        System.out.println("TotalDays: "+TotalDays);
        System.out.println("Equivalent to: "+years+"years,"+ month+"month and " + Days+ "Days");
    }
}