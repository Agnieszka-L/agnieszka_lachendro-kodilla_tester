public class MainUser {
    public static void main(String[] args) {

        User zosia = new User("Zosia", 20);
        User basia = new User("Basia", 22);
        User kasia = new User("Kasia", 24);
        User krysia = new User("Krysia", 21);
        User ania = new User("Ania", 20);

        User[] users = new User[5];
        users[0] = zosia;
        users[1] = basia;
        users[2] = kasia;
        users[3] = krysia;
        users[4] = ania;

        int ageSum = 0;

        for (int i = 0; i < users.length; i++) {

            User user = users[i];
            int age = user.getAge();
            ageSum = ageSum + age;
        }

        System.out.println("AgeSum = " + ageSum);

        int averageAge = ageSum / (users.length);
        System.out.println("Average Age = " + averageAge);

        for (int i = 0; i < users.length; i++) {

            User user = users[i];
            int age = user.getAge();
            if (age < averageAge) {
                System.out.println(user.getName());
            }
        }
    }
}

