package co.edu.uptc.demo2.models;

public class MyFile {    
    private String name;
    private String route;
    private Long size;
    private boolean isDir;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getSize() {
        return size;
    }
    public String getRoute() {
        return route;
    }
    public void setRoute(String route) {
        this.route = route;
    }
    public void setSize(Long size) {
        this.size = size;
    }

    public boolean isDir() {
        return isDir;
    }

    public void setDir(boolean isDir) {
        this.isDir = isDir;
    }
    

    
    @Override
    public String toString() {
        return "MyFile [name=" + name + ",      path= -- "+ route +" -- ,     size=" + size + ",     isDir=" + isDir + "]";
    }
}
