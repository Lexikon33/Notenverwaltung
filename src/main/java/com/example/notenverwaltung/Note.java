package com.example.notenverwaltung;

public class Note {

    private String nameNote;

     public String getNameNote(){
         return nameNote;
    }

    private int note;

    public int getNote(){
        return note;
    }


    public Note(int note,String nameNote){

          this.note = note;

          this.nameNote = nameNote;
    }
}
