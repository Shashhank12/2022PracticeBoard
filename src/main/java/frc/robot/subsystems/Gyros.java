// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.ADIS16470_IMU;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.ADIS16470_IMU.IMUAxis;

//import edu.wpi.first.wpilibj.ADXRS450_Gyro;
//import edu.wpi.first.wpilibj.AnalogGyro;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Gyros extends SubsystemBase {
  //public ADXRS450_Gyro gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);

  ADIS16470_IMU imu = new ADIS16470_IMU(IMUAxis.kX, SPI.Port.kOnboardCS0, null);
  /** Creates a new Gyro. */
  //AHRS Coolgyro = new AHRS(SPI.Port.kMXP);

  public Gyros() 
  {
    //System.out.println(angle);
  }

  @Override
  public void periodic() 
  {
    System.out.println(imu.getAngle());
    //System.out.println(Coolgyro.getPitch() + ", " + Coolgyro.getRoll() + ", " + Coolgyro.getYaw());
  }
}
