package Patika.OgrenciBilgiSistemi;

public class Student {
    Course  c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=name;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPass=false;
    }
    void addBulkExamNote(double note1, double note2,double note3,double verbalNote1,double verbalNote2,double verbalNote3){
        if(note1>=0 && note1<= 100 ) {
            this.c1.note=note1*0.8 +verbalNote1*0.2;
        }
        if(note2>=0 && note2<= 100 ) {
            this.c2.note=note2*0.8 +verbalNote2*0.2;
        }
        if(note3>=0 && note3<= 100 ) {
            this.c3.note=note3*0.8 +verbalNote3*0.2;
        }
    }
    void isPass(){
        this.average = (this.c1.note + this.c2.note+this.c3.note)/3.0;
        if(this.average>55){
            System.out.println("Sinifi basarili bir sekilde gecti");
            this.isPass=true;}
        else{ System.out.println("Sinifta kaldiniz");
      this.isPass=false;
        }

        printNote();

//        if(this.c1.note>55 && this.c2.note>55 && this.c3.note>55 ){
//            System.out.println("Sinifi basarili bir sekilde gecti");
//            this.isPass=true;
//        }
//        else{
//            System.out.println("Sinifta kaldiniz");
//            this.isPass=false;
        }

 void printNote(){
     System.out.println("******************************");
     System.out.println(c1.name+" Notu\t"+c1.note);
     System.out.println(c2.name+" Notu\t"+c2.note);
     System.out.println(c3.name+" Notu\t"+c3.note);
//     double average=(c1.note+c2.note+c3.note)/3;
     System.out.println("******************************");
     System.out.println("Ortalamaniz: "+this.average);
    }
}
