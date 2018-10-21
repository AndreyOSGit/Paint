import java.awt.Button;
import java.awt.Color;
import java.awt.color.ProfileDataException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

import org.omg.PortableServer.ServantLocator;

// ’ранить все пиксели рисунка

// ’ранить координаты и метод пересчета

public class PButtonPanel extends JPanel
{
	// POJO Plain Old Java Object) Ч Ђстарый добрый Java-объектї
	
	PData data;
	
	PCommand cmd = PCommand.getInstance();
	
	
public PButtonPanel() {
	
	setLayout(null);	
//		addMouseListener(this);
//		addMouseMotionListener(this);
	setBackground(Color.RED);
	setBounds(620, 10, 150, 400 );

	JButton SaveImage = new JButton("SAVE");
	JButton LoadImage = new JButton("LOAD");
	
	JButton RedButton = new JButton("RED");
	JButton BlueButton = new JButton("BLUE");
	JButton BlackButton = new JButton("BLACK");
	JButton Thikness1 = new JButton("1px");
	JButton Thikness5 = new JButton("5px");
	JButton Thikness10 = new JButton("10px");
	
	JRadioButton RadioLine = new JRadioButton("Line");
	JRadioButton RadioRectangle = new JRadioButton("Rectangle");
	JRadioButton RadioEllipse = new JRadioButton("Ellipse");
	JRadioButton RadioCurve = new JRadioButton("Curve");
	
	JColorChooser ChooseColor = new JColorChooser();
	JSlider Slider = new JSlider();

	SaveImage.setBounds(610,0,80,30);
	LoadImage.setBounds(690,0,80,30);
	
	RedButton.setBounds(630, 50, 120, 30);
	BlueButton.setBounds(630, 80, 120, 30);
	BlackButton.setBounds(630, 110, 120, 30);
	Thikness1.setBounds(630, 150, 120, 30);
	Thikness5.setBounds(630, 180, 120, 30);
	Thikness10.setBounds(630, 210, 120, 30);	

	Slider.setBounds(610, 250, 190, 30);
	ChooseColor.setBounds(600, 280, 200, 200);
	
	RadioLine.setBounds(630, 480, 100, 20);
	RadioRectangle.setBounds(630, 500, 100, 20);
	RadioEllipse.setBounds(630, 520, 100, 20);
	RadioCurve.setBounds(630, 540, 100, 20);
	
	RedButton.setName("red");
	BlueButton.setName("blue");
	BlackButton.setName("black");
	Thikness1.setName("th1");
	Thikness5.setName("th5");
	Thikness10.setName("th10");	
	
	RedButton.setActionCommand( "red");
	BlueButton.setActionCommand("blue");
	BlackButton.setActionCommand("black");
	Thikness1.setActionCommand("th1");
	Thikness5.setActionCommand("th5");
	Thikness10.setActionCommand("th10");	
	SaveImage.setActionCommand("save");
	LoadImage.setActionCommand("load");
	
	RedButton.addActionListener(cmd.aColor);
	BlueButton.addActionListener(cmd.aColor);
	BlackButton.addActionListener(cmd.aColor);
	Thikness1.addActionListener(cmd.aWidth);
	Thikness5.addActionListener(cmd.aWidth);
	Thikness10.addActionListener(cmd.aWidth);
	SaveImage.addActionListener(cmd.aSave);
	LoadImage.addActionListener(cmd.aLoad);
	
	add(SaveImage);
	add(LoadImage);
	add(RedButton);
	add(BlueButton);
	add( BlackButton);
	add (Thikness1 ) ;
	add (Thikness5 );
	add (Thikness10 );
	add (RadioLine);
	add (RadioRectangle );
	add (RadioEllipse );
	add (RadioCurve );
	add (ChooseColor );
	add (Slider);
	add(RadioLine);
	add(RadioCurve);
	}
	
	


//	@Override
//	public void actionPerformed(ActionEvent e) 
//	{
//		
//	}
	
}
	

	


