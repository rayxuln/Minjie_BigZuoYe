package org.minjie.group27.bigzuoye;

import java.util.ArrayList;

public class App {
    public static void main(String[] args)
    {
        ArrayList<TodoListItem> list = new ArrayList<>();
        list.add(new TodoListItem("test1", "test1"));
        list.add(new TodoListItem("test2", "test2"));
        Database.save(list);

        var list_read = Database.read();

        for (int i = 0; i < 2; i++)
        {
            System.out.println(list_read.get(i).name.equals(list.get(i).name));
            System.out.println(list_read.get(i).name);
            System.out.println(list.get(i).name);
            System.out.println();
            System.out.println(list_read.get(i).description.equals(list.get(i).description));
            System.out.println(list_read.get(i).description);
            System.out.println(list.get(i).description);
            System.out.println();
        }
    }
}
