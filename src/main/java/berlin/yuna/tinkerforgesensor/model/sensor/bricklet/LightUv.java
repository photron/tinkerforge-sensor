package berlin.yuna.tinkerforgesensor.model.sensor.bricklet;

import berlin.yuna.tinkerforgesensor.model.exception.NetworkConnectionException;
import com.tinkerforge.BrickletUVLight;
import com.tinkerforge.Device;
import com.tinkerforge.NotConnectedException;
import com.tinkerforge.TimeoutException;

import static berlin.yuna.tinkerforgesensor.model.SensorRegistry.CALLBACK_PERIOD;
import static berlin.yuna.tinkerforgesensor.model.type.ValueType.DEVICE_TIMEOUT;
import static berlin.yuna.tinkerforgesensor.model.type.ValueType.LIGHT_UV;

/**
 * Measures UV light
 *  <b>Values</b>
 *  LIGHT_UV[index] = n / 10.0
 *  <br /><a href="https://www.tinkerforge.com/de/doc/Hardware/Bricklets/UV_Light.html">Official doku</a>
 */
public class LightUv extends Sensor<BrickletUVLight> {

    public LightUv(final Device device, final Sensor parent, final String uid) throws NetworkConnectionException {
        super((BrickletUVLight) device, parent, uid, false);
    }

    @Override
    protected Sensor<BrickletUVLight> initListener() {
        try {
            device.addUVLightListener(value -> sendEvent(LIGHT_UV, value));
            device.setUVLightCallbackPeriod(CALLBACK_PERIOD);
        } catch (TimeoutException | NotConnectedException ignored) {
            sendEvent(DEVICE_TIMEOUT, 404L);
        }
        return this;
    }

    @Override
    public Sensor<BrickletUVLight> value(final Object value) {
        return this;
    }

    @Override
    public Sensor<BrickletUVLight> ledStatus(final Integer value) {
        return this;
    }

    @Override
    public Sensor<BrickletUVLight> ledAdditional(final Integer value) {
        return this;
    }
}