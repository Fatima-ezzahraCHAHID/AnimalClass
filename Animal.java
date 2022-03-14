public class Animal {
    public static String getDefaultGreeting(){
        return "Hello";
    }
    public static String getCatGreeting(){
        return "myaw";
    }
    public static void main(String[]args){
        String firstArguments=args[0];
        String output=" ";
        if(firstArguments.equalsIgnoreCase("cat")){
            output=getCatGreeting();
        }
        else{
            output=getDefaultGreeting();
        }
        System.out.println(output);
    }
}

