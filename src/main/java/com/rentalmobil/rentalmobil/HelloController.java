package com.rentalmobil.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    public void toAdminDashboard(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("admin-dashboard.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }

    public void toUserDashboard(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }

    public void toDataMobilAdmin(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("datamobil-admin.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }

    public void toDataMerkAdmin(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("datamerk-admin.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }

    public void toDataPemesananAdmin(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("datapemesanan-admin.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }

    public void toDataPerjalananAdmin(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("dataperjalanan-admin.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }

    public void toDataPesananAdmin(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("datapesanan-admin.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }

    public void toManajemenAkunAdmin(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("manajemenakun-admin.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }

    public void toPilihMobil(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("pilihmobil.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }

    public void toSewaMobil(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("sewa-mobil.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }

    public void onBtnLogoutClicked(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }

    public void toRegister(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("register.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }

    public void toLogin(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }

    public void toDetailMobil(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("detail-mobil.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }

    public void toMobilYangDisewa(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("mobilyangdisewa.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }
}