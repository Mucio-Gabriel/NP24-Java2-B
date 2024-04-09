package br.com.senaisp.bauru.gabriel.licao09.exemplo02;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AplicacaoJavaFX extends Application {

	@Override
	public void start(Stage primeiraStage) throws Exception {
		// Criar o nó raiz ou container principal
		Group root = new Group();
		// Criar componentes da tela
		criarComponetes(root);
		// Criando a Scene e configurando a janela
		Scene scena = new Scene(root, 600, 400, Color.WHITE);
		primeiraStage.setTitle("Java FX");
		primeiraStage.setScene(scena);
		primeiraStage.show();

	}

	private void criarComponetes(Group root) {
		HBox hbox = new HBox();
		// Criando os Botoes
		Button btn01 = new Button("Ola mundo!");
		Button btn02 = new Button("222");
		Button btn03 = new Button("33333");
		// Ajustando os tamanhos dos botoes
		HBox.setHgrow(btn01, Priority.ALWAYS);
		HBox.setHgrow(btn02, Priority.ALWAYS);
		HBox.setHgrow(btn03, Priority.ALWAYS);
		// Indicando o maximo que podem aumentar
		btn01.setMaxWidth(Double.MAX_VALUE);
		btn02.setMaxWidth(Double.MAX_VALUE);
		btn03.setMaxWidth(Double.MAX_VALUE);
		// Adicionando os botoes no hbox
		hbox.getChildren().addAll(btn01, btn02, btn03);
		// dimensioando o HBox
		hbox.setPrefWidth(600);
		// Adicionando o hbox ao nó root
		root.getChildren().addAll(hbox);
		// Posicionando nosso hbox em uma deternminada altura
		hbox.setLayoutY(300);
		// Criando o retangulo
		Rectangle rec = new Rectangle(150, 150, Color.DARKBLUE);
		rec.setLayoutX(50);
		rec.setLayoutY(50);
		// Colocando o contorno
		rec.setStroke(Color.ORANGE);
		rec.setStrokeWidth(10);
		// Adicionar o rectangle ao nó root
		root.getChildren().add(rec);
		// Adicionando o Texto
		Text txt = new Text("Dorm 6:\n200");
		txt.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
		txt.setFill(Color.RED);
		txt.setLayoutX(250);
		txt.setLayoutY(100);
		// Adicionando o contorno ao Texto
		txt.setStroke(Color.BLACK);
		txt.setStrokeWidth(5);
		// Colocando o contorno para tras do text
		txt.setStrokeType(StrokeType.OUTSIDE);
		// Arredondando o contorno (abaulando)
		txt.setStrokeLineCap(StrokeLineCap.ROUND);
		txt.setStrokeLineJoin(StrokeLineJoin.ROUND);
		// Adicionando ao nó root
		root.getChildren().add(txt);

	}

	public static void main(String[] args) {
		launch(args);

	}

}
