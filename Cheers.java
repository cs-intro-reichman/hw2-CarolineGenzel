// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	   String name= args[0];
           name= name.toUpperCase();
           int cheers=Integer.parseInt(args[1]);
           String anLetters = "AEFHILMNORSX";
          for(int j=0;j<name.length();j++) {
                char ch= name.charAt(j);
                if (anLetters.indexOf(ch)!= -1)
                {
                        System.out.println("Give me an "+ name.charAt(j)+": "+ name.charAt(j)+"!");
                }
                else System.out.println("Give me a  "+ name.charAt(j)+": "+ name.charAt(j)+"!");
           
           }
           System.out.println("What does that spell?");
           for(int i=0;i<cheers;i++){
                System.out.println(name+"!!!");
           }
        }
}
