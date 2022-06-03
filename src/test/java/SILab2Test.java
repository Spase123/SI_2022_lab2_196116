import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    void everyStatementAndBranchTest() {
        List<String> list1=new ArrayList<>();
        assertThrows(IllegalArgumentException.class,() -> SILab2.function(list1));
        List<String> list2=new ArrayList<>();
        list2.add("0");
        list2.add("#");
        list2.add("0");
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(list2));
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("0");
        list.add("#");
        list.add("0");
        list.add("0");
        list.add("#");
        List<String> result=new ArrayList<>();
        result.add("2");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("3");
        result.add("#");
        result.add("1");
        result.add("1");
        result.add("#");
        assertLinesMatch(result,SILab2.function(list));
    }

    @Test
    void multipleConditionsTest() {
        //7,8
        List<String> list=new ArrayList<>();

        assertThrows(IllegalArgumentException.class,() -> SILab2.function(list));

        //7,10,11,12,13
        List<String> list1=new ArrayList<>();
        list1.add("0");
        list1.add("#");
        list1.add("0");
        assertThrows(IllegalArgumentException.class,() -> SILab2.function(list1));

        //7,10,11,12,15,16.1,16.2,39 can not happen because list.size() > 0

        //7,10,11,12,15,16.1,16.2,17,35,36,16.3,16.2,39
        list1.clear();
        list1.add("#");
        assertLinesMatch(list1,SILab2.function(list1));

        //7,10,11,12,15,16.1,16.2,(17,18,19,20,23,24,27,28,30,33,16.3,16.2),39
        List<String> list2=new ArrayList<>();
        list2.add("#");
        list2.add("#");
        list2.add("0");
        list2.add("#");
        List<String> result=new ArrayList<>();
        result.add("#");
        result.add("#");
        result.add("2");
        result.add("#");
        assertLinesMatch(result,SILab2.function(list2));
        list2.clear();
        result.clear();

        //7,10,11,12,15,16.1,16.2,(17,18,19,20,21,24,27,28,30,31,33,16.3,16.2),39
        list2.add("#");
        list2.add("#");
        list2.add("#");
        list2.add("#");
        list2.add("0");
        list2.add("#");
        list2.add("#");
        list2.add("#");
        list2.add("#");

        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("4");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list2));
        list2.clear();
        result.clear();

        //7,10,11,12,15,16.1,16.2,(17,18,19,20,23,24,27,28,30,31,33,16.3,16.2),39
        list2.add("#");
        list2.add("#");
        list2.add("#");
        list2.add("0");
        list2.add("#");
        list2.add("#");
        list2.add("#");
        list2.add("#");
        list2.add("#");

        result.add("#");
        result.add("#");
        result.add("#");
        result.add("3");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list2));
        list2.clear();
        result.clear();

        //7,10,11,12,15,16.1,16.2,(17,18,19,20,23,24,27,30,31,33,16.3,16.2),39
        list2.add("0");
        list2.add("#");
        list2.add("#");
        list2.add("0");
        list2.add("#");
        list2.add("#");
        list2.add("#");
        list2.add("#");
        list2.add("#");

        result.add("1");
        result.add("#");
        result.add("#");
        result.add("2");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list2));
        list2.clear();
        result.clear();

        //7,10,11,12,15,16.1,16.2,(17,18,19,20,21,27,30,33,16.3,16.2),39
        list2.add("#");
        list2.add("0");
        list2.add("#");
        list2.add("#");
        list2.add("0");
        list2.add("#");
        list2.add("#");
        list2.add("0");
        list2.add("#");

        result.add("#");
        result.add("2");
        result.add("#");
        result.add("#");
        result.add("2");
        result.add("#");
        result.add("#");
        result.add("2");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list2));
        list2.clear();
        result.clear();

        //7,10,11,12,15,16.1,16.2,(17,18,19,27,28,30,31,33,16.3,16.2),39
        list2.add("#");
        list2.add("#");
        list2.add("#");
        list2.add("0");
        list2.add("0");
        list2.add("0");
        list2.add("#");
        list2.add("#");
        list2.add("#");

        result.add("#");
        result.add("#");
        result.add("#");
        result.add("2");
        result.add("2");
        result.add("2");
        result.add("#");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list2));
        list2.clear();
        result.clear();

        //7,10,11,12,15,16.1,16.2,(17,18,19,27,30,31,33,16.3,16.2),39
        list2.add("0");
        list2.add("0");
        list2.add("0");
        list2.add("0");
        list2.add("0");
        list2.add("0");
        list2.add("#");
        list2.add("#");
        list2.add("#");

        result.add("0");
        result.add("0");
        result.add("0");
        result.add("1");
        result.add("1");
        result.add("1");
        result.add("#");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list2));
        list2.clear();
        result.clear();

        //7,10,11,12,15,16.1,16.2,(17,18,19,27,28,30,33,16.3,16.2),39
        list2.add("#");
        list2.add("#");
        list2.add("#");
        list2.add("0");
        list2.add("0");
        list2.add("0");
        list2.add("0");
        list2.add("0");
        list2.add("0");

        result.add("#");
        result.add("#");
        result.add("#");
        result.add("1");
        result.add("1");
        result.add("1");
        result.add("0");
        result.add("0");
        result.add("0");

        assertLinesMatch(result,SILab2.function(list2));
        list2.clear();
        result.clear();
    }

    @Test
    void multipleConditionTest() {
        // if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) )
        //F || T
        List<String> list=new ArrayList<>();
        List<String> result=new ArrayList<>();
        //(T && F) || (T && T)
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");

        result.add("1");
        result.add("2");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        //(F && T) || (T && T)
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("0");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");

        result.add("0");
        result.add("2");
        result.add("#");
        result.add("2");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        //(F && F) || (T && T)
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");

        result.add("0");
        result.add("1");
        result.add("1");
        result.add("2");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        //T || X
        //(T && T) || X
        list.add("#");
        list.add("0");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");

        result.add("#");
        result.add("3");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        //F || F
        //(T && F) || (T && F)
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");

        result.add("1");
        result.add("1");
        result.add("1");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        //F || F
        //(T && F) || (F && T)
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");

        result.add("1");
        result.add("1");
        result.add("1");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        //F || F
        //(T && F) || (F && F)
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");

        result.add("0");
        result.add("1");
        result.add("1");
        result.add("2");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        //F || F
        //(F && T) || (T && F)
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");

        result.add("0");
        result.add("1");
        result.add("#");
        result.add("1");
        result.add("2");
        result.add("#");
        result.add("#");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        //F || F
        //(F && T) || (F && T)
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("#");
        list.add("#");

        result.add("0");
        result.add("1");
        result.add("#");
        result.add("1");
        result.add("1");
        result.add("2");
        result.add("#");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        //F || F
        //(F && T) || (F && F)
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("#");

        result.add("0");
        result.add("1");
        result.add("#");
        result.add("0");
        result.add("1");
        result.add("2");
        result.add("1");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        //F || F
        //(F && F) || (T && F)
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("#");

        result.add("0");
        result.add("0");
        result.add("0");
        result.add("0");
        result.add("1");
        result.add("1");
        result.add("1");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        //F || F
        //(F && F) || (F && F)
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("#");

        result.add("0");
        result.add("0");
        result.add("0");
        result.add("0");
        result.add("1");
        result.add("1");
        result.add("1");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        //F || F
        //(F && F) || (F && T)
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("#");

        result.add("0");
        result.add("0");
        result.add("0");
        result.add("0");
        result.add("1");
        result.add("1");
        result.add("1");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();


        // if (i + rootOfN < n && list.get(i + rootOfN).equals("#"))
        //T && T
        list.add("#");
        list.add("0");
        list.add("#");
        list.add("#");

        result.add("#");
        result.add("2");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        // if (i + rootOfN < n && list.get(i + rootOfN).equals("#"))
        //F && X
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("0");

        result.add("#");
        result.add("#");
        result.add("#");
        result.add("2");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        // if (i + rootOfN < n && list.get(i + rootOfN).equals("#"))
        //T && F
        list.add("#");
        list.add("0");
        list.add("#");
        list.add("0");

        result.add("#");
        result.add("1");
        result.add("#");
        result.add("1");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        // if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#"))
        //T && T
        list.add("#");
        list.add("#");
        list.add("0");
        list.add("#");

        result.add("#");
        result.add("#");
        result.add("2");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        // if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#"))
        //F && X
        list.add("#");
        list.add("0");
        list.add("#");
        list.add("#");

        result.add("#");
        result.add("2");
        result.add("#");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();

        // if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#"))
        //T && F
        list.add("0");
        list.add("#");
        list.add("0");
        list.add("#");

        result.add("1");
        result.add("#");
        result.add("1");
        result.add("#");

        assertLinesMatch(result,SILab2.function(list));
        list.clear();
        result.clear();
    }
}
