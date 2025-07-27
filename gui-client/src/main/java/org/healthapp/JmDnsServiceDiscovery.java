package org.healthapp;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class JmDnsServiceDiscovery {
    public static ServiceInfo discoverService(String serviceType, String serviceName) {
        try (JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost())) {
            ServiceInfo[] infos = jmdns.list(serviceType, 2000); // 2 second timeout
            for (ServiceInfo info : infos) {
                if (info.getName().equals(serviceName)) {
                    return info;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

