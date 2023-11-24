package cn.itcast.interfaceDemo5;

/**
 * 接口的多继承
 */
public interface Test1 {

}

interface A {
    public void a();
}

interface B {
    public void b();
}

interface C {
    public void c();
}

interface D extends A, B, C {
    public void d();
}

class E implements D{

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }
}
