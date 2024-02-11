import co.edu.uptc.demo2.controllers.FileController;

public class App {

    public static void main(String[] args) throws Exception {

        FileController fileController = new FileController();
        System.out.println("Show information files");

        fileController.showInfoFiles(".");

    }

}
