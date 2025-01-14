package berlin.yuna.tinkerforgesensor.model.sensor;

import berlin.yuna.tinkerforgesensor.model.exception.NetworkConnectionException;
import berlin.yuna.tinkerforgesensor.model.type.ValueType;
import com.tinkerforge.BrickletAirQuality;
import com.tinkerforge.Device;
import com.tinkerforge.TinkerforgeException;

import static berlin.yuna.tinkerforgesensor.model.sensor.Sensor.LedStatusType.LED_NONE;
import static berlin.yuna.tinkerforgesensor.model.sensor.Sensor.LedStatusType.LED_STATUS;
import static berlin.yuna.tinkerforgesensor.model.sensor.Sensor.LedStatusType.LED_STATUS_HEARTBEAT;
import static berlin.yuna.tinkerforgesensor.model.sensor.Sensor.LedStatusType.LED_STATUS_OFF;
import static berlin.yuna.tinkerforgesensor.model.sensor.Sensor.LedStatusType.LED_STATUS_ON;
import static berlin.yuna.tinkerforgesensor.model.type.ValueType.AIR_PRESSURE;
import static berlin.yuna.tinkerforgesensor.model.type.ValueType.DEVICE_TIMEOUT;
import static berlin.yuna.tinkerforgesensor.model.type.ValueType.HUMIDITY;
import static berlin.yuna.tinkerforgesensor.model.type.ValueType.IAQ_INDEX;
import static berlin.yuna.tinkerforgesensor.model.type.ValueType.TEMPERATURE;

/**
 * <h3>{@link AirQuality}</h3><br />
 * <i>Measures acceleration in three axis</i><br />
 *
 * <h3>Values</h3>
 * <ul>
 * <li>{@link ValueType#IAQ_INDEX} [x = IAQ]</li>
 * <li>{@link ValueType#TEMPERATURE} [x / 100.0 = °C]</li>
 * <li>{@link ValueType#HUMIDITY} [x / 100.0 = %RH]</li>
 * <li>{@link ValueType#AIR_PRESSURE} [x / 1000.0 = mbar]</li>
 * </ul>
 * <h3>Technical Info</h3>
 * <ul>
 * <li><a href="https://www.tinkerforge.com/en/doc/Hardware/Bricklets/Air_Quality.html">Official documentation</a></li>
 * </ul>
 * <h6>Getting air pressure examples</h6>
 * <code>
 * stack.values().airPressure();
 * stack.values().airPressure_Avg();
 * stack.values().airPressure_Min();
 * stack.values().airPressure_Max();
 * stack.values().airPressure_Sum();
 * </code>
 */
public class AirQuality extends Sensor<BrickletAirQuality> {

    public AirQuality(final Device device, final String uid) throws NetworkConnectionException {
        super((BrickletAirQuality) device, uid);
    }

    @Override
    protected Sensor<BrickletAirQuality> initListener() {
        refreshPeriod(1);
        device.addAllValuesListener((iaqIndex, iaqIndexAccuracy, temperature, humidity, airPressure) ->
        {
            sendEvent(IAQ_INDEX, (long) iaqIndex);
            sendEvent(TEMPERATURE, (long) temperature);
            sendEvent(HUMIDITY, (long) humidity);
            sendEvent(AIR_PRESSURE, (long) airPressure * 10);
        });
        return this;
    }

    @Override
    public Sensor<BrickletAirQuality> send(final Object value) {
        return this;
    }

    @Override
    public Sensor<BrickletAirQuality> setLedStatus(final Integer value) {
        if (ledStatus.bit == value) return this;
        try {
            if (value == LED_STATUS_OFF.bit) {
                ledStatus = LED_STATUS_OFF;
                device.setStatusLEDConfig((short) LED_STATUS_OFF.bit);
            } else if (value == LED_STATUS_ON.bit) {
                ledStatus = LED_STATUS_ON;
                device.setStatusLEDConfig((short) LED_STATUS_ON.bit);
            } else if (value == LED_STATUS_HEARTBEAT.bit) {
                ledStatus = LED_STATUS_HEARTBEAT;
                device.setStatusLEDConfig((short) LED_STATUS_HEARTBEAT.bit);
            } else if (value == LED_STATUS.bit) {
                ledStatus = LED_STATUS;
                device.setStatusLEDConfig((short) LED_STATUS.bit);
            }
        } catch (TinkerforgeException ignored) {
            sendEvent(DEVICE_TIMEOUT, 404L);
        }
        return this;
    }

    @Override
    public Sensor<BrickletAirQuality> ledAdditional(final Integer value) {
        if (ledAdditional.bit == value) return this;
        return this;
    }

    @Override
    public Sensor<BrickletAirQuality> refreshPeriod(final int milliseconds) {
        try {
            if (milliseconds < 1) {
                device.setAllValuesCallbackConfiguration(1000, false);
            } else {
                device.setAllValuesCallbackConfiguration(milliseconds, true);
            }
            final BrickletAirQuality.AllValues allValues = device.getAllValues();
            sendEvent(IAQ_INDEX, (long) allValues.iaqIndex);
            sendEvent(TEMPERATURE, (long) allValues.temperature);
            sendEvent(HUMIDITY, (long) allValues.humidity);
            sendEvent(AIR_PRESSURE, (long) allValues.airPressure);
        } catch (TinkerforgeException ignored) {
            sendEvent(DEVICE_TIMEOUT, 404L);
        }
        return this;
    }

    @Override
    public Sensor<BrickletAirQuality> initLedConfig() {
        try {
            ledStatus = LedStatusType.ledStatusTypeOf(device.getStatusLEDConfig());
            ledAdditional = LED_NONE;
        } catch (TinkerforgeException ignored) {
            sendEvent(DEVICE_TIMEOUT, 404L);
        }
        return this;
    }
}
