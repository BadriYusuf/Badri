package Tugas_Strukdat_Stack;

public class TugasStack {
    private String data[];
    private int Size;
    private int Top;

    public TugasStack (int kapasitas){
        Size = kapasitas;
        Top = -1;
        data = new String [Size];


    }

    public boolean isEmpty(){
        return Top==-1;

    }
    public boolean isFull(){
        return Top == Size-1;
    }
    public void push (String input){
        if(isFull()){
            System.out.println("Parkiran telah penuh");
        } else {
            data[++Top]= input;
            System.out.println(input+ " Didalam parkiran");


        }

    }
    public void pop () {
        if(isEmpty()){
            System.out.println(" parkiran kosong");
        } else {

            String temp = data[Top];
            data[Top]= data[Top--];
            System.out.println(temp+ " DIluar parkiran");

        }
    }

    public void infoStack(){
        System.out.println("kendaraan yang ada di parkiran: ");
        for(int i =0; i<=Top;i++){

            System.out.println("*" +data[i]);
        }






    }
}