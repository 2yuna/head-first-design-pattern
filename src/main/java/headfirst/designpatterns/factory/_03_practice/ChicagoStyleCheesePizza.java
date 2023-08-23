package headfirst.designpatterns.factory._03_practice;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "시카고 스타일 치즈 피자";
        dough = "두꺼운 도우";
        sauce = "플럼프 토마토 소스";

        toppings.add("듬뿍 들어간 치즈");
    }
}
