package br.com.senaisp.bauru.gabriel.classes;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;

public class Duke extends Group {
	private Image dukeImg;
	private ImageView dukeImgVw;
	private Image luvaImg;
	private ImageView luvaImgVw;
	private AudioClip tom;
	

	public Duke() {
	//Carregandi a Iamgen do Duke	
	dukeImg = new Image(getClass().getResource("Images/Duke.png").toString());
	dukeImgVw = new ImageView(dukeImg);
	dukeImgVw.setFitWidth(50);
	dukeImgVw.setPreserveRatio(true);
	dukeImgVw.setY(10);

	//Carregando Luva
	luvaImg = new Image(getClass().getResource("Images/Glove.Png").toString());
	luvaImgVw = new ImageView(luvaImg);
	luvaImgVw.setFitWidth(40);
	luvaImgVw.setPreserveRatio(true);
	luvaImgVw.setX(17);
	
	//carregando o audio
	tom = new AudioClip(getClass().getResource("Audios/Note5.wav").toString());
	
	
	getChildren().addAll(dukeImgVw, luvaImgVw);
	//Colocando eventos
	criarEventos();
	}


	private void criarEventos() {
		setOnMouseClicked((me)->{
			tom.play();
		});
		//Criando o evento de arrastar o item
		setOnMouseDragged((me)->{
			setLayoutX(me.getSceneX());
			setLayoutY(me.getSceneY());
			double largura = this.getBoundsInLocal().getWidth()/2;
			double altura = this.getBoundsInLocal().getHeight()/2;
			setLayoutX(me.getSceneX()-largura);
			setLayoutY(me.getSceneY()-altura);
		});
	}
}
