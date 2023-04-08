package com.bridgelabz.AssignmentThree.model;

public class Messages {

    private long id;
    private String message;

    //////////////////// ::  Parameterised Constructor  :: ////////////////////
    public Messages(long id, String messages) {
        this.id = id;
        this.message = messages;
    }

    //////////////////// ::  Getter & Setter  :: ////////////////////
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Messages :: {" +'\n'+
                "id = " + id +
                "  ||   message = '" + message + '\n' +
                '}';
    }
}

