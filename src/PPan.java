import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import javax.swing.JPanel;

// Добавить нажатия кнопок , которые бы меняли значения толщины
public class PPan extends JPanel implements IPaintComponent
{
	// Добаивть панель для кнопок и кнопки выбора толщины линии и цвета линии
	// Есть только панель для рисования 
	// Можно переключать кнопки и дорисовывать 
	// Как исправить баг 

	private BufferedImage bi = new BufferedImage(600, 600, BufferedImage.SCALE_DEFAULT);
	
	private PData data;

	public PPan() 
	{	}
	
	public PPan(PCommand cmd) 
	{	

		data = PData.getInstance();
//		PCommand cmd = PCommand.getInstance();
		
		setBackground(Color.ORANGE);
		setBounds(0, 0, 600, 600 );
		
		addMouseListener(cmd.aPress);
		addMouseMotionListener(cmd.aDagged);
		
		Graphics2D gg = (Graphics2D) bi.getGraphics();
		gg.setColor(Color.WHITE);
		gg.fillRect(0, 0, 600, 600);

	}
	@Override
	public void drawLine(int x1, int y1, int x2, int y2, int width, Color clr)
	{
		Graphics2D gg = (Graphics2D) bi.getGraphics();
		gg.setColor( data.getColor());
		gg.setStroke(new BasicStroke( data.getWidth() ));
		gg.drawLine(x1, y1, x2, y2);
		repaint();	


	}
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		
		Graphics2D gg = (Graphics2D) g;
		gg.drawImage(bi, null, 0, 0);
	}
	
	

	
}
