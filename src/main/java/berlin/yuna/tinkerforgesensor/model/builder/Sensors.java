package berlin.yuna.tinkerforgesensor.model.builder;

import berlin.yuna.tinkerforgesensor.model.exception.NetworkConnectionException;
import berlin.yuna.tinkerforgesensor.model.sensor.brick.DC;
import berlin.yuna.tinkerforgesensor.model.sensor.brick.IMU;
import berlin.yuna.tinkerforgesensor.model.sensor.brick.IMU2;
import berlin.yuna.tinkerforgesensor.model.sensor.brick.Master;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Accelerometer;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.AccelerometerV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.AirQuality;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Barometer;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.BarometerV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.ButtonRGB;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Default;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.DisplayLcd20x4;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.DisplaySegment;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.DistanceIR;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.DistanceIRV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.DistanceUS;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.DualButton;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Humidity;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.HumidityV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.IO16;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.IO16V2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.LightAmbient;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.LightAmbientV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.LightAmbientV3;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.LightColor;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.LightUv;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.LightUvV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.MotionDetector;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.MotionDetectorV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.RotaryV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Sensor;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.SoundIntensity;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.SoundPressure;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Speaker;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Temperature;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.TemperatureV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Tilt;
import java.lang.Class;
import java.lang.RuntimeException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Autogenerated with [GeneratorSensors:generate]
 */
public class Sensors extends CopyOnWriteArrayList<Sensor> {
    public Sensors() {
    }

    public Sensors(final Collection<? extends Sensor> collection) {
        super(collection);
    }

    public Sensors(final Sensor[] toCopyIn) {
        super(toCopyIn);
    }

    public Sensor tilt() {
        return tilt(0);
    }

    public Sensor tilt(final int number) {
        return getSensor(number, Tilt.class);
    }

    public Sensor temperature() {
        return temperature(0);
    }

    public Sensor temperature(final int number) {
        return getSensor(number, TemperatureV2.class, Temperature.class);
    }

    public Sensor speaker() {
        return speaker(0);
    }

    public Sensor speaker(final int number) {
        return getSensor(number, Speaker.class);
    }

    public Sensor soundPressure() {
        return soundPressure(0);
    }

    public Sensor soundPressure(final int number) {
        return getSensor(number, SoundPressure.class);
    }

    public Sensor soundIntensity() {
        return soundIntensity(0);
    }

    public Sensor soundIntensity(final int number) {
        return getSensor(number, SoundIntensity.class);
    }

    public Sensor rotary() {
        return rotary(0);
    }

    public Sensor rotary(final int number) {
        return getSensor(number, RotaryV2.class);
    }

    public Sensor motionDetector() {
        return motionDetector(0);
    }

    public Sensor motionDetector(final int number) {
        return getSensor(number, MotionDetectorV2.class, MotionDetector.class);
    }

    public Sensor master() {
        return master(0);
    }

    public Sensor master(final int number) {
        return getSensor(number, Master.class);
    }

    public Sensor lightUv() {
        return lightUv(0);
    }

    public Sensor lightUv(final int number) {
        return getSensor(number, LightUvV2.class, LightUv.class);
    }

    public Sensor lightColor() {
        return lightColor(0);
    }

    public Sensor lightColor(final int number) {
        return getSensor(number, LightColor.class);
    }

    public Sensor lightAmbient() {
        return lightAmbient(0);
    }

    public Sensor lightAmbient(final int number) {
        return getSensor(number, LightAmbientV3.class, LightAmbientV2.class, LightAmbient.class);
    }

    public Sensor iO16() {
        return iO16(0);
    }

    public Sensor iO16(final int number) {
        return getSensor(number, IO16V2.class, IO16.class);
    }

    public Sensor iMU2() {
        return iMU2(0);
    }

    public Sensor iMU2(final int number) {
        return getSensor(number, IMU2.class);
    }

    public Sensor iMU() {
        return iMU(0);
    }

    public Sensor iMU(final int number) {
        return getSensor(number, IMU.class);
    }

    public Sensor humidity() {
        return humidity(0);
    }

    public Sensor humidity(final int number) {
        return getSensor(number, HumidityV2.class, Humidity.class);
    }

    public Sensor dualButton() {
        return dualButton(0);
    }

    public Sensor dualButton(final int number) {
        return getSensor(number, DualButton.class);
    }

    public Sensor distanceUS() {
        return distanceUS(0);
    }

    public Sensor distanceUS(final int number) {
        return getSensor(number, DistanceUS.class);
    }

    public Sensor distanceIR() {
        return distanceIR(0);
    }

    public Sensor distanceIR(final int number) {
        return getSensor(number, DistanceIRV2.class, DistanceIR.class);
    }

    public Sensor displaySegment() {
        return displaySegment(0);
    }

    public Sensor displaySegment(final int number) {
        return getSensor(number, DisplaySegment.class);
    }

    public Sensor displayLcd20x4() {
        return displayLcd20x4(0);
    }

    public Sensor displayLcd20x4(final int number) {
        return getSensor(number, DisplayLcd20x4.class);
    }

    public Sensor dC() {
        return dC(0);
    }

    public Sensor dC(final int number) {
        return getSensor(number, DC.class);
    }

    public Sensor buttonRGB() {
        return buttonRGB(0);
    }

    public Sensor buttonRGB(final int number) {
        return getSensor(number, ButtonRGB.class);
    }

    public Sensor barometer() {
        return barometer(0);
    }

    public Sensor barometer(final int number) {
        return getSensor(number, BarometerV2.class, Barometer.class);
    }

    public Sensor airQuality() {
        return airQuality(0);
    }

    public Sensor airQuality(final int number) {
        return getSensor(number, AirQuality.class);
    }

    public Sensor accelerometer() {
        return accelerometer(0);
    }

    public Sensor accelerometer(final int number) {
        return getSensor(number, AccelerometerV2.class, Accelerometer.class);
    }

    public Sensor getDisplay() {
        return getDisplay(0);
    }

    public Sensor getDisplay(final int number) {
        return getSensor(number, DisplayLcd20x4.class, DisplaySegment.class);
    }

    public Sensor getSound() {
        return getSound(0);
    }

    public Sensor getSound(final int number) {
        return getSensor(number, SoundPressure.class, SoundIntensity.class);
    }

    private synchronized List<Sensor> getSensor(final Class... sensorClasses) {
        return stream().filter(sensor -> sensor.compare().is(sensorClasses)).sorted(java.util.Comparator.comparingInt(Sensor::port)).collect(java.util.stream.Collectors.toList());
    }

    private synchronized Sensor getSensor(final int number, final Class... sensorClasses) {
        final List<Sensor> sensors = getSensor(sensorClasses);
        return sensors.size() > number ? sensors.get(number) : getDefaultSensor(sensorClasses[0]);
    }

    private Sensor getDefaultSensor(final Class sensorClass) {
        try {
            return new Default(sensorClass);
        } catch (NetworkConnectionException e) {
            throw new RuntimeException("Default device should not run into an exception", e);
        }
    }
}