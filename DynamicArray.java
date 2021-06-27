
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class DynamicArray {
    public static void main(String[] args)
    {
        int [] arr = {4,5,6,3,7};
        System.out.println("Original Array Length :"+arr.length);
        int [] iarr = Arrays.copyOf(arr,15);
        System.out.println("Increased Array Length :" + iarr.length);
        for(int i=0 ; i<iarr.length ; i++)
        System.out.print(iarr[i]);

      }
    
}

