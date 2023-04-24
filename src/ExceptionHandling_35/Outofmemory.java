package ExceptionHandling_35;

public class Outofmemory {

//    Array requires cantagious memory locations of data here -> 8 * 999999999 bytes
//        of memory is required which is not available in heap ,so it throws out of memory error.

    public static void main(String[] args) {
        Long a[]=new Long[999999999];
        Long b[]=new Long[999999999];
    }
}
