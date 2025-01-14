package berlin.yuna.tinkerforgesensor.model.sensor;

import berlin.yuna.tinkerforgesensor.model.exception.NetworkConnectionException;
import berlin.yuna.tinkerforgesensor.model.sensor.Sensor;
import com.tinkerforge.BrickDC;
import com.tinkerforge.Device;
import com.tinkerforge.TinkerforgeException;

import static berlin.yuna.tinkerforgesensor.model.SensorRegistry.CALLBACK_PERIOD;
import static berlin.yuna.tinkerforgesensor.model.sensor.Sensor.LedStatusType.LED_ADDITIONAL_OFF;
import static berlin.yuna.tinkerforgesensor.model.sensor.Sensor.LedStatusType.LED_NONE;
import static berlin.yuna.tinkerforgesensor.model.sensor.Sensor.LedStatusType.LED_STATUS_OFF;
import static berlin.yuna.tinkerforgesensor.model.sensor.Sensor.LedStatusType.LED_STATUS_ON;
import static berlin.yuna.tinkerforgesensor.model.type.ValueType.CURRENT;
import static berlin.yuna.tinkerforgesensor.model.type.ValueType.DEVICE_TIMEOUT;
import static berlin.yuna.tinkerforgesensor.model.type.ValueType.EMERGENCY_SHUTDOWN;
import static berlin.yuna.tinkerforgesensor.model.type.ValueType.VOLTAGE;

public class DC extends Sensor<BrickDC> {

    public DC(final Device device, final String uid) throws NetworkConnectionException {
        super((BrickDC) device, uid);
    }

    @Override
    protected Sensor<BrickDC> initListener() {
        device.addEmergencyShutdownListener(() -> sendEvent(EMERGENCY_SHUTDOWN, 1L));
        device.addCurrentVelocityListener(value -> sendEvent(CURRENT, (long) value));
        device.addUnderVoltageListener(value -> sendEvent(VOLTAGE, (long) value));
        refreshPeriod(CALLBACK_PERIOD);
        return this;
    }

    @Override
    public Sensor<BrickDC> send(final Object value) {
        return this;
    }

    @Override
    public Sensor<BrickDC> setLedStatus(final Integer value) {
        if (ledAdditional.bit == value) return this;
        try {
            if (value == LED_STATUS_ON.bit) {
                ledStatus = LED_STATUS_ON;
                device.enableStatusLED();
            } else if (value == LED_STATUS_OFF.bit) {
                ledStatus = LED_STATUS_OFF;
                device.disableStatusLED();
            }
        } catch (TinkerforgeException ignored) {
            sendEvent(DEVICE_TIMEOUT, 404L);
        }
        return this;
    }

    @Override
    public Sensor<BrickDC> ledAdditional(final Integer value) {
        return this;
    }

    @Override
    public Sensor<BrickDC> initLedConfig() {
        try {
            ledStatus = device.isStatusLEDEnabled() ? LED_STATUS_ON : LED_ADDITIONAL_OFF;
            ledAdditional = LED_NONE;
        } catch (TinkerforgeException ignored) {
            sendEvent(DEVICE_TIMEOUT, 404L);
        }
        return this;
    }

    @Override
    public Sensor<BrickDC> refreshPeriod(final int milliseconds) {
        try {
            if (milliseconds < 1) {
                device.setCurrentVelocityPeriod(0);
                sendEvent(CURRENT, (long) device.getVelocity());
            } else {
                device.setCurrentVelocityPeriod(milliseconds);
            }
        } catch (TinkerforgeException ignored) {
            sendEvent(DEVICE_TIMEOUT, 404L);
        }
        return this;
    }
}
