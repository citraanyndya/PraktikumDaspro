public class PersonalInfo {
    public static void main(String[] args) {
        String oneOfMyHobbies = "Playing football";
        boolean isSmart = true;
        char gender = 'M';
        byte age = 23;
        double gpa = 3.89, height = 1.78;
        System.out.println(oneOfMyHobbies);
        System.out.println("Are you smart? " + isSmart);
        System.out.println("Gender: " + gender);
        System.out.println("My age is " + age);
        System.out.println(String.format("My GPA is %.2f, my height is %.2f meters", gpa, height));
    }
}