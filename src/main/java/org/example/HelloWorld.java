package org.example;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.List;
import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) throws Exception{

        final ExecutionEnvironment env
                = ExecutionEnvironment.getExecutionEnvironment();

        //Create a list of products
        List<String> products
                = Arrays.asList("Mouse","Keyboard","Webcam");

        //Convert the list into a Flink DataSet
        DataSet<String> dsProducts
                = env.fromCollection(products);


        System.out.println("products count" + dsProducts.count() );
    }

}
