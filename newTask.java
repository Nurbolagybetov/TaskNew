package assignment1;

import java.util.Scanner;

    public class newTask {
        public static void main(String[] arg){
            Scanner sc = new Scanner(System.in);
            String n = sc.nextLine();
            System.out.println(convert(n));
        }

        public static String convert(String n){
            if(n.isEmpty()){
                return n;
            }
            else{
                char a = Character.toUpperCase(n.charAt(0));
                String restofit = convert(n.substring(1));
                return a + restofit;
            }
        }
    }



