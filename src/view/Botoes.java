package view;
import java.awt.Label;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

public class Botoes extends JPanel {
	
	JSlider sliderTX = new JSlider(-300, 300, 0);
	JSlider sliderTY = new JSlider(-300, 600, 0);
	
	JSlider sliderQtd = new JSlider(3, 50, 3);
	double rFator = 100;
	JSlider sliderR = new JSlider(0, (int)(2*Math.PI*rFator), 0);
	JSlider sliderEX = new JSlider(1, 10, 1);
        JSlider sliderEY = new JSlider(1, 10, 1);
        JSlider sliderCX = new JSlider(1, 10, 1);
        JSlider sliderCY = new JSlider(1, 10, 1);
	public Botoes() {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		add(new Label("Translade em X"));
		add(sliderTX);
		add(new Label("Translade em Y"));
		add(sliderTY);
		add(new Label("Quantidade de pontos no círculo"));
		add(sliderQtd);
		add(new Label("Rotacao"));
		add(sliderR);
                add(new Label("Escala em X"));
                add(sliderEX);
                add(new Label("Escala em Y"));
                add(sliderEY);
                add(new Label("Cisalhamento em X"));
                add(sliderCX);
	}
	
	public int getValorSlideTX() {
		return sliderTX.getValue();
	}
	
	public int getValorSlideTY() {
		return sliderTY.getValue();
	}
	
	public int getValorSlideQtd() {
		return sliderQtd.getValue();
	}
	
	public double getValorSlideR() {
		return (double)sliderR.getValue()/(double)rFator;
	}
	
        public double getValorSlideEX() {
       		return sliderEX.getValue();
        }
         public double getValorSlideEY() {
       		return sliderEY.getValue();
        }
          public double getValorSlideCX() {
       		return sliderCX.getValue();
        }

        
        public void adicionaListenerSlide(ChangeListener cl) {
		sliderTX.addChangeListener(cl);
		sliderTY.addChangeListener(cl);
		sliderQtd.addChangeListener(cl);
		sliderR.addChangeListener(cl);
                sliderEX.addChangeListener(cl);
                sliderEY.addChangeListener(cl);
                sliderCX.addChangeListener(cl);
               	}

    
	
	
	

}
