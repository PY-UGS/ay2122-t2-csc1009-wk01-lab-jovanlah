public class Wk1_lab_2101708
{
    public static void main(String[] args) 
    {
        System.out.println("Hello, I am Ho Jin Wei!");
        
        String module = "CSC1009";
        switch(module)
        {
            case "CSC1007":
            System.out.println("Operating Systems");
            break;
            case "CSC1008":
            System.out.println("Data Structures and Algorithms");
            break;
            case "CSC1009":
            System.out.println("Object-Oriented Programming");
            break;
            case "CSC1010":
            System.out.println("Computer Network");
            break;
        }

        for (int x=101; x>=67; x-=2)
        {
            System.out.println("value of x: " + x);
        }
    }
}