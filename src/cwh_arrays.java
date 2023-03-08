public class cwh_arrays {
    public static void main(String[] args) {
//       int [] marks = new int[5];
//       marks[0] = 100;
//        marks[1] = 57;
//        marks[2] = 89;
//        marks[3] = 55;
//       marks[4] = 98;
//        System.out.println(marks[3]);
        int [] marks ={100,29,59,10,98};
//      System.out.println(marks[3]);int [] marks ={100,29,59,10,98}; ;
//        marks[0] = 100;
//        marks[1] = 57;
//        marks[2] = 89;
//        marks[3] = 55;
//        marks[4] = 98;
//       System.out.println(marks[3]);
        for (int i=marks.length -1; i>=0; i--){
            System.out.println(marks[i]);
        }
        System.out.println("using for each loop");
        for (int element:marks){
            System.out.println(element);
        }

    }
}
