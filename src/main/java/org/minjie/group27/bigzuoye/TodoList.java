package org.minjie.group27.bigzuoye;

import java.util.ArrayList;

public class TodoList {

    ArrayList<TodoListItem> todoListItems;

    public TodoList(){
        todoListItems = new ArrayList<>();
    }

    public TodoListItem getItemByIndex(Integer index){
        for(int i=0;i<todoListItems.size();++i){
            if(todoListItems.get(i).getIndex().equals(index))
            {
                return todoListItems.get(i);
            }
        }
        return null;
    }

    public ArrayList<TodoListItem> getItems(){
        return todoListItems;
    }

    public void add(String name, String description){
        add(new TodoListItem(name, description));
    }

    public void add(TodoListItem item){
        todoListItems.add(item);
    }

    public boolean delete(Integer index){
        TodoListItem item = getItemByIndex(index);
        if(item != null){
            todoListItems.remove(item);
            return true;
        }
        return false;
    }

    public boolean finish(Integer index){
        TodoListItem item = getItemByIndex(index);
        if(item != null){
            item.finish();
            return true;
        }
        return false;
    }

    public boolean unfinish(Integer index){
        TodoListItem item = getItemByIndex(index);
        if(item != null){
            item.unfinish();
            return true;
        }
        return false;
    }

    public void save(){
        Database.open("data.db");
        Database.save(todoListItems);
        Database.close();
    }

    public void read(){
        Database.open("data.db");
        todoListItems = Database.read();
        Database.close();
    }

}
