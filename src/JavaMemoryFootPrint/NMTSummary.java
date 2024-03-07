package JavaMemoryFootPrint;

import com.sun.management.DiagnosticCommandMBean;
import java.lang.management.ManagementFactory;
import javax.management.MBeanServer;
import javax.management.ObjectName;

public class NMTSummary {
    public static void main(String[] args) {
        try {
            MBeanServer server = ManagementFactory.getPlatformMBeanServer();
            ObjectName name = new ObjectName("com.sun.management:type=DiagnosticCommand");
            DiagnosticCommandMBean mbean = ManagementFactory.newPlatformMXBeanProxy(
                server, name.toString(), DiagnosticCommandMBean.class);

            // Get the native memory tracking summary
            String nmtSummary = (String) mbean.invoke("VM.native_memory summary", null, null);
            System.out.println(nmtSummary);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}