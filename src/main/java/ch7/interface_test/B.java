package ch7.interface_test;

public class B implements I{
    @Override
    public void play(){
        System.out.println("play in B class");
    }

    @Override
    public String toString(){
        return "B class";
    }
}
