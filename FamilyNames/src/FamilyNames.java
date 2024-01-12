import java.util.Scanner;

public class FamilyNames {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1;
        String name2;
        String name3;

       System.out.println("Please type the name of your first family member");
       name1 = sc.nextLine();

       System.out.println("Please type the name of your second family member");
       name2 = sc.nextLine();

       System.out.println("Please type the name of your third family member");
       name3= sc.nextLine();

       String modifiedName1 = Character.toUpperCase(name1.charAt(1)) + "." + name1.substring(name1.length() - 2);
       String modifiedName2 = Character.toUpperCase(name2.charAt(1)) + "." + name2.substring(name2.length() - 2);
       String modifiedName3 = Character.toUpperCase(name3.charAt(1)) + "." + name3.substring(name3.length() - 2);

       System.out.println(modifiedName1 + "_" + modifiedName2 + "_" + modifiedName3);
    }
}
