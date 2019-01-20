package Arrays;

public class Practice_Array {
    public static void main(String[] args) {

        String [] kitechenitems = new String[] {"knife", "wooden", "Spoons", "Plates", "cups", "forks", "pan", "pot", };
        for( String kitchen : kitechenitems){
            System.out.println(kitchen);

            switch(kitchen){
                case "knife":
                    System.out.println("This is for cutting the products");
                    break;
                case "wooden":
                    System.out.println("This is for wooden products");
                    break;


                default:
                System.out.println("No correct input");
                break;
        }}
    }
}
