package exception.basic.unchecked;

public class Client {
    public void call() { //throws MyUncheckedException이라고 쓰지 않아도 오류 발생하지 않음. exception 발생하면 알아서 throw 됨
        throw new MyUncheckedException("ex");
    }
}
