import java.awt.Color;

public class PData 
{
	//� ��� ������� ����� ??? - ����� ������� ����������� ��� ����������
	int width;
	Color color; // � ����� �������� ��������� ����� ? - � ���� ���������� ���� ����
	private static PData instance = null;
	
	private PData() 
	{
		this.width = 1;
		this.color = Color.BLACK;
	}
	
	public static PData getInstance() 
	{
		if (instance == null)
		{
			instance = new PData();
		}
		
		return instance;
	}
	//������������� ���� ���� � ����� ����� ��������������� � ����� �������� �� ��������� ������� 
//	{
//	int red;
//	int blue;
//	int green;
//	int alpha;
//	}
	
//	 ��� ����������� � �������� ���� � ����
}
