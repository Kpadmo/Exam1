package practice2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test

{
    BufferedReader BR = null;

    String line;
    FileReader FR;

    {
        try {
            BR = new BufferedReader(new FileReader("√/Users/lotus/Desktop/JavaBasic/src/practice2/test.java"));

            while((line = BR.readLine()) !=null);{
                System.out.println((String) null);
            }
            }
        catch (IOException e)
        {

        }
    }

}
