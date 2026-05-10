package task15;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;



public class AgeMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

    private Text ageGroup = new Text();
    private IntWritable incomeValue = new IntWritable();

    @Override
    protected void map(LongWritable key, Text value, Context context)
            throws IOException, InterruptedException {

        String line = value.toString();
        String[] parts = line.split(",");

        if (parts.length < 5)
            return;


        try {

            int age = (int) Double.parseDouble(parts[1].trim());
            int income = (int) Double.parseDouble(parts[2].trim());

            if (age >= 18 && age <= 30) {
                ageGroup.set("18-30");
            } else if (age >= 31 && age <= 50) {
                ageGroup.set("31-50");
            } else if (age >= 51) {
                ageGroup.set("51+");
            } else {
                return;
            }

               incomeValue.set(income);

            context.write(ageGroup, incomeValue);

        } catch (Exception e) {
            return;
        }
    }
}

