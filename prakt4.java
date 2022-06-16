package Java4;

import java.util.ArrayList;

public class prakt4 {
    public static void main(String[] args) {
        ArrayList<Java4.Literature> fileOfLiterature = new ArrayList<>();
        Java4.EntireProj allBooks = new Java4.EntireProj(fileOfLiterature);

        int bookCode = 1;
        String bookType = "Computer Literature";
        String bookName = "Learn Java the Easy Way";
        int bookYear = 2017;
        String bookNamePublic = "BOMBORA";
        int bookNumberPages = 400;
        String bookWriter = "Bryson Payne";
        String bookFieldScience = "Scientific";
        int bookNumberInstances = 5647;
        Java4.SciTechLiterature bookJava = new Java4.SciTechLiterature(bookCode, bookType, bookName, bookYear, bookNamePublic, bookNumberPages, bookWriter, bookFieldScience, bookNumberInstances);

        allBooks.addLiterature(bookJava);

        int bookJSCode = 2;
        String bookJSType = "Computer Literature";
        String bookJSName = "Javascript & jQuery. Interactive web development.";
        int bookJSYear = 2020;
        String bookJSNamePublic = "Exmo";
        int book1NumberPages = 640;
        String bookJSWriter = "John Duckett";
        String bookJSTypePeriodicals = "Yearly";
        String bookJSPeriodPublishing = "From 2020 to present";
        Java4.Periodicals bookJS = new Java4.Periodicals(bookJSCode, bookJSType, bookJSName, bookJSYear, bookJSNamePublic, book1NumberPages, bookJSWriter, bookJSTypePeriodicals, bookJSPeriodPublishing);

        allBooks.addLiterature(bookJS);

        int bookPythonCode = 3;
        String bookPythonType = "Computer Literature";
        String bookPythonName = "A Byte of Python";
        int bookPythonYear = 2013;
        String bookPythonNamePublic = "Ebshelf Inc";
        int bookPythonNumberPages = 189;
        String bookPythonWriter = "Swaroop C. H.";
        String bookPythonDirection = "Scientific";
        int bookPythonVolume = 2;
        int bookPythonPart = 1;
        Java4.References bookPython = new Java4.References(bookPythonCode, bookPythonType, bookPythonName, bookPythonYear, bookPythonNamePublic, bookPythonNumberPages, bookPythonWriter, bookPythonDirection, bookPythonVolume, bookPythonPart);

        allBooks.addLiterature(bookPython);

        System.out.println(allBooks.ToLiterature());
    }
}