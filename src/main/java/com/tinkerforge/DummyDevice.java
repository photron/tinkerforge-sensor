package com.tinkerforge;

import berlin.yuna.tinkerforgesensor.util.Base58;

import java.util.UUID;

public class DummyDevice extends Device {

    private final Identity identity = prepareIdentity();

    public DummyDevice() {
        this(Base58.encode(UUID.randomUUID().toString().getBytes()), new IPConnection());
    }

    public DummyDevice(String uid, IPConnection ipCon) {
        super(uid, ipCon);
        apiVersion[0] = 0;
        apiVersion[1] = 0;
        apiVersion[2] = 1;
    }

    @Override
    public Identity getIdentity() {
        return identity == null ? prepareIdentity() : identity;
    }

    private Identity prepareIdentity() {
        Identity identity = new Identity();
        identity.uid = UUID.randomUUID().toString();
        identity.connectedUid = UUID.randomUUID().toString();
        identity.position = '\n';
        identity.firmwareVersion = apiVersion;
        identity.deviceIdentifier = -1;
        identity.hardwareVersion = apiVersion;
        return identity;
    }
}
