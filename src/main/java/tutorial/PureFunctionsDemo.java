package tutorial;

public class PureFunctionsDemo {



    boolean canDrive(int age) {
        return age >= 18;
    }

    int ageRequirement = 58;

    boolean canRetire(int age) {
        return age >= ageRequirement;
    }


}
