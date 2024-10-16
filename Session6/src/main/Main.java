package main;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
	Label titleLbl;
	Label usernameLbl, passwordLbl, genderLbl, ageLbl, subsLbl;
	
	TextField usernameTF;
	PasswordField passwordPF;
	RadioButton maleRb, femaleRb;
	ToggleGroup genderTG;
	Spinner<Integer> ageSpinner;
	CheckBox subsCB;
	Button regisBtn;
	
	VBox vb;
	HBox genderContainer;
	BorderPane bp;
	Scene scene;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void init() {
		titleLbl = new Label("My First Page");
		
//		Label usernameLbl, passwordLbl, genderLbl, ageLbl, subsLbl;
		usernameLbl = new Label("Username");
		passwordLbl = new Label("Password");
		genderLbl = new Label("Gender");
		ageLbl = new Label("Age");
		subsLbl = new Label("Subs");
		
//		TextField usernameTF;
		usernameTF = new TextField();
		usernameTF.getText();

//		PasswordField passwordPF;
		passwordPF = new PasswordField();
		passwordPF.getText();

//		RadioButton maleRb, femaleRb;
		maleRb = new RadioButton("Male");
		femaleRb = new RadioButton("Female");
		
//		ToggleGroup genderTG;
		genderTG = new ToggleGroup();
		maleRb.setToggleGroup(genderTG);
		femaleRb.setToggleGroup(genderTG);
//		Spinner<Integer> ageSpinner;
		ageSpinner = new Spinner<>(0, 100, 10);
//		CheckBox subsCB;
		subsCB = new CheckBox("Do you want to Subs?");
//		Button regisBtn;
		regisBtn = new Button("Regis");
		
		genderContainer = new HBox();
		genderContainer.getChildren().addAll(maleRb,femaleRb);
		
		vb = new VBox();
		vb.getChildren().addAll(titleLbl,usernameLbl,
				usernameTF,passwordLbl,passwordPF,
				genderLbl,genderContainer,ageLbl,
				ageSpinner,subsLbl,subsCB,regisBtn);
		
		// Note:
//		DatePicker dp = new DatePicker();
//		ListView<String> lv = new ListView<>();
//		ObservableList<String> ol = FXCollections.observableArrayList(
//				"Halo", "Nama", "Saya");
//		lv.setItems(ol);
		
		bp = new BorderPane();
		bp.setCenter(vb);
		
		scene = new Scene(bp,800,600);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	

}
