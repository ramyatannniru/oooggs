package implement.java;

public class Liner  extends Model{
	private int start;
	private int end;
	public Liner(int start,int end) {
		this.start=start;
		this.end=end;
	}
	public int calculate() {
		return end-start;
	}

	@Override
	public boolean isGreaterThan(Object o1, Object o2) {
		Liner l1=(Liner)o1;
		Liner l2=(Liner)o2;
		return l1.calculate()>l2.calculate();
		
		
	
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLessThan(Object o1, Object o2) {
	
		// TODO Auto-generated method stub

		
			Liner l1=(Liner)o1;
			Liner l2=(Liner)o2;
			return l1.calculate()<l2.calculate();
			
	}

}
