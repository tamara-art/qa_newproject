package phonebookframeworklesson16.fw;

import org.testng.annotations.DataProvider;
import phonebookframeworklesson16.model.UserLesson16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProvidersLesson16 {
    @DataProvider
    public Iterator<Object[]> newUsers(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{ new UserLesson16("michael@gmail.com","ZZxcv_1!")});
        list.add(new Object[]{ new UserLesson16("michael1@gmail.com","ZZxcv_1!")});
        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> newUsersFromFile() {
        List<Object[]> list = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/test/resources/usersPositive.csv"));
            String line = bufferedReader.readLine();
            while(line!=null){
                // line = "michael@gmail.com,ZZxcv_1!"
                String[] lineValues =  line.split(",");
                // lineValues = ["michael@gmail.com","ZZxcv_1!"]
                list.add(new Object[]{ new UserLesson16(lineValues[0],lineValues[1])});
                line = bufferedReader.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return list.iterator();
    }

}
