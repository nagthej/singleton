public class SingletonDemo {

	private SingletonDemo() {

	}

	private static class HolderPattern {
		private static SingletonDemo singletonDemo = new SingletonDemo();
	}

	public static SingletonDemo getInstance() {

		return HolderPattern.singletonDemo;
	}
	
}
