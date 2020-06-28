package org.minjie.group27.bigzuoye;

public class TodoListItem {
    static Integer globalIndex = 0;
    static public Integer getNextIndex(){
        return globalIndex++;
    }

    Integer index;
    String name;

    String description;

    public enum State{
        UNFINISHED,
        FINISHED
    }

    State state;

    public TodoListItem(String name, String description){
        this.index = getNextIndex();
        this.name = name;
        this.description = description;
        this.state = State.UNFINISHED;
    }

    public TodoListItem(String name, String description, State state, Integer index){
        this.index = index;
        this.name = name;
        this.description = description;
        this.state = state;
    }

    public Integer getIndex(){
        return index;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public State getState(){
        return state;
    }
    public void setState(State state){
        this.state = state;
    }
    public void finish(){
        setState(State.FINISHED);
    }
    public void unfinish(){
        setState(State.UNFINISHED);
    }

    public String toString(){
        return "[" +
                index +
                "]" +
                name +
                ": " +
                description;
    }
}
