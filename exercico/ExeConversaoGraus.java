package exercico;

public class ExeConversaoGraus {
public static void main(String[] args) {
	double fahr = 86;
	
	final double ajuste = 32;
	final double mult = 5/9.0;
	
	double celsius = (fahr - ajuste) * mult;
	System.out.println(celsius);
			

}
}
