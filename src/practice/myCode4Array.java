package practice;

public class myCode4Array
{
    public static void main(String[] args)
    {
        String[] devices = {"laptop", "desktop", "tablet","phone"};

        System.out.println(devices[0]);
        System.out.println(devices[1]);
        System.out.println(devices[2]);


        System.out.println(devices.length);

        //change an array element

        devices[0] = "TV";
        System.out.println(devices[0]);



        //for loop

        for (int i = 0; i <devices.length; i++ )
        {
            System.out.println(devices[i] );
        }

        //Or

        for (String i : devices)
        {
            System.out.println(i);
        }


        for (int i = 0; i <devices.length; i++ )
        {
            System.out.println(devices[i] +i );
        }

        // two-dimensional arrays

        int myNumbers [][]= { {1,2, 4}, {5,6} };
        int x = myNumbers [1][0];
        System.out.println(x);
    }
}
