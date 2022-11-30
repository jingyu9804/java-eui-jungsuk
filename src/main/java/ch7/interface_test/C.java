package ch7.interface_test;

public class C implements I{
    @Override
    public void play(){
        System.out.println("play in C class");
    }

    @Override
    public String toString(){
        return "C class";
    }
}
