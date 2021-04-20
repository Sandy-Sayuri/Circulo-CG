package controller;

import java.awt.Shape;
import java.awt.geom.Point2D;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.Model;
import view.View;

public class Controller {
	
	View view;
	Model model;
	
	public Controller() {
		model = new Model();
		view = new View(model.getDesenho());//pega o desenho
		
		view.adicionaListenerSlide(new MudaSlide());//aqui é onde quando munda o slide muda o desenho 
	}
	
	class MudaSlide implements ChangeListener{
		//implemanta o que está a classe view
		@Override
		public void stateChanged(ChangeEvent e) {
			int quantidadePontos = view.getValorQtd();
			model.updateQuantidade(quantidadePontos);
			
			Point2D.Double t = view.getValorT();
			double a = view.getValorR();
            Point2D.Double es=view.getValorE();
            Point2D.Double c=view.getValorC();
			
			Shape desenho;
                    desenho = model.makeTransformacoes(t, a,es,c);
			
			view.atualiza(desenho);
			
		}
		
	}
	

}
