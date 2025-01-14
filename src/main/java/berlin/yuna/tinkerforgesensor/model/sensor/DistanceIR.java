package berlin.yuna.tinkerforgesensor.model.sensor;

import berlin.yuna.tinkerforgesensor.model.exception.NetworkConnectionException;
import berlin.yuna.tinkerforgesensor.model.type.ValueType;
import com.tinkerforge.BrickletDistanceIR;
import com.tinkerforge.Device;
import com.tinkerforge.TinkerforgeException;

import static berlin.yuna.tinkerforgesensor.model.SensorRegistry.CALLBACK_PERIOD;
import static berlin.yuna.tinkerforgesensor.model.sensor.Sensor.LedStatusType.LED_NONE;
import static berlin.yuna.tinkerforgesensor.model.type.ValueType.DEVICE_TIMEOUT;
import static berlin.yuna.tinkerforgesensor.model.type.ValueType.DISTANCE;

/**
 * <h3>{@link DistanceIR}</h3><br />
 * <i>Measures distance up to 150cm with infrared light</i><br />
 *
 * <h3>Values</h3>
 * <ul>
 * <li>{@link ValueType#DISTANCE} [x / 10.0 = cm]</li>
 * </ul>
 * <h3>Technical Info</h3>
 * <ul>
 * <li><a href="https://www.tinkerforge.com/de/doc/Hardware/Bricklets/Distance_IR.html">Official documentation</a></li>
 * </ul>
 * <h6>Getting distance examples</h6>
 * <code>
 * stack.values().distance();
 * stack.values().distance();
 * stack.values().distance();
 * stack.values().distance();
 * stack.values().distance();
 * </code>
 */
public class DistanceIR extends Sensor<BrickletDistanceIR> {

    public DistanceIR(final Device device, final String uid) throws NetworkConnectionException {
        super((BrickletDistanceIR) device, uid);
    }

    @Override
    protected Sensor<BrickletDistanceIR> initListener() {
        refreshPeriod(CALLBACK_PERIOD);
        device.addDistanceListener(value -> sendEvent(DISTANCE, (long) value));
        return this;
    }

    @Override
    public Sensor<BrickletDistanceIR> send(final Object value) {
        return this;
    }

    @Override
    public Sensor<BrickletDistanceIR> setLedStatus(final Integer value) {
        return this;
    }

    @Override
    public Sensor<BrickletDistanceIR> ledAdditional(final Integer value) {
        return this;
    }

    @Override
    public Sensor<BrickletDistanceIR> initLedConfig() {
        ledStatus = LED_NONE;
        ledAdditional = LED_NONE;
        return this;
    }

    @Override
    public Sensor<BrickletDistanceIR> refreshPeriod(final int milliseconds) {
        try {
            if (milliseconds < 1) {
                device.setDistanceCallbackPeriod(0);
            } else {
                device.setDistanceCallbackPeriod(milliseconds);
            }
            sendEvent(DISTANCE, (long) device.getDistance() * 10);
        } catch (TinkerforgeException ignored) {
            sendEvent(DEVICE_TIMEOUT, 404L);
        }
        return this;
    }
}
