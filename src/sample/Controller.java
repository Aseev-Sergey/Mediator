package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import sample.collegue.*;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class Controller implements Initializable, Mediator {

    public RadioButton A1_1, A1_2, A1_3, A1_4,
            A2_1, A2_2, A2_3, A2_4,
            A3_1, A3_2, A3_3, A3_4,
            A4_1, A4_2, A4_3, A4_4,
            L1, L2, L3;

    public Button clearButton, checkButton, closeButton;
    public ImageView image1, image2, image3, image4;
    public TextField checkField;
    private HashMap<String, Colleague> id=new HashMap<>();
    private Colleague curUser;
    public Pane pane;

    public void onStart(ActionEvent actionEvent){
        if(L1.isSelected()){
            curUser = id.get("student");
        } else if(L2.isSelected()){
            curUser = id.get("teacher");
        } else if(L3.isSelected()){
            curUser = id.get("viewer");
        } else {checkField.setText("Выберите роль");}
        curUser.sendMessage();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        image1.setImage(new Image("sample\\images\\Slide1.png"));
        image2.setImage(new Image("sample\\images\\Slide2.png"));
        image3.setImage(new Image("sample\\images\\Slide3.png"));
        image4.setImage(new Image("sample\\images\\Slide4.png"));
        id.put("student", new Student(this));
        id.put("teacher", new Teacher(this));
        id.put("viewer", new Viewer(this));
    }


    public void clickA1_1(ActionEvent actionEvent) {
        if(A1_1.isSelected()){
            A1_2.setSelected(false);
            A1_3.setSelected(false);
            A1_4.setSelected(false);}

    }

    public void clickA1_2(ActionEvent actionEvent) {
        if(A1_2.isSelected()){
            A1_1.setSelected(false);
            A1_3.setSelected(false);
            A1_4.setSelected(false);}
    }

    public void clickA1_3(ActionEvent actionEvent) {
        if(A1_3.isSelected()){
            A1_2.setSelected(false);
            A1_1.setSelected(false);
            A1_4.setSelected(false);}
    }

    public void clickA1_4(ActionEvent actionEvent) {
        if(A1_4.isSelected()){
            A1_2.setSelected(false);
            A1_3.setSelected(false);
            A1_1.setSelected(false);}
    }

    public void clickA2_1(ActionEvent actionEvent) {
        if(A2_1.isSelected()){
            A2_2.setSelected(false);
            A2_3.setSelected(false);
            A2_4.setSelected(false);}
    }

    public void clickA2_2(ActionEvent actionEvent) {
        if(A2_2.isSelected()){
            A2_1.setSelected(false);
            A2_3.setSelected(false);
            A2_4.setSelected(false);}
    }

    public void clickA2_3(ActionEvent actionEvent) {
        if(A2_3.isSelected()){
            A2_2.setSelected(false);
            A2_1.setSelected(false);
            A2_4.setSelected(false);}
    }

    public void clickA2_4(ActionEvent actionEvent) {
        if(A2_4.isSelected()){
            A2_2.setSelected(false);
            A2_3.setSelected(false);
            A2_1.setSelected(false);}
    }

    public void clickA3_1(ActionEvent actionEvent) {
        if(A3_1.isSelected()){
            A3_2.setSelected(false);
            A3_3.setSelected(false);
            A3_4.setSelected(false);}
    }

    public void clickA3_2(ActionEvent actionEvent) {
        if(A3_2.isSelected()){
            A3_1.setSelected(false);
            A3_3.setSelected(false);
            A3_4.setSelected(false);}
    }

    public void clickA3_3(ActionEvent actionEvent) {
        if(A3_3.isSelected()){
            A3_2.setSelected(false);
            A3_1.setSelected(false);
            A3_4.setSelected(false);}
    }

    public void clickA3_4(ActionEvent actionEvent) {
        if(A3_4.isSelected()){
            A3_2.setSelected(false);
            A3_3.setSelected(false);
            A3_1.setSelected(false);}
    }

    public void clickA4_1(ActionEvent actionEvent) {
        if(A4_1.isSelected()){
            A4_2.setSelected(false);
            A4_3.setSelected(false);
            A4_4.setSelected(false);}
    }

    public void clickA4_2(ActionEvent actionEvent) {
        if(A4_2.isSelected()){
            A4_1.setSelected(false);
            A4_3.setSelected(false);
            A4_4.setSelected(false);}
    }

    public void clickA4_3(ActionEvent actionEvent) {
        if(A4_3.isSelected()){
            A4_2.setSelected(false);
            A4_1.setSelected(false);
            A4_4.setSelected(false);}
    }

    public void clickA4_4(ActionEvent actionEvent) {
        if(A4_4.isSelected()){
            A4_2.setSelected(false);
            A4_3.setSelected(false);
            A4_1.setSelected(false);}
    }

    public  void clickOnCheckB(ActionEvent actionEvent){
        int sum=0;
        if(A1_1.isSelected()){
            sum++;
        }
        if(A2_2.isSelected()){
            sum++;
        }
        if(A3_3.isSelected()){
            sum++;
        }
        if(A4_4.isSelected()){
            sum++;
        }
        checkField.setText(sum + " / 4 баллов");
    }

    public  void clickOnClearB(ActionEvent actionEvent){
        checkField.clear();
        clearState();
        unLogin();
    }

    public  void clickOnCloseB(ActionEvent actionEvent){
        Platform.exit();
    }


    public void chooseStudent(ActionEvent actionEvent) {
        if(L1.isSelected()){
            L2.setSelected(false);
            L3.setSelected(false);
        }
    }

    public void chooseTeacher(ActionEvent actionEvent) {
        if(L2.isSelected()){
            L1.setSelected(false);
            L3.setSelected(false);
        }
    }

    public void chooseViewer(ActionEvent actionEvent) {
        if(L3.isSelected()){
            L2.setSelected(false);
            L1.setSelected(false);
        }
    }

    private void clearState(){
        A1_1.setSelected(false);
        A1_2.setSelected(false);
        A1_3.setSelected(false);
        A1_4.setSelected(false);
        A2_1.setSelected(false);
        A2_2.setSelected(false);
        A2_3.setSelected(false);
        A2_4.setSelected(false);
        A3_1.setSelected(false);
        A3_2.setSelected(false);
        A3_3.setSelected(false);
        A3_4.setSelected(false);
        A4_1.setSelected(false);
        A4_2.setSelected(false);
        A4_3.setSelected(false);
        A4_4.setSelected(false);
        checkButton.setDisable(false);
    }

    private void selectRightAnswers(boolean teacher){
        if(teacher){
        A1_1.setSelected(true);
        A2_2.setSelected(true);
        A3_3.setSelected(true);
        A4_4.setSelected(true);
        }
    }

    private void viewerMode(boolean viewer){
        if(viewer) {
            checkButton.setDisable(true);
        }
    }

    private void unLogin(){
        L1.setSelected(false);
        L2.setSelected(false);
        L3.setSelected(false);
        pane.setVisible(false);
    }


    @Override
    public void setView(boolean select, boolean view) {

        pane.setVisible(true);
        clearState();
        selectRightAnswers(select);
        viewerMode(view);

    }
}
