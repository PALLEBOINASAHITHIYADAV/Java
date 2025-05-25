class Main {
    public static void main(String[] args) {
        String s = "abbas";
        int n=s.length();
        boolean palindrome = true;
        for(int i=0;i < s.length()/2 ;i++){
           
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}