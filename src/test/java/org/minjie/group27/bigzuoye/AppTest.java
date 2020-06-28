package org.minjie.group27.bigzuoye;

import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;

public class AppTest {

    @Test
    public void testForTest(){
        assertTrue(true);
    }

    ArrayList<TodoListItem> addDataToDatabase()
    {
        ArrayList<TodoListItem> list = new ArrayList<>();
        list.add(new TodoListItem("test1", "test1"));
        list.add(new TodoListItem("test2", "test2"));

        Database.save(list);

        return list;
    }

    // test for Database
    @Test
    public void testDatabaseSaveAndRead()
    {
        var list = addDataToDatabase();
        var list_read = Database.read();

        for (int i = 0; i < 2; i++)
        {
            assertEquals(list.get(i).name, list_read.get(i).name);
            assertEquals(list.get(i).description, list_read.get(i).description);
        }
    }
//
//    // test for ToList
//    @Test
//    public void todoList_getItemByIndex_giveLastShouleReturnItemLast()
//    {
//        TodoList list = new TodoList();
//        list.read();
//
//        TodoListItem item = new TodoListItem("test_last_name", "test_last_description");
//
//        list.add(item);
//        list.save();
//
//        var index = list.getItems().size() - 1;
//        var temp = list.getItemByIndex(index);
//
//        assertEquals(item.name, temp.name);
//        assertEquals(item.description, temp.description);
//    }
//
//    @Test
//    public void todoList_delete_canDeleteLastItem()
//    {
//        TodoList list = new TodoList();
//        list.read();
//
//        TodoListItem item1 = new TodoListItem("test_delete_name_1", "test_delete_description_1");
//        TodoListItem item2 = new TodoListItem("test_delete_name_2", "test_delete_description_2");
//
//        list.add(item1);
//        list.add(item2);
//        list.save();
//
//        list.delete(list.getItems().size() - 1);
//        list.save();
//        list.read();
//
//        var index = list.getItems().size() - 1;
//        var temp = list.getItemByIndex(index);
//
//        assertEquals(item1.name, temp.name);
//        assertEquals(item1.description, item1.description);
//    }
//
//    @Test
//    public void todoList_finish_canFinishLastItem()
//    {
//        TodoList list = new TodoList();
//        list.read();
//
//        TodoListItem item1 = new TodoListItem("test_finish_name_1", "test_finish_description_1");
//        TodoListItem item2 = new TodoListItem("test_finish_name_2", "test_finish_description_2");
//        item2.unfinish();
//
//        list.add(item1);
//        list.add(item2);
//        list.save();
//
//        list.finish(list.getItems().size() - 1);
//        list.save();
//        list.read();
//
//        var index = list.getItems().size() - 1;
//        var temp = list.getItemByIndex(index);
//
//        assertEquals(TodoListItem.State.FINISHED, temp.getState());
//    }
//
//    @Test
//    public void todoList_unfinish_canUnfinishLastItem()
//    {
//        TodoList list = new TodoList();
//        list.read();
//
//        TodoListItem item1 = new TodoListItem("test_unfinish_name_1", "test_unfinish_description_1");
//        TodoListItem item2 = new TodoListItem("test_unfinish_name_2", "test_unfinish_description_2");
//        item2.finish();
//
//        list.add(item1);
//        list.add(item2);
//        list.save();
//
//        list.unfinish(list.getItems().size() - 1);
//        list.save();
//        list.read();
//
//        var index = list.getItems().size() - 1;
//        var temp = list.getItemByIndex(index);
//
//        assertEquals(TodoListItem.State.UNFINISHED, temp.getState());
//    }
}
