import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.color.ProfileDataException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class PFrame extends JFrame implements IPaintComponent
{

	// почитать сохранение изображенией
	public PFrame() {
		
//	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	setTitle("Paint");
	
	setBounds(0, 10, 800, 600);

	add(new MyJTabbedPanel());
//	add( new PPan() );
	add( new PButtonPanel() );
	// рискуем не найти элемент , если не добавим их до того как отобразим фрейм
	setVisible(true);
	}

	@Override
	public void drawLine(int x1, int y1, int x2, int y2, int width, Color clr) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void actionPerformed(ActionEvent e) 
//	{
//		
//	}


	
}
