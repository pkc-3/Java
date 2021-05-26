package sub1;

public class FruitBox<T> { //<T>로 generic 선언 : 치환변수
	
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
