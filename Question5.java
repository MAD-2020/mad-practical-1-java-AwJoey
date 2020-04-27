import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int occurence = 0;
    int mode = 0;
    ArrayList<Integer> data = new ArrayList<>();
    
    //System.out.print("Enter the number of integers you will be entering next: ");
    int noOfInt = in.nextInt();
    
    while (data.size() != noOfInt)
    {
      //System.out.print("Enter a number: ");
      int number = in.nextInt();
      data.add(number);
    }
   
    for (int j = 0; j < data.size(); j++)
    {
      int occ = 0;
      for (int k = 0; k < data.size(); k++)
      {
        if (data.get(j) == data.get(k))
        {
          occ += 1;
          if (occ-1 > occurence)
          {
            occurence = occ;
            mode = data.get(j);
          }
        }
      }
      }
      System.out.println(mode);
    
  }
}
