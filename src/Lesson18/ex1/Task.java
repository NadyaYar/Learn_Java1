package Lesson18.ex1;

public class Task {
    public static void main(String[] args) {
        FileStorage fileStorage = new FileStorage();
        String[] fileNames = {"test1", "test2"};
        fileStorage.setFiles(fileNames);

        System.out.println("start printing name");
        printer(fileStorage);

        System.out.println("Done");
    }

    public static void printer(Storage storage) {
        String[] names = storage.getFiles();
        try {
            System.out.println("5TH NAME IS" + names[4]);
        } catch (Exception e) {
            System.err.println("5th name can not be found..");
            System.err.println(e.getMessage());
        }
    }
}
