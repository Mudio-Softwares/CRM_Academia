
package ex1_javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author Rodolfo
 */
public class Ex1_javaFX extends Application {
    
    
    public HBox top(){
        HBox box1 = new HBox(50);
        box1.setSpacing(20);
        box1.getChildren().add(new Text("MÚDIO LTDA"));
        Button voltar = new Button("VOLTAR");
        voltar.setPrefSize(40, 30);
        Label aux = new Label("Pesquise: ");
        TextArea pesquisa = new TextArea();
        pesquisa.setMaxHeight(20);
        box1.getChildren().addAll(voltar, aux, pesquisa);
        
        return box1;
    }
    public FlowPane center(){
        FlowPane pane = new FlowPane(30, 20);
        //esses botões são um link para as outras telas.
        Button cad_funcionario, cad_cliente, pagamentos, consultar, marcar_aula;
        cad_funcionario = new Button("Cadastro de funcionário");
        cad_cliente = new Button("Cadastro de cliente");
        pagamentos = new Button("Pagamentos");
        consultar = new Button("Consultar");
        marcar_aula = new Button("Marcar Aula");
        
        cad_funcionario.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        
        pane.getChildren().addAll(cad_funcionario, cad_cliente, pagamentos, consultar, marcar_aula);
        return pane;
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane painel_principal = new BorderPane();
        painel_principal.setTop(top());
        painel_principal.setCenter(center());
        /*
            @Override
            public void handle(ActionEvent event) {
               Alert alerta = new Alert(AlertType.INFORMATION);
               String nome = btn.getText();
               String password2 = password.getText();
               
               alerta.setHeaderText(null);
               alerta.setContentText("Cadastro feito com sucesso, sr: " + nome + "\n com o password : " + password2);
               alerta.show();
            }
            
        });
        */
       // pane.getChildren().add(btn2);
        
        Scene scene = new Scene(painel_principal, 900, 600, Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("MúDIo");
        primaryStage.show();
                
    }
    public static void main(String[] args) {
        launch(args);
    }

    
}
