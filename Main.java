import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

/////////////////////////////////////////////////////////////////////////////////////////
    // Intialize variables
    boolean OrOutput = true;
    boolean OrConditionOne = true;
    boolean OrConditionTwo = true;
    int LineCount = 1;
    System.out.println("--------------------------");
    // For statment to print 4 lines
    for(LineCount=1;LineCount<=4;LineCount++)
    { 
      // If line 1
      if(LineCount==1)
      {
        OrConditionOne = true;
        OrConditionTwo = true; 
      }
/////////////////////////////////////////////////////////////////////////////////////////
      // If line 2
      if(LineCount==2)
      {
        OrConditionOne = true;
        OrConditionTwo = false; 
      }
/////////////////////////////////////////////////////////////////////////////////////////
      // If line 3
      if(LineCount==3)
      {
        OrConditionOne = false;
        OrConditionTwo = true; 
      }
/////////////////////////////////////////////////////////////////////////////////////////
      // If line 4
      if(LineCount==4)
      {
        OrConditionOne = false;
        OrConditionTwo = false; 
      }
/////////////////////////////////////////////////////////////////////////////////////////
      // If both outputs are false then output is false
      if(OrConditionOne == false)
      {
        if (OrConditionTwo == false)
        {
          OrOutput = false;
        }
      }
      // Print out table
      System.out.print(OrConditionOne + " | ");
      System.out.print(OrConditionTwo + " | ");
      System.out.println(OrOutput);
      System.out.println("--------------------------");
    }

  }
}