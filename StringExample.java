public class StringExample {
    public static void main(String[] args)
    {
        StringBuilder str = new StringBuilder("Welcome to string handling tutorial");
      System.out.println("string = " + str);
      // character at index 3
      System.out.println("character at index 3 = " + str.charAt(3));
      // set character at index 3
      str.setCharAt(3, 'L');
      System.out.println("After Set, string = " + str);
      String str1 = new String("Hello ");
      System.out.println("Original string : "+str1);
      //Concatenate function
      str1 = str1.concat("World!");
      System.out.println("After concatenation string : "+str1);
      String str2 = new String("Hello ");
      System.out.println("str1 equals to str2:"+str1.equals(str2));
      System.out.println("str1 equals to str2:"+str1.equals("Hello World!"));
       StringBuilder str3 = new StringBuilder("tutorials");
      System.out.println("string = " + str3);  
      // length of StringBuilder
      System.out.println("length = " + str3.length());
      // set the length of StringBuilder to 5
      str3.setLength(5);
      // print new StringBuilder value after changing length
      System.out.println("After set, string = " + str3);
      // length of StringBuilder after changing length
      System.out.println("length = " + str3.length());
      //Append Method
       StringBuffer sb = new StringBuffer("Test");
      sb.append(" String Buffer");
      System.out.println(sb); 
      StringBuilder strs = new StringBuilder("Tutorial");
      System.out.println("string = " + strs);

      // insert character value at offset 8
      strs.insert(8, 's');

      // prints StringBuilder after insertion
      System.out.print("After insertion = ");
      System.out.println(strs.toString());
    }
}

