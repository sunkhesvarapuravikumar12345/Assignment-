public class Assignment {
    public static void main(String[] args)
    {
        char a='d';
        alphacase(a);
    }
    private static void  alphacase(char a) {
        if((a>'a') && (a<='z'))
        {
            System.out.println("lower case");
        }
        else if((a>='A') && (a<='z'))
        {
            System.out.println("Upper case");
        }
        else{
            System.out.println("not an alphabet");
        }
    }
}
