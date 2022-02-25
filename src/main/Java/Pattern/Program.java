package Pattern;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = crateDeveloperBySpeciality("php");
        Developer developer = developerFactory.crateDeveloper();
        developer.writeCode();

    }

    static DeveloperFactory crateDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CPlusDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")){
    return new PHPDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + "is unknown specialty");
        }
    }
 }