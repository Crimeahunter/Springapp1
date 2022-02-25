package Pattern;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer crateDeveloper() {
        return new JavaDeveloper();
    }
}
