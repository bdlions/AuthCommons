/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bdlions.packet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author alamgir
 */
public class RequestPacketImpl implements IPacket {

    private IPacketHeader packetHeader;
    private String packetBody;
    private String remoteAddress;
    private int remotePort;

    public RequestPacketImpl(IPacketHeader packetHeader, String packetBody, String remoteAddress, int remotePort) {
        this.remoteAddress = remoteAddress;
        this.remotePort = remotePort;;
        this.packetBody = packetBody;
        this.packetHeader = packetHeader;
    }

    @Override
    public IPacketHeader getPacketHeader() {
        return packetHeader;
    }

    @Override
    public String getPacketBody() {
        return packetBody != null ? packetBody : null;
    }

    @Override
    public InetAddress getRemoteIP() {
        try {
            return InetAddress.getByName(remoteAddress);
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public int getRemotePort() {
        return remotePort;
    }

}
