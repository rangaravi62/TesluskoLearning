package ExceptionHandling_35;


public class Stackoverflow {
    //Stack runs out of space and gives stackoverflow error ---> Run time error

    public static void main(String[] args)  {
            disp();
    }

    static void disp(){
        disp();
    }
}
