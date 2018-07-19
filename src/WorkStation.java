/**
 * Created by Fady Guirguis.
 */

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class WorkStation {
    public static void main(String[] args) {

        InetAddress ip;
        try {

            ip = InetAddress.getLocalHost();
            long maxMemory = Runtime.getRuntime().maxMemory();
            String javaVersion = System.getProperty("java.version");
            System.out.println(
                    "\nYour Current Computer information :" +
                            "\nCurrent host name : " + ip.getHostName() +
                            "\nCurrent IP address : " + ip.getHostAddress() +
                            "\nName of the OS: " + System.getProperty("os.name") +
                            "\nVersion of the OS: " + System.getProperty("os.version") +
                            "\nArchitecture of The OS: " + System.getProperty("os.arch") +
                            "\nProcessors_IDENTIFIER: " + System.getenv("PROCESSOR_IDENTIFIER") +
                            "\nAvailable processors (cores): " + Runtime.getRuntime().availableProcessors() +
                            "\nFree memory (bytes): " + Runtime.getRuntime().freeMemory() +
                            "\nMaximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory) +
                            "\nTotal memory available (bytes): " + Runtime.getRuntime().totalMemory() +
                            "\nJava Version " + javaVersion);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}