package demo01;

public class HelloAction {
	public String sayHello(){
		System.out.println("HelloAction层的sayHello方法被调用");
		int i = 10/0;
		return "success";
	}
}
