package com.example.pipelineex.core;

import com.google.gson.Gson;

public class Note {
    private long noteId;
    private String note;
    private String deliveryAdd;
    private boolean isDelivery;

    public Note(long noteId, String note, String deliveryAdd, boolean isDelivery) {
        this.noteId = noteId;
        this.note = note;
        this.deliveryAdd = deliveryAdd;
        this.isDelivery = isDelivery;
    }

    public long getNoteId() {
        return noteId;
    }

    public void setNoteId(long noteId) {
        this.noteId = noteId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDeliveryAdd() {
        return deliveryAdd;
    }

    public void setDeliveryAdd(String deliveryAdd) {
        this.deliveryAdd = deliveryAdd;
    }

    public boolean isDelivery() {
        return isDelivery;
    }

    public void setDelivery(boolean isDelivery) {
        this.isDelivery = isDelivery;
    }
    
    @Override
    public String toString() {
        return "Note [noteId=" + noteId + ", note=" + note + ", deliveryAdd=" + deliveryAdd + ", isDelivery="
                + isDelivery + "]";
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
