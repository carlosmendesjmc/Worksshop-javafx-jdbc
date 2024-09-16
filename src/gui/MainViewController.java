package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	
	/* Criando item(ID) de controle de tela (mesmo nome de referencia do ScennerBuilder)*/
	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	/* Declarando os metodos(onACtion) começa com  on "nome do controller" "evento"Action"*/
	/* esses metodos é responsavel para tratar os eventos do menu */
	
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("onMenuItemSellerAction");
	}
	
	@FXML
	public void onMenuItemDepartmentAction(){
		System.out.println("onMenuItemDepartmentAction");
	}
	
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("onMenuItemAboutAction");
	}
	
	
	
	
	/* Metódo criado automatico com botão direito no MainViewController */
	/* (URL arg0, ResourceBundle arg1) */
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
