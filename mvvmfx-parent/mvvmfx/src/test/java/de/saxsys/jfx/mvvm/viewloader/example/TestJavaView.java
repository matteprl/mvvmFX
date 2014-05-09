package de.saxsys.jfx.mvvm.viewloader.example;

import de.saxsys.jfx.mvvm.api.InjectViewModel;
import de.saxsys.jfx.mvvm.api.JavaView;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * This class is used as example View class that is written in pure java. 
 */
public class TestJavaView extends VBox implements JavaView<TestViewModel> , Initializable{
    @InjectViewModel
    public TestViewModel viewModel;

    public ResourceBundle resourceBundle;

    public boolean viewModelWasNull = true;
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.resourceBundle = resourceBundle;
        viewModelWasNull = viewModel == null;
    }
}
