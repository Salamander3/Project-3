import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    //Adds the scanner
    Scanner scan = new Scanner(System.in);

    //Array of seat number.
    int[] seatNumber = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    
    //Array of student names.
    String[] studentNames = new String[15];
    
    //Loop for asking for student names.
    for(int index = 0; index < studentNames.length; index++)
    {
      System.out.println("Enter Student Name");

      studentNames[index] = scan.nextLine();

      System.out.println();
    }

    //A lot spacing to make it look pretty.
    System.out.println("Done!");
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();

    //Declares and sets an index.
    int index = 0;

    //Loop that prints out students seating locations.
    while(index < studentNames.length)
    {
      System.out.println(" " + studentNames[index] + " sits at desk " + seatNumber[index] + ". ");

      System.out.println();

      index++;
    }

  }
}