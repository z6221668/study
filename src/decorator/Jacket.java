package decorator;

public class Jacket extends DecoratorBase{
    public Jacket(IPerson iPerson){
        super(iPerson);
    }
    @Override
    public void show() {
        iPerson.show();
        System.out.println("穿上夹克");
    }
}

class Hat extends DecoratorBase {
    public Hat(IPerson iPerson){
        super(iPerson);
    }
    @Override
    public void show() {
        super.show();
        System.out.println("戴上Hat");
    }
}