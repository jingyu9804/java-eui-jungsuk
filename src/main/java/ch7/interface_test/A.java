package ch7.interface_test;

public class A {
//    void autoPlay(I i){
//        i.play();
//    }
    void methodA(){
        I i = InstanceManager.getInstance(new C());
        i.play();
        System.out.println(i);
    }
}
