import java.io.IOException;

import javax.naming.Context;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class EmployeeMapper extends Mapper<Object, Text, Text, Text> {

    private Text outKey = new Text();
    private Text outValue = new Text();

    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {

        String line = value.toString().trim();

        // Skip empty lines
        if (line.isEmpty()) return;

        String[] parts = line.split(",");

        // Data validation
        if (parts.length != 4) return;

        try {
            String employeeId = parts[0].trim();
            String firstName = parts[1].trim();
            String lastName = parts[2].trim();
            String department = parts[3].trim();

             if (employeeId.isEmpty()) return;
             
            // Validate fields
            if (employeeId.isEmpty() || firstName.isEmpty() ||
                lastName.isEmpty() || department.isEmpty()) {
                return;
            }

            outKey.set(employeeId);
            outValue.set("emp~" + firstName + "," + lastName + "," + department);

            context.write(outKey, outValue);

        } catch (Exception e) {
            // Ignore bad records
        }
    }
}