package org.minjie.group27.bigzuoye;

import java.io.*;
import java.util.ArrayList;

public class Database {
    public static void save(ArrayList<TodoListItem> items) {
        try {
            File f = new File("todo.txt");
            FileOutputStream fop = new FileOutputStream(f);
            OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");

            for (int i = 0; i < items.size(); i++) {
                writer.append(items.get(i).getName().toString());
                writer.append(" ");
                writer.append(items.get(i).getDescription().toString());
                writer.append(" ");
                writer.append(items.get(i).getState().toString());
                writer.append(" ");
                writer.append(items.get(i).getIndex().toString());
                writer.append("\n");
            }

            writer.close();
            fop.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }

    public static ArrayList<TodoListItem> read() {
        ArrayList<TodoListItem> resultArr = new ArrayList<TodoListItem>();
        try {
            File f = new File("todo.txt");
            if(!f.exists()) {
                return resultArr;
            }

            InputStream is = new FileInputStream(f);
            String line;
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            line = reader.readLine();
            while (line != null) {
                String[] storeItems = line.split(" ");
                resultArr.add(new TodoListItem(storeItems[0].trim(), storeItems[1].trim(),
                            TodoListItem.State.valueOf(storeItems[2]), Integer.parseInt(storeItems[3])));

                line = reader.readLine();
            }
            reader.close();
            is.close();

        } catch (IOException e) {
            System.out.print("Exception");
        }

        return resultArr;
    }
}