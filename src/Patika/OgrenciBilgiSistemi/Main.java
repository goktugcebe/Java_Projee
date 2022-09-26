package Patika.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
    Teacher t1=new Teacher("Mehmet Hoca","TRH","905000000");
    Teacher t2=new Teacher("Graham Bell Hoca","FZK","0000000");
    Teacher t3=new Teacher("Kulyutmaz","BIO","111100");

    Course tarih=new Course("Tarih","101","TRH");
    tarih.addTeacher(t1);

    Course fizik=new Course("Fizik","102","FZK");
    fizik.addTeacher(t2);

    Course biyo=new Course("Biyoloji","103","BIO");
    biyo.addTeacher(t3);


     Student s1=new Student("Inek Saban","123","4",tarih,fizik,biyo);
     s1.addBulkExamNote(100,90,56,100,100,60);
     s1.isPass();


     Student s2=new Student("Duduk Necmi","123","4",tarih,fizik,biyo);
     s2.addBulkExamNote(60,57,99,60,100,100);
     s2.isPass();

    }
}
