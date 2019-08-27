package practice;

public class myCode5tryCatch
{
    public static void main(String[] args)
    {
        //try...catch;Exception

        try
        {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[2]);
        }
        catch(Exception e) {
            System.out.println("something went wrong ");

            int[] a = null;
            System.out.println((a[1]));

        }

        try
        {
            int[] a = {4};
            System.out.println((a[2]));
        }
        catch(NullPointerException e)
        {
            System.out.println("your array is null!");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Your index is out of bound");
        }
        catch(Exception e)
        {
            System.out.println("something went wrong");
        }

    }
}
