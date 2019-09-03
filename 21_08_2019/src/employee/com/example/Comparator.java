package employee.com.example;

public interface Comparator {
	public default int Compareto(Object o1)
	{
		return 0;
	}
}