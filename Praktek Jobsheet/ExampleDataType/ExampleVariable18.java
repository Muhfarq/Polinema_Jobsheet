/**
 * ExampleVariable18
 */
public class ExampleVariable18 {

    public static void main(String[] args) {
        String oneOfMyHobbies = "Playing badminton";
        boolean is_Smart = true;
        char myGender = 'M';
        byte myAge = 20;
        double $gpa = 3.38, height = 1.68;
        System.out.println(oneOfMyHobbies);
        System.out.println("Are you smart ? " + is_Smart);
        System.out.println("Gender: " + myGender);
        System.out.println("My current age is" + myAge);
        System.out.println(String.format("My GPA is %s and my height is %s meters", $gpa, height ));
    }
}