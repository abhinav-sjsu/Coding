package com.tech.lambda.example;

import java.io.*;
import java.util.*;
class FindFile 
{
    public void findFile(String name,File file)
    {
        File[] list = file.listFiles();
        if(list!=null)
        for (File fil : list)
        {
            if (fil.isDirectory())
            {
                findFile(name,fil);
            }
            else if (name.equalsIgnoreCase(fil.getName()))
            {
                System.out.println("Parent File is "+fil.getParentFile());
            }
        }
    }
    public static void main(String[] args) 
    {
        FindFile ff = new FindFile();
       // Scanner scan = new Scanner(System.in);
        //System.out.println("Enter the file to be searched.. " );
        String name = "EMCDB_Disp_";
        //System.out.println("Enter the directory where to search ");
        String directory = "C:/Users/abhinav.kumar.kapur/git/ism/ism/src/main/resources/";
        ff.findFile(name,new File(directory));
    }
}
