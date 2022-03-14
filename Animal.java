public class Animal {
    public static String getDefaultGreeting(){
        return "Hello";
    }
    public static String getBirdGreeting(){
        return "how";
    }
    public static void main(String[]args){

        String firstArguments=args[0];
        String output=" ";
        if(firstArguments.equalsIgnoreCase("bird")){
            output=getBirdGreeting();
        }
        else{
            output=getDefaultGreeting();
        }
        System.out.println(output);
    }
}
