package com.example.pipelineex.core.entities;

import com.google.gson.Gson;

public class CreditNote {
    private long creditNote;
    private String notes;
    private boolean isCancellation;

    public CreditNote(long creditNote, String notes, boolean isCancellation) {
        this.creditNote = creditNote;
        this.notes = notes;
        this.isCancellation = isCancellation;
    }

    public long getCreditNote() {
        return creditNote;
    }

    public void setCreditNote(long creditNote) {
        this.creditNote = creditNote;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isCancellation() {
        return isCancellation;
    }

    public void setCancellation(boolean isCancellation) {
        this.isCancellation = isCancellation;
    }

    @Override
    public String toString() {
        return "CreditNote [creditNote=" + creditNote + ", notes=" + notes + ", isCancellation=" + isCancellation + "]";
    }
    
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
