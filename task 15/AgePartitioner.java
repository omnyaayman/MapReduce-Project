package task15;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;


public class AgePartitioner extends Partitioner<Text, IntWritable> {

    @Override
    public int getPartition(Text key, IntWritable value, int numPartitions) {

        String group = key.toString();

        if (group.equals("18-30")) {

               return 0;
        } else if (group.equals("31-50")) {
            return 1;
        } else {
            return 2;
        }
    }
}



