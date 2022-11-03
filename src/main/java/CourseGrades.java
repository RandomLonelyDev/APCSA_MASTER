import personal_tests.libs.ArraysExtended;

import java.util.*;

public class CourseGrades {
    public static void main(String[] args) {
        boolean exit = false;
        Scanner scanline = new Scanner(System.in);
        GradeBook gradeBook = new GradeBook();
        ArrayList<Double> testArr = new ArrayList<>();
        {
            testArr.add(78.2);
            testArr.add(56.3);
            testArr.add(100.0);
        }
        gradeBook.addStudent("emily", testArr);
        System.out.print("+--------------------+\n| Powerschool CLI v1 |\n+--------------------+");
        while (!exit) {
            System.out.print("\n\nWhat would you like to do?\n[1] Add student(s)\n[2] View student grades\n[3] Update student\n[4] View student\n[5] View test averages\n[6] Exit\n>>: ");
            try {
                switch (Integer.parseInt(scanline.nextLine().trim())) {
                    case 1:
                        System.out.print("\n\n\n--------------------\nNumber to add: ");
                        int numToAdd = Integer.parseInt(scanline.nextLine());
                        for (int i = 0; i < numToAdd; i++) {
                            System.out.print("\n Name: ");
                            gradeBook.addStudent(scanline.nextLine());
                        }
                        System.out.print("STUDENTS CREATED");
                        scanline.nextLine();
                        break;
                    case 2:
                        System.out.print("\n\n\n--------------------\n");
                        for(Map.Entry<String,ArrayList<Double>> entry : gradeBook.getEntrySet()){
                            System.out.format("%s: ",entry.getKey());
                            ArraysExtended.printArray(entry.getValue().toArray());
                            System.out.print("\n");
                        }
                        System.out.print("--------------------");
                        scanline.nextLine();
                        break;
                    case 3:
                        System.out.print("\n\n\n--------------------\nStudent Name: ");
                        String threeName = scanline.nextLine();
                        System.out.print("Grade: ");
                        double threeGrade = Double.parseDouble(scanline.nextLine().trim());
                        boolean threeSuccessful = gradeBook.addGrade(threeName,threeGrade);
                        System.out.print(threeSuccessful?"GRADE ENTERED SUCCESSFULLY":"ERROR");
                        scanline.nextLine();
                        break;
                    case 4:
                        System.out.print("\n\n\n--------------------\nStudent Name: ");
                        String fourName = scanline.nextLine();
                        try {
                            ArrayList<Double> sGrades = gradeBook.getStudentGrades(fourName);
                            System.out.format("%s's grades: ", fourName);
                            ArraysExtended.printArray(sGrades.toArray());
                            System.out.format("\nAverage: %.2f",gradeBook.getStudentAverage(fourName));
                        } catch (NullPointerException e) {
                            System.out.print("\n/////////////////////////////\n/THIS STUDENT DOES NOT EXIST/\n/////////////////////////////\n");
                        }
                        scanline.nextLine();
                    case 5:
                        System.out.print("\n\n\n--------------------\nTest ID: ");
                        int tID = Integer.parseInt(scanline.nextLine());
                        System.out.format("Average Score for test #%d: %.2f",tID,gradeBook.getTestAverage(tID));
                        break;
                    case 6:
                        exit = true;
                        break;
                    default:
                        throw new NumberFormatException("");
                }
            } catch (NumberFormatException e) {
                System.out.print("\n///////\n/ERROR/\n///////\n");
            }
        }
        System.out.print("\n+------------------------------+\n| Thank you for using this CLI |\n+------------------------------+");
    }
}

class GradeBook {
    private LinkedHashMap<String, ArrayList<Double>> gradeBook = new LinkedHashMap<>();
    public boolean addGrade(String student, double grade){
        for(Map.Entry<String, ArrayList<Double>> entry : gradeBook.entrySet()){
            if(entry.getKey().equals(student)){
                entry.getValue().add(grade);
                return true;
            }
        }
        return false;
    }
    public void addStudent(String name){
        gradeBook.put(name,new ArrayList<>());
    }
    public void addStudent(String name, ArrayList<Double> grades){
        gradeBook.put(name,grades);
    }
    public double getTestAverage(int recordID){
        double sum = 0;
        int numWithGrade = 0;
        for (Map.Entry<String,ArrayList<Double>> entry : gradeBook.entrySet()) {
            boolean exception = false;
            try {
                sum += entry.getValue().get(recordID);
                numWithGrade = exception?numWithGrade:numWithGrade+1;
            } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
                exception = true;
            }
        }
        return sum/numWithGrade;
    }
    public double getStudentAverage(String name){
        double sum = 0;
        for (Map.Entry<String,ArrayList<Double>> entry : gradeBook.entrySet()) {
            int size = 1;
            if(entry.getKey().equals(name)){
                size = entry.getValue().size();
                for(Double grade : entry.getValue()){
                    sum += grade;
                }
                return sum/size;
            }
        }
        return -1;
    }
    public ArrayList<Double> getStudentGrades(String name){
        for(Map.Entry<String,ArrayList<Double>> entry : gradeBook.entrySet()){
            if(entry.getKey().equals(name)){
                return entry.getValue();
            }
        }
        return null;
    }
    public Set<Map.Entry<String,ArrayList<Double>>> getEntrySet(){
        return gradeBook.entrySet();
    }
}