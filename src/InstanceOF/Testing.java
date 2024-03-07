package InstanceOF;

import java.lang.management.ManagementFactory;

public class Testing {
    public static String methodof(Object o){
        if(o instanceof Integer){

            return "Integer";
        }
        if(o instanceof String){
            int l = ((String) o).length();
            return "String";
        }
        return "Object";
    }
    public static void main(String[] args) {
        String jvmName = ManagementFactory.getRuntimeMXBean().getVmName();
        int index = jvmName.indexOf('@');
        if(index!= -1){
            jvmName = jvmName.substring(0, index);
            System.out.println("Process Name: "+ jvmName);
        }

        System.out.println(methodof(10));
        System.out.println(methodof("Hello"));
    }
}
