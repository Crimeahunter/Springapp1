package Pattern;

public class CPlusDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer crateDeveloper() {
        return new CPlusDeveloper();
    }
}
