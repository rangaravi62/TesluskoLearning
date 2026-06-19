package ExceptionHandling_35.RunTimeError;


public class Stackoverflow {
    //Stack runs out of space*(Stack Frames) and gives stackoverflow error ---> Run time error

    public static void main(String[] args)  {
            disp();
    }

    static void disp(){
        disp();
    }
}
