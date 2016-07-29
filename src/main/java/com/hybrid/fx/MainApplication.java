package com.hybrid.fx;

import com.gluonhq.particle.application.ParticleApplication;
import com.hybrid.MosaicWeb2Application;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.WindowEvent;

import static org.controlsfx.control.action.ActionMap.actions;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class MainApplication extends ParticleApplication {

    public MainApplication() {
        super("Gluon Desktop Application");
    }

    @Override
    public void postInit(Scene scene) {
        scene.getStylesheets().add(MainApplication.class.getResource("style.css").toExternalForm());

        setTitle("Gluon Desktop Application");

        getParticle().buildMenu("File -> [exit]", "Help -> [about]");
        
        getParticle().getToolBarActions().addAll(actions("---", "about", "exit"));
        
        setShowCloseConfirmation(false);
        
        Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("*************************");
				System.out.println("...Platform.runlater()...");
				System.out.println("*************************");
				
				getPrimaryStage().setOnCloseRequest(new EventHandler<WindowEvent>() {
					
					@Override
					public void handle(WindowEvent event) {
						System.out.println("_____________________");
						System.out.println(".....cac.close().....");
						System.out.println("_____________________");
						cac.close();						
					}
				});
			}
		});
    }
    
    public static ConfigurableApplicationContext cac;
    public static void main(String[] args) {
		cac = SpringApplication.run(MosaicWeb2Application.class, args);
    	launch(args);
	}
}