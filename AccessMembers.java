package jan22.day1;

public class AccessMembers {
	LearnAccessModifier obj = new LearnAccessModifier();
	int a2 = obj.a;
	obj.method(1);
	
	//Access Private number
	int b2 = obj.b;
	obj.method(2);
	
	//Access Default number
	int c2 = obj.c;
	obj.method(3);

}
