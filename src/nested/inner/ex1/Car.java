package nested.inner.ex1;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    //Engine에서만 사용하는 메서드 - Engine에서만 사용하는 기능을 위해 모델 이름을 외부에 노출해야 함
    public String getModel() {
        return model;
    }

    //Engine에서만 사용하는 메서드 - Engine에서만 사용하는 기능을 위해 충전 레벨을 외부에 노출해야 함
    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start() {
        engine.start();
        System.out.println(model + "시작 완료");
    }
}
