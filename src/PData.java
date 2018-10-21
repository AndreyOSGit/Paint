import java.awt.Color;

public class PData 
{
	//� ��� ������� ����� ??? - ����� ������� ����������� ��� ����������
	private int width;
	private Color color; // � ����� �������� ��������� ����� ? - � ���� ���������� ���� ����
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
	
	public int getWidth() {
		
		return width;
	}
	
	public Color getColor() {
		
		return color;
	}
	
	public void setWidth(int newWidth) {
		
		this.width = newWidth;
	}
	
	public void setColor(Color newColor) {
	
		this.color = newColor;
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
