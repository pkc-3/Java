package sub1;

public class FruitBox<T> { //<T>�� generic ���� : ġȯ����
	
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
