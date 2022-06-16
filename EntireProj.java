package Java4;

import java.util.ArrayList;

public class EntireProj {

    private final ArrayList<Java4.Literature> fileOfLiterature;
    public EntireProj(ArrayList<Java4.Literature> ListOfLiterature){
        this.fileOfLiterature = ListOfLiterature;
    }

    public void addLiterature(Java4.Literature literature){
        fileOfLiterature.add(literature);
    }

    public ArrayList<Java4.Literature> ToLiterature(){
        return fileOfLiterature;
    }

}