/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bdlions.packet;

import java.net.InetAddress;

/**
 *
 * @author alamgir
 */
public interface IPacket {
    IPacketHeader getPacketHeader();
    String getPacketBody();
    InetAddress getRemoteIP();
    int getRemotePort();
}
