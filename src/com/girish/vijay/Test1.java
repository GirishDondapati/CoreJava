public class Test1 {
	public static void main(String[] args) {
	Outerclass.Innerclass i=new	Outerclass.Innerclass();
	i.innerMethod();
	Outerclass o=new Outerclass();
	o.x=5;
	}
}
class Outerclass{
	public int x=9;
	public Outerclass(){
		Innerclass inner=new Innerclass();
		inner.innerMethod();
	}
class InnerClass{
	public void innerMethod()
	{
		System.out.println(x);
	}
}
}