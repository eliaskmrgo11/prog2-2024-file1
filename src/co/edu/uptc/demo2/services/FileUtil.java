package co.edu.uptc.demo2.services;

import java.io.File;  
import co.edu.uptc.demo2.models.MyFile;

public class FileUtil {

  public String[] getNameFiles(String path) {
    File file;
    file = new File(path);
    String[] listaArchivos = file.list();
    return listaArchivos;
  }

  public MyFile[] getInfoFiles(String path) {
    File file;
    file = new File(path);
    File[] listaArchivos = file.listFiles();
    MyFile[] myFiles = new MyFile[listaArchivos.length];
    int  i = 0;
    for (File file2 : listaArchivos) {
        MyFile auxMyFile = new MyFile();
               
        auxMyFile.setName(file2.getName());
        auxMyFile.setSize(file2.length());
        auxMyFile.setDir(file2.isDirectory());
        auxMyFile.setRoute(file2.getAbsolutePath());
        myFiles[i] = auxMyFile;
        i++;      
    }
    return myFiles;
  }
//   for (int i = 0; i < listaArchivos.length; i++) {
//     File file2 = listaArchivos[i];
//     MyFile auxMyFile = new MyFile();

//     auxMyFile.setName(file2.getName());
//     auxMyFile.setSize(file2.length());
//     auxMyFile.setDir(file2.isDirectory());
//     myFiles[i] = auxMyFile;
// }
} 
