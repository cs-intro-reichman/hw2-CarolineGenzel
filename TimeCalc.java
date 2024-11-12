public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd=Integer.parseInt(args[1]);
        int TotalMinutes = ( hours * 60 ) +minutes +minutesToAdd;
        int TotalHours= TotalMinutes / 60;
        int NewHours= TotalHours % 24;
        int NewMinutes= TotalMinutes - ( TotalHours * 60);
    
        if (NewHours <10 ){
            if (NewMinutes<10) {
                System.out.println("0"+NewHours+":"+"0"+NewMinutes);    
            }
            else System.out.println("0"+NewHours+":"+NewMinutes); }
        else if (NewMinutes<10) {
               System.out.println(NewHours+":"+"0"+NewMinutes); }
             else  System.out.println(NewHours+":"+NewMinutes); }
            
             
            
        }
