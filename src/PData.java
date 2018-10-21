import java.awt.Color;

public class PData 
{
	//¬ чем хранить колор ??? - обект сделать специальный или переменные
	private int width;
	private Color color; // ¬ какой примитив перегнать колор ? - в трех переменных типа байт
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
	
	
	//целочисленные типы есть в любом €зыке прграммировани€ и можно получить их побитовым сдвигом 
//	{
//	int red;
//	int blue;
//	int green;
//	int alpha;
//	}
	
//	  ак реализовать и передать цвет в инте
}
