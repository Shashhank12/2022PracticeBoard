// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class OnBoardGyro extends SubsystemBase {
  //public ADXRS450_Gyro gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);
  /** Creates a new Gyro. */
  public OnBoardGyro() 
  {
    //double angle = gyro.getAngle();
    //System.out.println(angle);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
