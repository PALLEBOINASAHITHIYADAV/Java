import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String name = sc.nextLine();
        String lower = name.toLowerCase();
        int count =0;
        for(int i =0;i<=lower.length()-1;i++){
            char ch = name.charAt(i);
             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                 count ++;
             }
            
            
        }
         System.out.println(count);
        
        
        sc.close();
        }
}
