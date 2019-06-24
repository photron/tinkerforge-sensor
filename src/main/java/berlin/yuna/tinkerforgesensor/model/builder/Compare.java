package berlin.yuna.tinkerforgesensor.model.builder;

import berlin.yuna.tinkerforgesensor.model.sensor.Accelerometer;
import berlin.yuna.tinkerforgesensor.model.sensor.AccelerometerV2;
import berlin.yuna.tinkerforgesensor.model.sensor.AirQuality;
import berlin.yuna.tinkerforgesensor.model.sensor.Barometer;
import berlin.yuna.tinkerforgesensor.model.sensor.BarometerV2;
import berlin.yuna.tinkerforgesensor.model.sensor.ButtonRGB;
import berlin.yuna.tinkerforgesensor.model.sensor.DC;
import berlin.yuna.tinkerforgesensor.model.sensor.Default;
import berlin.yuna.tinkerforgesensor.model.sensor.DisplayLcd128x64;
import berlin.yuna.tinkerforgesensor.model.sensor.DisplayLcd20x4;
import berlin.yuna.tinkerforgesensor.model.sensor.DisplaySegment;
import berlin.yuna.tinkerforgesensor.model.sensor.DisplaySegmentV2;
import berlin.yuna.tinkerforgesensor.model.sensor.DistanceIR;
import berlin.yuna.tinkerforgesensor.model.sensor.DistanceIRV2;
import berlin.yuna.tinkerforgesensor.model.sensor.DistanceUS;
import berlin.yuna.tinkerforgesensor.model.sensor.DualButton;
import berlin.yuna.tinkerforgesensor.model.sensor.Humidity;
import berlin.yuna.tinkerforgesensor.model.sensor.HumidityV2;
import berlin.yuna.tinkerforgesensor.model.sensor.IMU;
import berlin.yuna.tinkerforgesensor.model.sensor.IMUV2;
import berlin.yuna.tinkerforgesensor.model.sensor.IO16;
import berlin.yuna.tinkerforgesensor.model.sensor.IO16V2;
import berlin.yuna.tinkerforgesensor.model.sensor.LightAmbient;
import berlin.yuna.tinkerforgesensor.model.sensor.LightAmbientV2;
import berlin.yuna.tinkerforgesensor.model.sensor.LightAmbientV3;
import berlin.yuna.tinkerforgesensor.model.sensor.LightColor;
import berlin.yuna.tinkerforgesensor.model.sensor.LightUv;
import berlin.yuna.tinkerforgesensor.model.sensor.LightUvV2;
import berlin.yuna.tinkerforgesensor.model.sensor.Master;
import berlin.yuna.tinkerforgesensor.model.sensor.MotionDetector;
import berlin.yuna.tinkerforgesensor.model.sensor.MotionDetectorV2;
import berlin.yuna.tinkerforgesensor.model.sensor.RotaryV2;
import berlin.yuna.tinkerforgesensor.model.sensor.Sensor;
import berlin.yuna.tinkerforgesensor.model.sensor.Servo;
import berlin.yuna.tinkerforgesensor.model.sensor.SoundIntensity;
import berlin.yuna.tinkerforgesensor.model.sensor.SoundPressure;
import berlin.yuna.tinkerforgesensor.model.sensor.Speaker;
import berlin.yuna.tinkerforgesensor.model.sensor.Temperature;
import berlin.yuna.tinkerforgesensor.model.sensor.TemperatureV2;
import berlin.yuna.tinkerforgesensor.model.sensor.Tilt;
import java.lang.Class;

/**
 * Autogenerated with [GeneratorCompare:generate]
 */
public class Compare {
    private final Sensor sensor;

    public Compare(final Sensor sensor) {
        this.sensor = sensor;
    }

    public boolean is(final Sensor... sensors) {
        for (Sensor sensor : sensors) {
            if (sensor != null && sensor.uid.equals(this.sensor.uid)) {
                return true;
            }
        }
        return false;
    }

    public boolean is(final Class... sensorOrDevices) {
        for (Class sensorOrDevice : sensorOrDevices) {
            if (sensor.getClass() == sensorOrDevice || sensor.getType() == sensorOrDevice) {
                return true;
            }
        }
        return false;
    }

    public boolean isAccelerometer() {
        return is(AccelerometerV2.class, Accelerometer.class);
    }

    public boolean isAirQuality() {
        return is(AirQuality.class);
    }

    public boolean isBarometer() {
        return is(BarometerV2.class, Barometer.class);
    }

    public boolean isButtonRGB() {
        return is(ButtonRGB.class);
    }

    public boolean isDC() {
        return is(DC.class);
    }

    public boolean isDefault() {
        return is(Default.class);
    }

    public boolean isDisplayLcd128x64() {
        return is(DisplayLcd128x64.class);
    }

    public boolean isDisplayLcd20x4() {
        return is(DisplayLcd20x4.class);
    }

    public boolean isDisplaySegment() {
        return is(DisplaySegmentV2.class, DisplaySegment.class);
    }

    public boolean isDistanceIR() {
        return is(DistanceIRV2.class, DistanceIR.class);
    }

    public boolean isDistanceUS() {
        return is(DistanceUS.class);
    }

    public boolean isDualButton() {
        return is(DualButton.class);
    }

    public boolean isHumidity() {
        return is(HumidityV2.class, Humidity.class);
    }

    public boolean isIMU() {
        return is(IMUV2.class, IMU.class);
    }

    public boolean isIO16() {
        return is(IO16V2.class, IO16.class);
    }

    public boolean isLightAmbient() {
        return is(LightAmbientV3.class, LightAmbientV2.class, LightAmbient.class);
    }

    public boolean isLightColor() {
        return is(LightColor.class);
    }

    public boolean isLightUv() {
        return is(LightUvV2.class, LightUv.class);
    }

    public boolean isMaster() {
        return is(Master.class);
    }

    public boolean isMotionDetector() {
        return is(MotionDetectorV2.class, MotionDetector.class);
    }

    public boolean isRotary() {
        return is(RotaryV2.class);
    }

    public boolean isServo() {
        return is(Servo.class);
    }

    public boolean isSoundIntensity() {
        return is(SoundIntensity.class);
    }

    public boolean isSoundPressure() {
        return is(SoundPressure.class);
    }

    public boolean isSpeaker() {
        return is(Speaker.class);
    }

    public boolean isTemperature() {
        return is(TemperatureV2.class, Temperature.class);
    }

    public boolean isTilt() {
        return is(Tilt.class);
    }
}
