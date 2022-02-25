package Pattern;

public class PHPDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer crateDeveloper() {
        return new PHPDeveloper();
    }
}
